import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {

    private SelenideElement sideBarPanel = $(byClassName("oxd-sidepanel-body"));

    @Step("Dashboard page is open")
    public void dashboardPageIsOpen(){

        sideBarPanel.shouldBe(visible, Duration.ofSeconds(30));
    }

}
