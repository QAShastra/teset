
  @tag
  Feature: Login function for Orange HRM Application


    Scenario: Verify the Register functionality with Valid credentials
      Given  open the Browser and Load the Login page url
      When   user enters valid username
      When   user enters Email Addrs
      When   user enters valid password
      When   user click on register button
      Then   verify the login profile name and baseurl contains dashboard