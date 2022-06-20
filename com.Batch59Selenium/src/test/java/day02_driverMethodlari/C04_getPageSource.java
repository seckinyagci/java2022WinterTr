package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPageSource {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        String sayfaKaynakKodlari= driver.getPageSource();
        String arananKelime="Free shipping on millions of items";
        if (sayfaKaynakKodlari.contains(arananKelime)){
            System.out.println("Kaynak kodu testi PASS");
        }else{
            System.out.println("Kaynak kodu testi FAIL");
        }
    }
}
