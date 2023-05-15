import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertTrue;

public class ResetPasswordPage {

    private SelenideElement header = $(byTagName("h6"));

    public void resetPasswordFormIsDisplayed(){
        header.shouldHave(text("Reset Password"));
    }

    public void urlIsCorrect(String expectedText){
     assertTrue(WebDriverRunner.getWebDriver().getCurrentUrl().contains(expectedText));

    }

}
