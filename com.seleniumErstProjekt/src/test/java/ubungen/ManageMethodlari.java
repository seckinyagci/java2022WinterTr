package ubungen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver");
        /* WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com");
        WebElement arama=driver.findElement(By.id("twotabsearchtextbox"));
        arama.sendKeys("iphone");
        WebElement search= driver.findElement(By.id("nav-search-submit-button"));
        search.click();
        driver.close();*/
        WebDriver driver=new ChromeDriver();
        driver.get("http://a.testaddressbook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement singInLink = driver.findElement(By.linkText("Sign in"));
        singInLink.click();
        WebElement mailAdresi= driver.findElement(By.name("session[email]"));
        mailAdresi.sendKeys("testtechproed@gmail.com");
        WebElement sifre= driver.findElement(By.name("session[password]"));
        sifre.sendKeys("Test1234!");
        WebElement giris=driver.findElement(By.name("commit"));
        giris.click();




    }

}
