Feature: Symund login feature
  User Story:
  As a user,I should be able to login with correct credentials. And dashboard should be displayed.
  As a user,I should be able to login with uncorrect credentials. And dashboard should be not displayed.

  Background: For the scenerios in the feature file, user is expected to be on login page
    Given user is on the symund login page


  @smoke
  Scenario: Login as Symund valid credentials with click button
    When user enters symund username
    When user enters symund password
    And user click to login button
    Then user should see the dashboard
    Then user verify to url "https://qa.symund.com/index.php/apps/dashboard/"
    Then user click to profile icon
    Then username verify under profile icon as username


  Scenario: Login as Symund valid credentials with enter keyboard
    When user enters symund username
    When user enters symund password and enter
    Then user should see the dashboard
    Then user verify to url "https://qa.symund.com/index.php/apps/dashboard/"
    Then user click to profile icon
    Then username verify under profile icon as username


  Scenario: Login as Symund unvalid username credential
    When user enters symund unvalid username
    When user enters symund unvalid password
    And user click to login button
    Then user should see Wrong username or password


  Scenario: Login as Symund empty username
    When user not enter any username to box
    When user enters symund password
    And user click to login button
    Then verify user should be see Please fill out this line.

  Scenario: Login as Symund empty password
    When user enters symund username
    And user not enter any password to box
    And user click to login button
    Then verify user should be see Please fill out this field.

  @symund
  Scenario: Login as Symund user should see password as dot
    When user enters symund username
    Then user enters symund password
    Then Verify password should see as dot

  Scenario: Login as Symund user click eye and after enter password
    When user enters symund username
    When user click to eye
    Then user enters symund password
    Then user should see the password

  Scenario:Login as Symund user click forget password link
    When user click to Forgot password? link
    Then user should displayed forgot password in page










