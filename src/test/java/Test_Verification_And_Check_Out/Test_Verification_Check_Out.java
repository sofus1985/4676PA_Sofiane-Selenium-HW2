package Test_Verification_And_Check_Out;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class Test_Verification_Check_Out {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sofiane\\IdeaProjects\\MavenSofiane\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


        WebElement clickSignIn = driver.findElement(By.xpath("//li [@class=\"authorization-link\"]/a"));
        clickSignIn.click();


        WebElement enterEmail = driver.findElement(By.xpath("//input[@id=\"email\"]"));
        enterEmail.sendKeys("stiveatom15@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement enterPassWord = driver.findElement(By.xpath("//input[@title=\"Password\"]"));
        enterPassWord.sendKeys("luma1985?");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement clickSignInToMyAccount = driver.findElement(By.xpath("//button[@id=\"send2\"]/span[1]"));
        clickSignInToMyAccount.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));




        WebElement clickIconCart = driver.findElement(By.xpath("//span[@class=\"counter-number\"]"));
        clickIconCart.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80000));

        WebElement proceedCheckOut = driver.findElement(By.xpath("//button[@id=\"top-cart-btn-checkout\"]"));
        proceedCheckOut.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80000));

        WebElement clickButtonNext = driver.findElement(By.xpath("//span[@data-bind=\"i18n: 'Next'\"]"));
        clickButtonNext.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80000));

        WebElement clickPlaceOrder = driver.findElement(By.xpath("//button[@class=\"action primary checkout\"]/span"));
        clickPlaceOrder.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));






        driver.close();




    }
}