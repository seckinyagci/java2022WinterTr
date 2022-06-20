package day14_excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class C05_ReadExcel {
    @Test

    public void C05_ReaExcel() throws IOException {
        String dosyaYolu="src/resources/ulkeler.xlsx";

        FileInputStream fis=new FileInputStream(dosyaYolu);

        Workbook workbook= WorkbookFactory.create(fis);
        int sonSatirIndexi=workbook.getSheet("Sayfa1").getLastRowNum();

        Map<String,String> ulkelerMap=new HashMap<>();
        for (int i = 0; i <sonSatirIndexi ; i++) {

            String key=workbook.getSheet("Sayfa1").getRow(i).getCell(0).getStringCellValue();
            String value=workbook.getSheet("Sayfa1").getRow(i).getCell(1).getStringCellValue()
                    +","+workbook.getSheet("Sayfa1").getRow(i).getCell(2).getStringCellValue()
                    +","+workbook.getSheet("Sayfa1").getRow(i).getCell(3).getStringCellValue()
                    ;

            ulkelerMap.put(key,value);



        }
        System.out.println(ulkelerMap);




    }


    }