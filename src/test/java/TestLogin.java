import Definitions.LoginDef;
import Pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestLogin {

    LandingPage hme = new LandingPage();
    LoginDef defLogin = new LoginDef();

    @BeforeTest
    public void Navigation() {
        hme.initDriver("https://www.phptravels.net");
    }

    @Test(priority = 1)
    public void PositiveLogin() {
        String ProfileName = defLogin.PositiveLogin();
        SoftAssert softAssertion = new SoftAssert();
        softAssertion.assertEquals("Hi, Demo User", hme.getLblProfileName());

    }

    @Test(priority = 2)
    public void LogOut() {

        String title = defLogin.Logout();
        SoftAssert softAssertion = new SoftAssert();
        softAssertion.assertEquals("Login", title);

    }


    @Test(priority = 3)
    public void NegativeLogin() {

        Assert.assertTrue(defLogin.NegativeLogin());

    }


}
