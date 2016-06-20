Feature: Register an Guru account

  @tag1
  Scenario: Register with correct data
    Given I on the login homepage
    When I click create account link
    And I input first name "Pham"
    And I input last name "Trang"
    And I input email "trang@abc.com"
    And I input passwd "123456"
    And I input confirm passwd "123456"
    And I click Register button
    Then I should see welcome message "Hello, Pham Trang!"

  @tag2
  Scenario: Register with the first name is blank
    Given I on the login homepage
    When I click create account link
    And I click Register button
    Then I should see the error message of first name "This is a required field."

  @tag3
  Scenario: Register with the last name is blank
    Given I on the login homepage
    When I click create account link
    And I input first name "Pham"
    And I click Register button
    Then I should see the error message of last name "This is a required field."

  @tag4
  Scenario: Register with the email is blank
    Given I on the login homepage
    When I click create account link
    And I input first name "Pham"
    And I input last name "Trang"
    And I click Register button
    Then I should see the error message of email "This is a required field."

  @tag5
  Scenario: Register with the passwd is blank
    Given I on the login homepage
    When I click create account link
    And I input first name "Pham"
    And I input last name "Trang"
    And I input email register "trang@abc.com"
    And I click Register button
    Then I should see the error message of passwd "This is a required field."

  @tag6
  Scenario: Register with the confirm passwd is blank
    Given I on the login homepage
    When I click create account link
    And I input first name "Pham"
    And I input last name "Trang"
    And I input email register "trang@abc.com"
    And I click Register button
    Then I should see the error message of confirm passwd "This is a required field."

  @tag7
  Scenario: Register with the passwd is invalidation
    Given I on the login homepage
    When I click create account link
    And I input first name "Pham"
    And I input last name "Trang"
    And I input email register "trang@abc.com"
    And I input passwd "123"
    And I click Register button
    Then I should see the error message of validate passwd "Please enter 6 or more characters. Leading or trailing spaces will be ignored."

  @tag8
  Scenario: Register with the confirm passwd is blank
    Given I on the login homepage
    When I click create account link
    And I input first name "Pham"
    And I input last name "Trang"
    And I input email register "trang@abc.com"
    And I input passwd "123456"
    And I click Register button
    Then I should see the error message of confirm passwd "This is a required field."

  @tag9
  Scenario: Register with Non matching passwd
    Given I on the login homepage
    When I click create account link
    And I input first name "Pham"
    And I input last name "Trang"
    And I input email register "trang@abc.com"
    And I input passwd "123456"
    And I input confirm passwd "678"
    And I click Register button
    Then I should see the error message of matching passwd "Please make sure your passwords match."
