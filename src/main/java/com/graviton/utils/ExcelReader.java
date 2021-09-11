package com.graviton.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    public static void main(String[] args) throws IOException {
        printExcelData(readExcelData());
    }

    public static String [][] readExcelData() throws IOException {

        String filePath = "testData/testData.xlsx";
        FileInputStream stream = new FileInputStream(filePath);

        //Loading excel file
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(stream);
        //Isolating datasheet
        Sheet dataSheet = xssfWorkbook.getSheetAt(0);

        int rowCount = dataSheet.getLastRowNum();
        int columnCount = dataSheet.getRow(0).getLastCellNum();
        String [][] data = new String[rowCount][columnCount];

        for(int i = 1; i<= rowCount; i++){
            //Isolating data row
            Row row = dataSheet.getRow(i);

            for(int j =0; j<columnCount; j++){
                //Isolating the cell
                Cell cell = row.getCell(j);
                try{
                    //Entering data
                    data [i-1][j] = cell.getStringCellValue();
                }catch (Exception exception){
                    exception.printStackTrace();
                }
            }
        }

        return data;
    }


    public static void printExcelData(String [][] theData){
        for(int i = 0; i<theData.length; i++){
            for(int j =0; j<theData[i].length; j++){
                System.out.println(theData[i][j]);
            }
        }
    }

}
