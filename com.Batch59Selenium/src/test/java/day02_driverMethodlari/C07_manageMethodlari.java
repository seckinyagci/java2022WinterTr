package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_manageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        System.out.println("pencere olculeri: "+driver.manage().window().getSize());
        System.out.println("Pencere konumu: "+driver.manage().window().getPosition());
        //pencerenin konumunu ve buyuklugunu degistirelim
        Thread.sleep(2000);
        driver.manage().window().setPosition(new Point(15,15));
        Thread.sleep(2000);
        driver.manage().window().setSize(new Dimension(900,600));
        System.out.println("Yeni pencere olculeri: "+driver.manage().window().getSize());
        System.out.println("Yeni Pencere konumu: "+driver.manage().window().getPosition());
    }
}
