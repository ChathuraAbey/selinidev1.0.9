package Pages;

import org.openqa.selenium.By;

import java.security.PublicKey;

import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {

    String btnsignUp = "//*[@id=\"header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[2]";
    String txtFname = "//*[@id=\"headersignupform\"]/div[3]/div[1]/div/label/input";
    String txtLname = "//*[@id=\"headersignupform\"]/div[3]/div[2]/div/label/input";
    String txtEmail = "//*[@id=\"headersignupform\"]/div[5]/label/input";
    String txtMobile = "//*[@id=\"headersignupform\"]/div[4]/label/input";
    String txtPassWord = "//*[@id=\"headersignupform\"]/div[6]/label/input";
    String txtConformPassword = "//*[@id=\"headersignupform\"]/div[7]/label/input\n";
    String btnRegister="//*[@id=\"headersignupform\"]/div[8]/button";
    String txtPrfileName="/html/body/div[2]/div[1]/div[1]/div/div/div[1]/div/div[2]/h3";

    public void navigateRegistration() {
        $(By.xpath("//*[@id=\"header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div")).click();
        $(By.xpath(btnsignUp)).click();
    }

    public void enterFname(String Fname) {
        $(By.xpath(txtFname)).setValue(Fname);
    }

    public void enterLName(String Lname) {
        $(By.xpath(txtLname)).setValue(Lname);
    }

    public void enterMobile(String Mobile) {
        $(By.xpath(txtMobile)).setValue(Mobile);

    }

    public void enterEmail(String Email) {
        $(By.xpath(txtEmail)).setValue(Email);
    }

    public void enterPassWord(String PassWord) {
        $(By.xpath(txtPassWord)).setValue(PassWord);
    }


    public void enterConfirmPassWord(String PassWord) {
        $(By.xpath(txtConformPassword)).setValue(PassWord);
    }

    public void submitRegisteration() {
        $(By.xpath(btnRegister)).click();
    }

    public String verifyProfile(){
        String ProfileName=$(By.xpath(txtPrfileName)).getText().toString();
        return ProfileName;
    }



}
