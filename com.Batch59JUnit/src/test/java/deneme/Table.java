package deneme;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import javax.swing.*;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static sun.security.jgss.GSSUtil.login;

public class Table extends TestBase {
    /*
     Bir class oluşturun : C02_WebTables
● login( ) metodun oluşturun ve oturum açın.
● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
○ Username : manager
○ Password : Manager1!
● table( ) metodu oluşturun
○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
● printRows( ) metodu oluşturun //tr
○ table body’sinde bulunan toplam satir(row) sayısını bulun.
○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
○ 4.satirdaki(row) elementleri konsolda yazdırın.

     */

    @Test
    public void test01(){
        login01();
        table01();
        printRows();
        satirSutunYaz();



    }

    private void satirSutunYaz() {

        List<WebElement> sutunlarSeti=driver.findElements(By.xpath("//table//tr[1]//th"));
        for (int i = 0; i < sutunlarSeti.size() ; i++) {
            List<WebElement> satirlar=driver.findElements(By.xpath("//tbody//tr[i]"));
            System.out.println(sutunlarSeti.get(i));
            System.out.println();
            for (WebElement each:satirlar
                 ) {
                System.out.println(each.getText());

            }
            System.out.println();

        }
    }

    private void printRows() {
        /*
         table body’sinde bulunan toplam satir(row) sayısını bulun.
         ○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
         ○ 4.satirdaki(row) elementleri konsolda yazdırın.
         */
        List<WebElement> satirlar=driver.findElements(By.xpath("//tbody//tr"));
        System.out.println(satirlar.size());
        int satir=1;
        int sutun=1;
        for (WebElement each:satirlar
             ) {
            System.out.println(each.getText());

        }
        List<WebElement> satir4=driver.findElements(By.xpath("//tbody//tr[4]//td"));
        System.out.println(satirlar.size());

        for (WebElement each:satir4
        ) {
            System.out.println(each.getText());

        }


    }

    private void table01() {
        //table( ) metodu oluşturun
        //○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
        //○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
List<WebElement> sutunlarSeti=driver.findElements(By.xpath("//table//tr[1]//th"));
        System.out.println("satirlar seti : "+sutunlarSeti.size());
        for (WebElement each:sutunlarSeti
             ) {
            System.out.println(each.getText());
            
        }

    }

    private void login01() {

        driver.get("https://www.hotelmycamp.com");
        driver.findElement(By.xpath("(//a[@class='nav-link'])[7]")).click();
        Actions action=new Actions(driver);
        WebElement username=driver.findElement(By.id("UserName"));

        action.click(username).
                sendKeys("manager").
                sendKeys(Keys.TAB).
                sendKeys("Manager1!").
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();

    }

}
