Feature: Login to system

Scenario: Login to system with incorrect data
Given I am on HomePage
When I input my account is "trang@gmail.com"
And I click on Login button
Then I should see alert msg "Hãy nhập mật khẩu của bạn"
