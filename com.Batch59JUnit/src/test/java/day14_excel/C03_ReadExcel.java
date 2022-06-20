package day14_excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_ReadExcel {

   @Test
    public void readExcelTest() throws IOException {
       int satirNo=4;
       int sutunNo=4;
       String expectedData="Cezayir";

      String actualData= dataGetir(satirNo-1,sutunNo-1);

       Assert.assertEquals(expectedData,actualData);

   }

    public static String dataGetir(int satirIndex, int sutunIndex) throws IOException {
      String dosyaYolu="src/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fis);
      String expectedData=  workbook.getSheet("Sayfa1").getRow(satirIndex).getCell(sutunIndex).getStringCellValue();
        return expectedData;
    }
}
