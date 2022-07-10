package programlearn;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.poi.*;
import org.apache.poi.xssf.usermodel.*;

public class excel {
    public void prgm() throws IOException
{
      
    FileInputStream file = new FileInputStream("D:\\Soft Installed\\Eclipse Workspace\\JAVA EG.xlsx");
    XSSFWorkbook wb = new XSSFWorkbook(file);
    XSSFSheet sh = wb.getSheet("Sheet1");

    HashMap<String,Integer> map= new HashMap<String,Integer>();

    for (int r = 0; r <= sh.getLastRowNum(); r++) {
        
        String value = sh.getRow(r).getCell(1).getStringCellValue();
        int key = (int)sh.getRow(r).getCell(0).getNumericCellValue();
        map.put(value,key);
    }

   
    Iterator<Entry<String,Integer> > new_Iterator = map.entrySet().iterator();

    while (new_Iterator.hasNext()) {
        Map.Entry<String,Integer> new_Map= (Map.Entry<String,Integer>)
        new_Iterator.next();
   System.out.println(new_Map.getValue()+ "|" + new_Map.getKey() );
    }
    wb.close();
    file.close();
    }
