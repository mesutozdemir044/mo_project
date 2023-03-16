@SYMU10-383
Feature: Symund login feature
  User Story:
  As a user,I should be able to login with correct credentials. And dashboard should be displayed.
  As a user,I should be able to login with uncorrect credentials. And dashboard should be not displayed.

  Background: For the scenerios in the feature file, user is expected to be on login page
    Given user is on the symund login page


  @SYMU10-363
  Scenario: Login as Symund valid credentials with click button
    When user enters symund username
    When user enters symund password
    And user click to login button
    Then user should see the dashboard

  @SYMU10-364
  Scenario: Login as Symund valid credentials with enter keyboard
    When user enters symund username
    When user enters symund password and enter
    Then user should see the dashboard

  @SYMU10-365
  Scenario: Login as Symund verify dashboard profile icon and url
    When user enters symund username
    When user enters symund password
    And user click to login button
    Then user verify to url "https://qa.symund.com/index.php/apps/dashboard/"
    Then user click to profile icon
    Then username verify under profile icon as username

  @SYMU10-366
  Scenario: Login as Symund unvalid username credential
    When user enters symund unvalid username
    When user enters symund unvalid password
    And user click to login button
    Then user should see Wrong username or password

  @SYMU10-369
  Scenario: Login as Symund empty username and password
    When user not enter any username to box
    And user not enter any password to box
    And user click to login button
    Then verify user should be see Please fill out this line.

  @SYMU10-371
  Scenario: Login as Symund empty username or password
    When user not enter any username to box
    When user enters symund password
    And user click to login button

  @SYMU10-367
  Scenario: Login as Symund empty username
    When user not enter any username to box
    When user enters symund password
    And user click to login button
    Then verify user should be see Please fill out this line.

  @SYMU10-368
  Scenario: Login as Symund empty password
    When user enters symund username
    And user not enter any password to box
    And user click to login button
    Then verify user should be see Please fill out this field.

  @SYMU10-372
  Scenario: Login as Symund user should see password as dot
    When user enters symund username
    Then user enters symund password
    Then Verify password should see as dot

  @SYMU10-374
  Scenario: Login as Symund user click eye
    When user enters symund username
    Then user enters symund password
    When user click to eye

  @SYMU10-373
  Scenario: Login as Symund user click eye and after enter password
    When user enters symund username
    Then user enters symund password
    When user click to eye
    Then user should see the password

  @SYMU10-375
  Scenario: Login as Symund user click forget password link
    When user click to Forgot password? link
    Then user should displayed forgot password in page

  @SYMU10-376
  Scenario: Login as Symund user should see Reset password
    When user click to Forgot password? link
    Then user should see Reset password

  @SYMU10-382
  Scenario: Login as Symund and verify placeholders
    When user take username placeholder
    Then user take password placeholder









