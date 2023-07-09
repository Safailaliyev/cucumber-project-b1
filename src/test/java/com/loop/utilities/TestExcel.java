package com.loop.utilities;

public class TestExcel {

    public static void main(String[] args) {

        ExcelUtils excelUtils = new ExcelUtils("/Users/safailaliyev/Desktop", "Sheet1");

        System.out.println("data from excel = " + excelUtils.getCellData(7,3));
    }
}
