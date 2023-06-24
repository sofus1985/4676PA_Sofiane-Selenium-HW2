package app.pom.homepage.Register;

import app.pom.homepage.Homepage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_New_Account extends BasePage {

    @FindBy(xpath = "//input[@id=\"firstname\"]")
    public WebElement FirstNameInputField;
    @FindBy(xpath = "//input[@id=\"lastname\"]")
    public  WebElement LastNameInputField;
    @FindBy(xpath = "//input[@id=\"email_address\"]")
    public WebElement EmailInputField;
    @FindBy(xpath = "//input[@id=\"password\"]")
    public WebElement PasswordInputField;
    @FindBy(xpath = "//input[@id=\"password-confirmation\"]")
    public WebElement ConfirmPasswordInputField;
    @FindBy(xpath = "//button[@class=\"action submit primary\"]/span")
    public WebElement clickNewAccount;

    public Register_New_Account(){
        PageFactory.initElements(driver, this);
    }

    public void TypeFirstname(String FirstName) {

        sendKeysToElement(FirstNameInputField, FirstName);
    }

    public void TypeLastname(String LastName) {
        sendKeysToElement(LastNameInputField, LastName);

    }
    public void TypeEmail(String Email){
        sendKeysToElement(EmailInputField, Email);

    }
    public void TypePassword(String Password) {
        sendKeysToElement(PasswordInputField, Password);

    }
    public void TypeConfirmPassword(String ConfirmPassword) {
        sendKeysToElement(ConfirmPasswordInputField, ConfirmPassword);

    }

    public Homepage register(String FirstName, String LastName, String Email, String Password, String ConfirmPassword){
     TypeFirstname(FirstName);
     TypeLastname(LastName);
     TypeEmail(Email);
     TypePassword(Password);
     TypeConfirmPassword(ConfirmPassword);
     return new Homepage();
    }
}
