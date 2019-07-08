package com.company.mainacademy.homework3.main;

import com.company.mainacademy.homework3.main.model.AnagramsModel;
import com.company.mainacademy.homework3.main.ranner.NumbersRunner;
import com.company.mainacademy.homework3.main.ranner.StringRunner;

public class Main {
    /**
     * ДЗ
     * 1. Создать сервис нахождение суммы цифр двумя способами 12345 ->15
     * 2. ab1cd2 3ef4g ij5k -> dc1ba2 3gf4e kj5i
     */

    private AnagramsModel anagramsModel;

    public static void main(String[] args) {
        Main main = new Main();
        main.setUP();
        main.thenInputStringThenReverseString();
        main.thenInputStringWithNumberThenReverseString();
        main.thenInputStringWithoutNumberThenReverseString();
        main.thenInputExampleStringThenReverseString();

        NumbersRunner numbersRunner = new NumbersRunner();
        numbersRunner.run();

        StringRunner stringRunner = new StringRunner();
        stringRunner.run();
    }

        public void setUP() {
            anagramsModel = new AnagramsModel();
        }

        public void thenInputStringWithoutNumberThenReverseString() {

            anagramsModel.setInputString("abcd efgh");
            String expectedStr = "dcba hgfe";

            anagramsModel.reverseText();
            if(expectedStr.equals(anagramsModel.getResultString()))
                System.out.println("Ok");
            else System.out.println("No");
            //assertEquals(expectedStr, anagramsModel.getResultString());
        }

        public void thenInputExampleStringThenReverseString() {

            anagramsModel.setInputString("ab1cd2 3ef4g ij5k");
            String expectedStr = "dc1ba2 3gf4e kj5i";

            anagramsModel.reverseText();
            if(expectedStr.equals(anagramsModel.getResultString()))
                System.out.println("Ok");
            else System.out.println("No");
            //assertEquals(expectedStr, anagramsModel.getResultString());
        }

        public void thenInputStringWithNumberThenReverseString() {

            anagramsModel.setInputString("a1bcd efg!h");
            String expectedStr = "d1cba hgf!e";

            anagramsModel.reverseText();
            if(expectedStr.equals(anagramsModel.getResultString()))
                System.out.println("Ok");
            else System.out.println("No");
            //assertEquals(expectedStr, anagramsModel.getResultString());
        }

        public void thenInputStringThenReverseString() {

            anagramsModel.setInputString("b1cd2 3ef4g ij5k");
            String expectedStr = "d1cb2 3gf4e kj5i";

            anagramsModel.reverseText();
            //(expectedStr, anagramsModel.getResultString());
            if(expectedStr.equals(anagramsModel.getResultString()))
                System.out.println("Ok");
            else System.out.println("No");
        }
	// write your code here ab1cd2 3ef4g ij5k -> dc1ba2 3gf4e kj5i
    }
