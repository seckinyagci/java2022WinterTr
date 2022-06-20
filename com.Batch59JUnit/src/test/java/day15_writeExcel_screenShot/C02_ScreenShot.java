package day15_writeExcel_screenShot;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C02_ScreenShot extends TestBase {

    @Test
    public void tumSayfa() throws IOException {
        // amazona gidip tum sayfanin fotografini cekelim

        driver.get("https://www.bestbuy.com");
        LocalDateTime date=LocalDateTime.now();
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yy_MM_dd HH:mm:ss");

        String tarih=date.format(dtf);

        TakesScreenshot ts= (TakesScreenshot) driver;
        File tumSayfaResmi=new File("target/ekranGoruntuleri/test "+tarih+".jpeg");
        File resimGecici=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(resimGecici,tumSayfaResmi);


    }
}
