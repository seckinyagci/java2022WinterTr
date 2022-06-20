package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_Navigator {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //amazona gidelim 2 sn bekleyelim
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);
        //facebooka gidelim 2 sn bekleyelim
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        //amazona geri donelim
        driver.navigate().back();
        Thread.sleep(2000);
        //facebooka geri gidelim
        driver.navigate().forward();
        Thread.sleep(2000);
        //amazona geri donelim
        driver.navigate().back();
        Thread.sleep(2000);
        //refresh yapalim
        driver.navigate().refresh();
        driver.close();


    }
}
