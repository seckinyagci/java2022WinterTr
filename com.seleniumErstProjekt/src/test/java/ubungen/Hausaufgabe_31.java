package ubungen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hausaufgabe_31 {
    /*
    1.Yeni bir class olusturalim (Homework)





    8. Sayfayi tam sayfa (maximize) yapin
    9.Browser’i kapatin
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title)
        //“facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
        String actualTitle= driver.getTitle();
        String expectedTitle="facebook";
       if(actualTitle.contains(expectedTitle)){
           System.out.println("Baslik Kontrol Testi PASSED");
       }else{
           System.out.println("Baslik Kontrol Testi FAIL!!!\nActual Baslik: "+actualTitle);
       }

       //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="facebook";

        if(actualUrl.contains(expectedUrl)){
            System.out.println("URL Kontrol Testi PASSED");
        }else{
            System.out.println("URL Kontrol Testi FAIL!!!\n actual URL: "+actualUrl);
        }
        // 4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");
        //    5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        System.out.println(driver.getTitle().contains("Walmart.com")? "Sayfa basligi Walmart.com icermektedir":
                "Sayfa basligi Walmart.com icermemektedir!!!");
        //    6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        // 7. Sayfayi yenileyin
        driver.navigate().refresh();




       driver.close();


    }

}
