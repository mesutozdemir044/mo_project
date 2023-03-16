package com.symund.step_definitions;

import com.symund.pages.LoginPage;
import com.symund.utulities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class valid_definitions {

    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("user is on the symund login page")
    public void user_is_on_the_symund_login_page() {
        Driver.getDriver().get("https://qa.symund.com/index.php/login?clear=1");
    }

    @When("user enters symund username")
    public void user_enters_symund_username() {
        loginPage.username.sendKeys("Employee170");
    }

    @When("user enters symund password")
    public void user_enters_symund_password() {
        loginPage.password.sendKeys("Employee123");
    }

    @When("user click to login button")
    public void user_click_to_login_button() {
        loginPage.click.click();
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        wait.until(ExpectedConditions.titleIs(Driver.getDriver().getTitle()));
        String actual=Driver.getDriver().getTitle();
        String expected="Pano - Symund - QA";
        Assert.assertTrue(actual.contains(expected));
    }

    @Then("user verify to url {string}")
    public void user_verify_to_url(String url) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = url;
        Assert.assertEquals(expectedUrl, actualUrl);

    }


    @Then("user click to profile icon")
    public void userClickToProfileIcon() {
        loginPage.profilIcon.click();
    }

    @Then("username verify under profile icon as username")
    public void usernameVerifyUnderProfileIconAsUsername() {
        String expectedProfilName = "Employee170";
        String actualProfilName = loginPage.profilIconVerify.getText();
        Assert.assertEquals(expectedProfilName, actualProfilName);
    }

    @When("user enters symund password and enter")
    public void userEntersSymundPasswordAndEnter() {
        loginPage.password.sendKeys("Employee123", Keys.ENTER);
    }

    @When("user enters symund unvalid username")
    public void userEntersSymundUnvalidUsername() {
        loginPage.username.sendKeys("EmployeeABC");
    }

    @When("user enters symund unvalid password")
    public void userEntersSymundValidPassword() {
        loginPage.password.sendKeys("1234");
    }

    @Then("user should see Wrong username or password")
    public void userShouldSeeWrongUsernameOrPassword() {
        String expectedWrongMessage = "Wrong username or password.";
        String actualWrongMessage = loginPage.WrongMessage.getText();
        Assert.assertEquals(expectedWrongMessage, actualWrongMessage);
    }

    @When("user not enter any username to box")
    public void userNotEnterAnyUsernameToBox() {
        String expectedUserBox = "Username or email";
        String actualUserBox = loginPage.username.getAttribute("placeholder");
        Assert.assertEquals(expectedUserBox, actualUserBox);

    }

    @Then("verify user should be see Please fill out this line.")
    public void verifyUserShouldBeSeePleaseFillOutThisLine() {
        String actualAlertText = loginPage.username.getAttribute("validationMessage");
        String expectedAlertText = "Please fill out this field.";
        System.out.println(actualAlertText);
        Assert.assertEquals(expectedAlertText, actualAlertText);
    }

    @And("user not enter any password to box")
    public void userNotEnterAnyPasswordToBox() {
        String expectedPasswordbox = "Password";
        String actualPasswordBox = loginPage.password.getAttribute("placeholder");
        Assert.assertEquals(expectedPasswordbox, actualPasswordBox);
    }

    @Then("verify user should be see Please fill out this field.")
    public void verifyUserShouldBeSeePleaseFillOutThisField() {
        String actualMessagePassword = loginPage.password.getAttribute("validationMessage");
        String expectedMessagePassword = "Please fill out this field.";
        Assert.assertEquals(expectedMessagePassword, actualMessagePassword);
        System.out.println(actualMessagePassword);
    }

    @Then("Verify password should see as dot")
    public void verifyPasswordShouldSeeAsDot() {
        String expected = "password";
        String actual = loginPage.password.getAttribute("type");
        System.out.println(actual);
        Assert.assertEquals(expected, actual);

    }

    @When("user click to eye")
    public void userClickToEye() {
        loginPage.passwordEye.click();

    }

    @Then("user should see the password")
    public void userShouldSeeThePassword() {
        String expected = "Employee123";
        String actual = loginPage.password.getAttribute("value");
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @When("user click to Forgot password? link")
    public void userClickToForgotPasswordLink() {
        loginPage.forgotPassword.click();
    }

    @Then("user should displayed forgot password in page")
    public void userShouldDisplayedForgotPasswordInPage() {
        boolean forgotPasswordDisplayed = loginPage.forgotPassword.isDisplayed();
        System.out.println(forgotPasswordDisplayed);
    }

    @Then("user should see Reset password")
    public void userShouldSeeResetPassword() {
        String actualReset = loginPage.resetPassword.getAttribute("value");
        String expectReset="Reset password";
        Assert.assertEquals(expectReset,actualReset);
    }

    @When("user take username placeholder")
    public void userTakeUsernamePlaceholder() {
        String actualusernamePlaceholder = loginPage.username.getAttribute("placeholder");
        String expectedPlaceholder="Username or email";
        Assert.assertEquals("it is very good working",expectedPlaceholder,actualusernamePlaceholder);

    }

    @Then("user take password placeholder")
    public void userTakePasswordPlaceholder() {
        String actualPasswordplaceholder = loginPage.password.getAttribute("placeholder");
        String expectedPasswordPlaceholder="Password";
        Assert.assertEquals(expectedPasswordPlaceholder,actualPasswordplaceholder);

    }
}