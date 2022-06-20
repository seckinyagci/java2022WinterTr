package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
         WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
         aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
       // WebElement sendKeys= driver.findElement(By.id("nav-search-field"));
       // sendKeys.sendKeys("Nutella"+ Keys.ENTER);




    }

}
