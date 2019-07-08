package com.company.mainacademy.homework3.main.model;

public class NumbersModel {
    private Integer number;
    private Integer result;

    public NumbersModel(Integer number) {
        this.number = number;
    }

    public void calculate() {
        int result = 0;
        for(int i = this.number.intValue();  i > 0; i /= 10)
            result += i % 10;
        this.result = new Integer(result);
    }

    @Override
    public String toString() {
        return "Input number is : " + number
                + " and Result = " + result;
    }
}
