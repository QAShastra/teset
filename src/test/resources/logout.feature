
  @tag
  Feature: logOut function for Orange HRM Application


    Scenario: Verify the logOut functionality with Valid credentials
      Given  open the Browser and Load the Login page url
      When   user click on logout button
      Then   verify the logout profile name and baseurl contains dashboard