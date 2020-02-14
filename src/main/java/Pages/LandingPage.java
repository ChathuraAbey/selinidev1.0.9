package Pages;


import Utill.DriverManager;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LandingPage implements DriverManager {

    DriverManager driver;
    private String txtusername = "//*[@id=\"loginfrm\"]/div[3]/div[1]/label/input";
    private String txtPassword = "//*[@id=\"loginfrm\"]/div[3]/div[2]/label/input";
    private String lblWarningInvalidCredentils = "//*[@id=\"loginfrm\"]/div[1]/div";
    private String btnSubmit="//*[@id=\"loginfrm\"]/button";
    private String checkRememberMe="//*[@id=\"loginfrm\"]/div[3]/div[2]/label/input";
    private String lblProfileName="/html/body/div[2]/div[1]/div[1]/div/div/div[1]/div/div[2]/h3";
    private String lblPageTitle="/html/head/title";

    @Override
    public void initDriver(String BaseUrl) {
        open(BaseUrl);
    }

    public void enterValidUserName(String userName) {
        $(By.xpath("//*[@id=\"header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div")).click();
        $(By.xpath("//*[@id=\"header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[1]")).click();
        $(By.xpath(txtusername)).setValue(userName);

    }

    public void enterValidPassword(String passWord) {
        $(By.xpath(txtPassword)).setValue(passWord);

    }

    public void clickSubmitLogin() {
        $(By.xpath(btnSubmit)).click();
    }

    public void checkRememberMe() {
        $(By.xpath(checkRememberMe)).click();
    }


    public String getLblProfileName() {
        String UserProfile = $(By.xpath(lblProfileName)).getText().toString();
        return UserProfile;
    }

    public boolean checkWarning() {

        return $(By.xpath(lblWarningInvalidCredentils)).isDisplayed();
    }


    public String logout() {
        $(By.xpath("//*[@id=\"header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div")).click();
        $(By.xpath("//*[@id=\"header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[2]")).click();
        String title = $(By.xpath(lblPageTitle)).innerText().toString();
        return title;
    }

}

