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
}
