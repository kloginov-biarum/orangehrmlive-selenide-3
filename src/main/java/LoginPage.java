import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    private SelenideElement usernameField = $(byName("username"));

    private SelenideElement passwordField = $(byCssSelector("[name='password']"));

    private SelenideElement loginButton = $(byAttribute("type","submit"));

    private SelenideElement errorMessage = $x("//p [@class='oxd-text oxd-text--p oxd-alert-content-text']");

    private SelenideElement usernameRequiredMessage =
            $x("(//span[contains(@class, 'oxd-input-field-error-message')])[1]");

    private SelenideElement passwordRequiredMessage =
            $x("(//span[contains(@class, 'oxd-input-field-error-message')])[2]");


    private SelenideElement forgotPssswordLink = $x("//div[@class='orangehrm-login-forgot']");

    private SelenideElement logo = $(byAttribute("alt", "company-branding"));

    private SelenideElement credentionalsSection = $(byClassName("orangehrm-demo-credentials"));


    private SelenideElement linkedInLink = $("[href*='linkedin']");

    private SelenideElement facebookLink = $("[href*='facebook']");

    private SelenideElement twitterLink = $("[href*='twitter']");

    private SelenideElement youtubeLink = $("[href*='youtube']");
    @Step("Enter value to username field")
    public void enterUsername(String usernameValue){
        usernameField.shouldBe(visible, Duration.ofSeconds(10));
        usernameField.setValue(usernameValue);
    }

    @Step("Enter value to password field")
    public void enterPassword(String passwordValue){
        passwordField.shouldBe(visible, Duration.ofSeconds(10));
        passwordField.setValue(passwordValue);
    }

    @Step("Push login button")
    public void clickOnLoginButton(){
        loginButton.shouldBe(enabled);
        loginButton.click();
    }

    public void checkTextErrorMessage(String errorTextValue){
        errorMessage.shouldBe(visible);
        errorMessage.shouldHave(text(errorTextValue));
    }

    public void checkMessageTextEmptyUsername(String expectedText){
        usernameRequiredMessage.shouldBe(visible);
        usernameRequiredMessage.shouldHave(text(expectedText));
    }

    public void checkMessageTextEmptyPassword(String expectedText){
        passwordRequiredMessage.shouldBe(visible);
        passwordRequiredMessage.shouldHave(text(expectedText));
    }

    public void clickOnForgotPasswordLink(){
        forgotPssswordLink.click();
    }

    public void logoIsDisplayed(){
        logo.shouldBe(visible, Duration.ofSeconds(10));
    }

    public void logoImageIsCorrect(){
        logo.shouldHave(attributeMatching("src",
                ".*branding.png.*"));
    }

    public void credentionalsSectionIsDisplayed(){
        credentionalsSection.shouldBe(visible);
    }

    public void linkedInLinkIsDisplayed(){
        linkedInLink.shouldBe(visible);
    }

    public void clickOnLinkedInLink(){
        linkedInLink.shouldBe(enabled);
        linkedInLink.click();
    }

    public void facebookLinkIsDisplayed(){
        facebookLink.shouldBe(visible);
    }
    public void twitterLinkIsDisplayed(){
        twitterLink.shouldBe(visible);
    }
    public void youtubeLinkIsDisplayed(){
        youtubeLink.shouldBe(visible);
    }

    public void successLogin(String usernameValue, String passwordValue){
        usernameField.shouldBe(visible, Duration.ofSeconds(10));
        usernameField.setValue(usernameValue);
        passwordField.shouldBe(visible);
        passwordField.setValue(passwordValue);
        loginButton.shouldBe(enabled);
        loginButton.click();
    }
}
