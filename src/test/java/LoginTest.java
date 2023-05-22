import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static com.codeborne.selenide.Selenide.*;

public class LoginTest extends BaseTest{
    @Category(Smoke.class)
    @Test @Description("Success login with valid data")
    public void successLogin(){
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        dashboardPage.dashboardPageIsOpen();
    }

     @Description("Unsuccessful login. Invalid password")
    public void invalidPassword(){
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin1235235e325e53");
        loginPage.clickOnLoginButton();
        // check error message text is "Invalid credentials"
        loginPage.checkTextErrorMessage("Invalid credentials");
    }

  @Description("Unsuccessful login. Empty fields")
    public void emptyFields(){
        loginPage.clickOnLoginButton();
        loginPage.checkMessageTextEmptyUsername("Required");
        loginPage.checkMessageTextEmptyPassword("Required");
    }

    //Forgot password
    @Test
    public void forgotPassword(){
        loginPage.clickOnForgotPasswordLink();
        resetPasswordPage.resetPasswordFormIsDisplayed();
        resetPasswordPage.urlIsCorrect("requestPasswordResetCode");
    }

    @Test
    public void elementsAreDisplayed(){
        //1. logo
        loginPage.logoIsDisplayed();
        loginPage.logoImageIsCorrect();
        //2. Credentionals section
        loginPage.credentionalsSectionIsDisplayed();
        //3. Social network links
        loginPage.linkedInLinkIsDisplayed();
        loginPage.facebookLinkIsDisplayed();
        loginPage.twitterLinkIsDisplayed();
        loginPage.youtubeLinkIsDisplayed();
    }

    @Test
    public void linksAreCorrect(){
        loginPage.clickOnLinkedInLink();
        linkedInPage.linkedInPageIsOpen();
    }

}
