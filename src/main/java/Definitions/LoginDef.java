package Definitions;

import Pages.LandingPage;


public class LoginDef {

    LandingPage hme = new LandingPage();

    public String PositiveLogin() {
        hme.enterValidUserName("user@phptravels.com");
        hme.enterValidPassword("demouser");
        hme.checkRememberMe();
        hme.clickSubmitLogin();
        String ProfileName = hme.getLblProfileName();
        return ProfileName;

    }

    public boolean NegativeLogin() {
        hme.enterValidUserName("user001@phptravels.com");
        hme.enterValidPassword("demouser");
        hme.checkRememberMe();
        hme.clickSubmitLogin();
        boolean waarningResult = hme.checkWarning();
        if (waarningResult = true) {
            //System.out.println("Warning Message appears");
            return true;
        } else {
            //System.out.println("Warning Message Does not appears");
            return false;
        }
    }

    public String Logout() {

        String title = hme.logout();
        return title;
    }
}
