@stories
Feature: sales force
  @scenario1
  Scenario Outline: Scenario: Probar el login de SalesForce
    Given that leonardo wants to test the SalesForce login
    When  leonardo will enter his username and password
      | strUser   | strPassword |
      | <strUser> | <strPassword>   |
    Then  leonardo has logged

    Examples:
      | strUser                          | strPassword    |
      | ivan-9460895321@industryapps.com | GoIndustries#1 |
      | ivan-9460895321@industryapps.co  | GoIndustries#1 |
      | ivan-9460895321@industryapps.com | GoIndustries   |
      | ivan-9460895321@industryapps.com | GoIndustries   |
    |                                  |                |


