import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.*;

public class SideBar {
    private ElementsCollection sidebarElements = $$(byClassName("oxd-main-menu-item-wrapper"));
    private SelenideElement adminLink = $("[class=\"oxd-main-menu-item-wrapper\"]:nth-child(1)");

    private SelenideElement pimLink = $("[class=\"oxd-main-menu-item-wrapper\"]:nth-child(2)");

    private SelenideElement leaveLink = $("[class=\"oxd-main-menu-item-wrapper\"]:nth-child(3)");

    private SelenideElement timeLink = $("[class=\"oxd-main-menu-item-wrapper\"]:nth-child(4)");

    private SelenideElement recruitment = $("[class=\"oxd-main-menu-item-wrapper\"]:nth-child(5)");

    private SelenideElement rollOutButton = $x("//button [@class='oxd-icon-button oxd-main-menu-button']");

    private SelenideElement sideBarPanel = $(byClassName("oxd-sidepanel"));

    private SelenideElement searchInputField = $x("//input[@placeholder='Search']");



    public void adminLinkIsDisplayed(){
        adminLink.shouldBe(visible);
    }
    public void pimLinkIsDisplayed(){
        pimLink.shouldBe(visible);
    }
    public void leaveLinkIsDisplayed(){
        leaveLink.shouldBe(visible);
    }

    public void clickOnRollOutButton(){
        rollOutButton.shouldBe(enabled, Duration.ofSeconds(10));
        rollOutButton.click();
    }

    public void checkSideBarRolledOut(){
        //class contains "toggled"
        sideBarPanel.shouldHave(attributeMatching("class", ".*toggled.*"));
    }

    public void enterTextToSearchInputField(String searchText){
        searchInputField.shouldBe(enabled);
        searchInputField.setValue(searchText);
    }

    public void oneElementInSideBar(){
        sidebarElements.filterBy(visible).shouldHave(size(1));

    }

    public void correctElementInSideBar(String expectedElementName){
        sidebarElements.get(0).shouldHave(partialText(expectedElementName));
    }




}
