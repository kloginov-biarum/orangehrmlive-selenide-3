import org.junit.Test;

public class SideBarTest extends BaseTest{

    @Test
    public void linksAreDisplayed(){
        loginPage.successLogin("Admin", "admin123");
        dashboardPage.dashboardPageIsOpen();
        sideBar.adminLinkIsDisplayed();
        sideBar.pimLinkIsDisplayed();
        sideBar.leaveLinkIsDisplayed();
    }

    @Test
    public void sideBarRolled(){
        loginPage.successLogin("Admin", "admin123");
        dashboardPage.dashboardPageIsOpen();
        // click on arrow button
        sideBar.clickOnRollOutButton();
        // side bar rolled out
        sideBar.checkSideBarRolledOut();
    }

    @Test
    public void search1Item(){
        loginPage.successLogin("Admin", "admin123");
        dashboardPage.dashboardPageIsOpen();
        String searchValue = "Admin";
        //Enter value "Admin" to search bar
        sideBar.enterTextToSearchInputField(searchValue);
        //Assert only 1 item in results
        sideBar.oneElementInSideBar();
        //Assert has text "Admin"
        sideBar.correctElementInSideBar(searchValue);
    }



}
