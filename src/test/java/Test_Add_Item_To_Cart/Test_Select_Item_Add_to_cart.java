package Test_Add_Item_To_Cart;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import java.time.Duration;

public class Test_Select_Item_Add_to_cart {


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

        WebElement inputSearchBar = driver.findElement(By.xpath("//input[@id=\"search\"]"));
        inputSearchBar.sendKeys("watch");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));



        WebElement clickIconSearch = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        clickIconSearch.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        WebElement clickWatchDidiSportWatch= driver.findElement(By.xpath("//img[@alt=\"Didi Sport Watch\"]"));
        clickWatchDidiSportWatch.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        WebElement clickAddItemWatchDidiSportWatch = driver.findElement(By.xpath("//button[@id=\"product-addtocart-button\"]/span[1]"));
        clickAddItemWatchDidiSportWatch.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
        WebElement clickIconCart = driver.findElement(By.xpath("//a[@class=\"action showcart\"]"));
        clickIconCart.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.close();


    }

}
