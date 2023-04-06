package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterStepDefinition {
    WebDriver driver;

    @Given("User able to open browser")
    public void user_able_to_open_browser() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Given("Enter Url")
    public void enter_url() {
        driver.get("https://demo.nopcommerce.com/");

    }

    @When("User Click on Register Link")
    public void user_click_on_register_link() {
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();

    }





    @Then("User select gender and Enter personal details, company details and email, password then click on Register button")
    public void user_select_gender_and_enter_personal_details_company_details_and_email_password_then_click_on_register_button() {
        driver.findElement(By.id("gender-female")).sendKeys("select female");
        driver.findElement(By.id("FirstName")).sendKeys("Software");
        driver.findElement(By.id("LastName")).sendKeys("Tester");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).sendKeys("12");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")).sendKeys("8");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")).sendKeys("1990");
        driver.findElement(By.id("Email")).sendKeys("Software_Tester@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("Unify");
        driver.findElement(By.id("Newsletter")).click();
        driver.findElement(By.id("Password")).sendKeys("12345");
        driver.findElement(By.id("Password")).sendKeys("12345");
        driver.findElement(By.id("register-button")).click();


    }

    @Then("User will be on Register page")
    public void user_will_be_on_register_page() {

    }

    @Then("User close the browser")
    public void user_close_the_browser() {
        driver.quit();

    }
}