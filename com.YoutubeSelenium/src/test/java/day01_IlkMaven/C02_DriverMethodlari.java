package day01_IlkMaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        System.out.println("Sayfa basligi: "+driver.getTitle());
        System.out.println("Sayfa Url'i: "+driver.getCurrentUrl());
        System.out.println("=================================================");
        //System.out.println("Sayfa kaynak kodlari: "+driver.getPageSource());
        System.out.println("=================================================");
        System.out.println("Sayfa kaynak handle degeri "+driver.getWindowHandle());
        driver.quit();




    }
}
