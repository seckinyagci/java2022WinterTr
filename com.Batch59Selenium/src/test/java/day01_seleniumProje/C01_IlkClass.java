package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {
        //en ilkel haliyle bir otomasyon yapmak icin classimiza otomasyon icin gerekli olan
        //webdriverin yerini gostermemiz gerekir.
        //bunun icin java kutuphanesinden System.setProperty methodunu kullaniriz
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        driver.get("https://www.facebook.com");
        driver.close();







    }


}
