package app.pom.homepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Homepage extends BasePage {

    @FindBy (xpath = "//a[@href='https://magento.softwaretestingboard.com/']")
    public WebElement logo;
    @FindBy (xpath = "//ul[@class= \"header links\"]/li[3]/a")
    public WebElement createAnAccountButton;
    public Homepage(){
        PageFactory.initElements(driver, this);
    }

    public Homepage CreateANewAccount() {
    clickOnElement(createAnAccountButton);
    return new Homepage();
    }


}
