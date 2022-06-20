package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {
        /*
        1-https://www.amazon.com url'ine gidin
        2-basligin amazon kelimesi icerdigini test edin
        3-url'in https://www.amazon.com esit oldugunu test edin
        4-sayfayi kapatin
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
           /*
        1-https://www.amazon.com url'ine gidin
        */
        driver.get("https://www.amazon.com");
        //2-basligin amazon kelimesi icerdigini test edin
        System.out.println(driver.getTitle().contains("Amazon"));
        String arananKelime="Amazon";
        if (driver.getTitle().contains(arananKelime)){
            System.out.println("Title "+arananKelime+"'yi iceriyor");
        }else{
            System.out.println("Title "+arananKelime+"'yi icermiyor");
        }
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com";
        if(actualUrl.equals(expectedUrl)){
            System.out.println("Url testi PASSED");
        }else{
            System.out.println("Actual URL :"+driver.getCurrentUrl()+ "\nUrl testi Fail");
        }
        //3-url'in https://www.amazon.com esit oldugunu test edin
        //4-sayfayi kapatin


    }

}
