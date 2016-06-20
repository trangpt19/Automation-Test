Feature: Login to Guru system

  Scenario: Login with blank email
    Given I on the login homepage
    When I click on account button
    And I click on LOGIN item
    And I input password "abc"
    And I click on Login guru button
    Then I should see alert message of email "This is a required field."

  Scenario: Login with blank passwd
    Given I on the login homepage
    When I click on account button
    And I click on LOGIN item
    And I input email "trang@abc.com"
    And I click on Login guru button
    Then I should see alert message of passwd "This is a required field."

  Scenario: Login with validation account
    Given I on the login homepage
    When I click on account button
    And I click on LOGIN item
    And I input email "trang@abc.com"
    And I input password "123456"
    And I click on Login guru button
    Then I should see welcome message "Hello, Pham Trang!"
