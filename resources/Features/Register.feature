Feature: Nopcommerce Register
  Background:
    Given User able to open browser
    And Enter Url

  Scenario: NopCommerce Valid Register Test
    When User Click on Register Link
    Then User select gender and Enter personal details, company details and email, password then click on Register button
    Then User will be on Register page
    And User close the browser