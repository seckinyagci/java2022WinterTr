package ubungen;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

public class hausaufgabe54 {
    /*
        1. Bir class oluşturun : AmazonSearchTest
        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a.google web sayfasına gidin. https://www. amazon.com/
        b. Search(ara) “city bike”
        c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın d. “Shopping” e tıklayın.
        e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //google web sayfasına gidin. https://www. amazon.com/
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
        driver.findElement(By.xpath("//input[@title= 'Ara']")).sendKeys("https://www. amazon.com/");
        driver.findElement(By.xpath("//input[@title= 'Ara']")).sendKeys(Keys.ENTER);


        driver.findElement(By.xpath("(//div[@class='TbwUpd NJjxre'])[1]")).click();
        driver.findElement(By.id("twotabsearchtextbox")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("motor bike");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        String sonuc=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
        String [] sonucarr=sonuc.split(" ");
        String sonucSayisi=sonucarr[3];
        System.out.println("Motor bike icin sonuc sayisi: "+sonucSayisi);

        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
        Thread.sleep(5000);



        driver.close();






    }
}
