
Feature: Login Feature
 
  Scenario: Login the CRM application with valid Credential
    Given  when user launch the browser
    When Users open url 
    And Enter "Username" in Username textfield
    And Enter "Password" in password textfield
    And I click on Login button
    Then I validate the Homepage 
    


  