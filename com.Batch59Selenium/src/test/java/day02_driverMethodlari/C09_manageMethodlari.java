package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
        /*
        ilerde wait konusunu daha genis olarak ele alacagiz
        bir sayfa acilirken ilk basta sayfanin icerisinde bulunan elemntlere gore bir
        yuklenme suresine ihtiyac vardir.
        veya bir web elementinin kullanilabilmesi icin zamana ihtiyac olabilir
        implicitlyWait bize sayfanin yuklenmesi ve
        sayfadaki elementlere ulasim icin beklenecek maksimum sure olanagi tanir
        sayfa yuklenince maximum sure kadar beklemez. sleepten farki budur
         */
        driver.close();
    }
}
