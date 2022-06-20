package day05_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class soru {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. http://zero.webappsecurity.com sayfasina gidin
2. Signin buttonuna tiklayin
3. Login alanine  “username” yazdirin
4. Password alanine “password” yazdirin
5. Sign in buttonuna tiklayin
6. Pay Bills sayfasina gidin
7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
8. tarih kismina “2020-09-10” yazdirin
9. Pay buttonuna tiklayin
10. “The payment was successfully submitted.” mesajinin ciktigini control edin
Collapse


         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://zero.webappsecurity.com");
        driver.findElement(By.xpath("//*[@id=\"signin_button\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("username");
        driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("password");
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[2]/input")).click();


        Thread.sleep(3000);

        driver.close();
        Assert.assertArra

    }
}
