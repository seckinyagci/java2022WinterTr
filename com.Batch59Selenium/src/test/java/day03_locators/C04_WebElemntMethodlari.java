package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElemntMethodlari {
    /*
    amazon.com a gidip arama kutusunu locate edin
    arama kutusunun tag name'nin input oldugunu test edin
    arama kutusunun name attribute'nun degerinin .... oldugunu tes edin

     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com");
        WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
        String expectedTagName="input";
        String actualTagName=search.getTagName();
        if (expectedTagName.equals(actualTagName)){
            System.out.println("Tag name testi PASS");
        }else{
            System.out.println("Tag name testi FAIL!!!");
        }
        String expectedNameDegeri="field-keyWords";
        String actualNameDegeri=search.getAttribute("name");
        if (expectedNameDegeri.equals(actualTagName)){
            System.out.println("Name degeri PASS");
        }else{
            System.out.println("Name degeri FAIl !!!");
        }

    }

}

