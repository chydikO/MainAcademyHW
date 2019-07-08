package com.company.mainacademy.homework3.main.model;

public class StringModel {
    private String number;
    private Integer result;

    public StringModel(String number) {
        this.number = number;
    }

    public void calculate() {
        int result = 0;
        char[] arrNumbers = this.number.toCharArray();
        this.result = explode(arrNumbers);
    }

    private Integer explode(char[] arrNumbers) {
        int result = 0;
        for(int i = 0; i < arrNumbers.length; i++)
        {
            result += Character.getNumericValue(arrNumbers[i]);
        }
        return new Integer(result);
    }

    @Override
    public String toString() {
        return "Input number is : " + number
                + " and Result = " + result;
    }
}
