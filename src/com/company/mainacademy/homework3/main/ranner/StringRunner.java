package com.company.mainacademy.homework3.main.ranner;

import com.company.mainacademy.homework3.main.HomeWork3;
import com.company.mainacademy.homework3.main.model.StringModel;

public class StringRunner implements HomeWork3 {
    private StringModel stringModel;


    public void run() {
        System.out.println("Input data: ");
        stringModel = new StringModel((String)inputData());

        stringModel.calculate();
        System.out.println(stringModel);
    }

    @Override
    public Object inputData() {
        return new String(scan.next());
    }
}
