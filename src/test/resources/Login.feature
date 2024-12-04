
  @tag
  Feature: Login function for Orange HRM Application


    Scenario: Verify the Login functionality with Valid credentials
      Given  open the Browser and Load the Login page url
      When   user enters valid username
      When   user enters valid password
      When   user click on login button
      Then   verify the login profile name and baseurl contains dashboard