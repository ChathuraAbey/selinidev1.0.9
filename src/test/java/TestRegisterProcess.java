import Pages.RegisterPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestRegisterProcess {

    RegisterPage rg = new RegisterPage();

    @Test
    public void userRegistration() {

        rg.navigateRegistration();
        rg.enterFname("Chthura");
        rg.enterLName("Abeywickrama");
        rg.enterMobile("+94716020023");
        rg.enterEmail("chathura004@gmail.com");
        rg.enterPassWord("Aet@1234");
        rg.enterConfirmPassWord("Aet@1234");
        rg.submitRegisteration();
        SoftAssert softAssertion = new SoftAssert();
        softAssertion.assertEquals("Chathura Abeywickra,a", rg.verifyProfile());

    }
}
