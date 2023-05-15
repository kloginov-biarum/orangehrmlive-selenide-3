import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertTrue;

public class LinkedInPage {
    private SelenideElement header = $(byTagName("h1"));

    public void linkedInPageIsOpen(){
        switchTo().window(1, Duration.ofSeconds(5));
       // header.shouldHave(Condition.partialText("LinkedIn"));
        System.out.println(WebDriverRunner.getWebDriver().getCurrentUrl());
        assertTrue(WebDriverRunner.getWebDriver().getCurrentUrl().contains("linkedin.com"));
    }
}
