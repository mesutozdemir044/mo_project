@SYMU10-399
Feature: Symund Log out

  Background: login page of profil part
    Given user is on the symund login page
@SYMU10-397
  Scenario: log out to page
    When login page Symund profil section
    When user click to profile icon
    Then user click to log out
    Then verify log out page
@SYMU10-398
  Scenario: Click to back space
    When user click to back icon
    Then verify go to login page
