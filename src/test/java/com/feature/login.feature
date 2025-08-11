Feature: User Login Functionality
Scenario: Login with valid credentials
 Given I am on the login page
 When I enter a valid username 'Admin'
 And I enter a valid password 'admin123'
 And I click the 'Login' button
 Then I should be redirected to the dashboard page
 And I should validate with page title 'OrangeHRM'
 Then Close the browser