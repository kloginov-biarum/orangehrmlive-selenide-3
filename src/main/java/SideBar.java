import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class SideBar {

    private SelenideElement adminLink = $("[class=\"oxd-main-menu-item-wrapper\"]:nth-child(1)");

    private SelenideElement pimLink = $("[class=\"oxd-main-menu-item-wrapper\"]:nth-child(2)");

    private SelenideElement leaveLink = $("[class=\"oxd-main-menu-item-wrapper\"]:nth-child(3)");

    private SelenideElement timeLink = $("[class=\"oxd-main-menu-item-wrapper\"]:nth-child(4)");

    private SelenideElement recruitment = $("[class=\"oxd-main-menu-item-wrapper\"]:nth-child(5)");

    public void adminLinkIsDisplayed(){
        adminLink.shouldBe(visible);
    }
    public void pimLinkIsDisplayed(){
        pimLink.shouldBe(visible);
    }
    public void leaveLinkIsDisplayed(){
        leaveLink.shouldBe(visible);
    }



}
