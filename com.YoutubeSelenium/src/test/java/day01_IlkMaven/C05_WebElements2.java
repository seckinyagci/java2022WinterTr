package day01_IlkMaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_WebElements2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//*[@id=\"u_0_l_e8\"]")).sendKeys(Keys.ENTER);
        WebElement epostaKutusu=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
        epostaKutusu.sendKeys("seckin@hotmail.com.tr", Keys.TAB);
        WebElement sifreKutusu= driver.findElement(By.xpath("//input[@type='password']"));
        sifreKutusu.sendKeys("qq12EEr4",Keys.ENTER);
        WebElement basarisizGiris=driver.findElement(By.name("_9ay7"));
    }
}
