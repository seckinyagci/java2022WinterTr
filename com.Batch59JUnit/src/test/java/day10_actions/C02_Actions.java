package day10_actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_Actions extends TestBase {
    /*
    1- Yeni bir class olusturalim: MouseActions1
    2- https://the-internet.herokuapp.com/context_menu sitesine gidelim
    3- Cizili alan uzerinde sag click yapalim
    4- Alert’te cikan yazinin “You selected a context menu” oldugunu
        test edelim.
    5- Tamam diyerek alert’i kapatalim
    6- Elemental Selenium linkine tiklayalim
    7- Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim

     */

    @Test
    public void test01() throws InterruptedException {

        driver.get("https://www.amazon.com");
        Actions actions=new Actions(driver);
        WebElement acuontLinki=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        actions.moveToElement(acuontLinki).perform();
        WebElement createLinkTusu= driver.findElement(By.xpath("//*[text()='Create a List']"));

        driver.get("https://the-internet.herokuapp.com/context_menu");



        Thread.sleep(5000);




    }
}
