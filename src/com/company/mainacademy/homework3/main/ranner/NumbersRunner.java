package com.company.mainacademy.homework3.main.ranner;

import com.company.mainacademy.homework3.main.HomeWork3;
import com.company.mainacademy.homework3.main.model.NumbersModel;

public class NumbersRunner implements HomeWork3 {
    private NumbersModel numbersModel;


    public void run() {
        System.out.println("Input data: ");
        numbersModel = new NumbersModel((Integer)inputData());

        numbersModel.calculate();
        System.out.println(numbersModel);
    }

    @Override
    public Object inputData() {
        return new Integer(scan.nextInt());
    }
}
