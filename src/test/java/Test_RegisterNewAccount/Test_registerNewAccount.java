package Test_RegisterNewAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Test_registerNewAccount {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sofiane\\IdeaProjects\\MavenSofiane\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();

        WebElement clickSignUp = driver.findElement(By.xpath("//ul[@class= \"header links\"]/li[3]/a"));
        clickSignUp.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement inputFirstname = driver.findElement(By.xpath("//input[@id=\"firstname\"]"));
        inputFirstname.sendKeys("stive");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement inputLastname = driver.findElement(By.xpath("//input[@id=\"lastname\"]"));
        inputLastname.sendKeys("atom");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement inputEmail = driver.findElement(By.xpath("//input[@id=\"email_address\"]"));
        inputEmail.sendKeys("stiveatom15@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement inputPassword = driver.findElement(By.xpath("//input[@id=\"password\"]"));
        inputPassword.sendKeys("luma1985?");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement inputConfirmPassword = driver.findElement(By.xpath("//input[@id=\"password-confirmation\"]"));
        inputConfirmPassword.sendKeys("luma1985?");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

        WebElement clickCreateNewAccount = driver.findElement(By.xpath("//button[@class=\"action submit primary\"]/span"));
        clickCreateNewAccount.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.close();











    }



}
