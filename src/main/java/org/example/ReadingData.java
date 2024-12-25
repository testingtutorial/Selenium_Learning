package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadingData {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\IdeaProjects\\SeleniumLearning\\src\\main\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);

        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();

        readData();


    }

    public static void readData() throws IOException {
        File file = new File("src/datasheet/Register.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
//        String firstName = sheet.getRow(1).getCell(0).toString();
//        String lastName = sheet.getRow(1).getCell(1).toString();
//        String address = sheet.getRow(1).getCell(2).toString();
//        String city = sheet.getRow(1).getCell(3).toString();
//        String state = sheet.getRow(1).getCell(4).toString();
//        String zipCode = sheet.getRow(1).getCell(5).toString();
//        String phone = sheet.getRow(1).getCell(6).toString();
//        String ssn = sheet.getRow(1).getCell(7).toString();
//        String userName = sheet.getRow(1).getCell(8).toString();
//        String password = sheet.getRow(1).getCell(9).toString();
//        String confirm = sheet.getRow(1).getCell(10).toString();
//
//        System.out.println(firstName);
//        System.out.println(lastName);
//        System.out.println(address);
//        System.out.println(city);
//        System.out.println(state);
//        System.out.println(zipCode);
//        System.out.println(phone);
//        System.out.println(ssn);
//        System.out.println(userName);
//        System.out.println(password);
//        System.out.println(confirm);

        Iterator<Row> rowIterator = sheet.iterator();

        // Till there is an element condition holds true
        while (rowIterator.hasNext()) {

            Row row = rowIterator.next();

            // For each row, iterate through all the
            // columns
            Iterator<Cell> cellIterator
                    = row.cellIterator();

            while (cellIterator.hasNext()) {

                Cell cell = cellIterator.next();

                // Checking the cell type and format
                // accordingly
                switch (cell.getCellType()) {

                    // Case 1
//                    case Cell.CELL_TYPE_NUMERIC:
//                        System.out.print(
//                                cell.getNumericCellValue()
//                                        + "t");
//                        break;

                    // Case 2
//                    case Cell.CELL_TYPE_STRING:
//                        System.out.print(
//                                cell.getStringCellValue()
//                                        + "t");
//                        break;
                }
            }

            System.out.println("");
        }

        // Closing file output streams
        //file.close();



    }
}
