package day12_synchronization;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class C01_ExolicitlyWait extends TestBase {
    /*
        1. Bir class olusturun : WaitTest
        2. Iki tane metod olusturun : implicitWait() , explicitWait()
           Iki metod icin de asagidaki adimlari test edin.
        3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        4. Remove butonuna basin.
        5. “It’s gone!” mesajinin goruntulendigini dogrulayin.
        6. Add buttonuna basin
        7. It’s back mesajinin gorundugunu test edin
     */
@Test
    public void test01(){
    driver.get("https://the-internet.herokuapp.com/dynamic_controls");
    driver.findElement(By.xpath("//button[text()='Remove']")).click();
    WebElement yazi1=driver.findElement(By.xpath("//p[@id='message']"));



    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement yazi2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
    Assert.assertTrue(yazi2.isDisplayed());

}

}
