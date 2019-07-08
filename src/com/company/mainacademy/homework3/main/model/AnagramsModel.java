package com.company.mainacademy.homework3.main.model;

public class AnagramsModel {
    private String inputString;
    private String resultString;


    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public String getResultString() {
        return resultString;
    }

    public void setResultString(String resultString) {
        this.resultString = resultString;
    }

    /**
     * reverseText
     */
    public void reverseText() {
        String string = this.inputString;
        String[] tmpArray = string.split(" ");

        for (int i = 0; i < tmpArray.length; i++) {
            if ( isStringOnlyAlphabet(tmpArray[i])) {
                tmpArray[i] = new StringBuilder(tmpArray[i]).reverse().toString();
            } else {
                tmpArray[i] = stringWithNumber(tmpArray[i].toCharArray());
            }
        }
        this.resultString = joinString(tmpArray);
    }

    private String joinString(Object[] tokens) {
        final int length = tokens.length;
        if (length == 0) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(tokens[0]);
        for (int i = 1; i < length; i++) {
            sb.append((CharSequence) " ");
            sb.append(tokens[i]);
        }
        return sb.toString();
    }

    /**
     * reverse string with with numbers and characters
     * @param string char array
     * @return result reverse string
     */
    private String stringWithNumber(char string[]) {
        // Initialize left and right pointers
        int r = string.length - 1, l = 0;

        // Traverse string from both ends until
        // 'l' and 'r'
        while (l < r) {
            // Ignore special characters
            if (!Character.isAlphabetic(string[l]))
                l++;
            else if (!Character.isAlphabetic(string[r]))
                r--;

                // Both string[l] and string[r] are not spacial
            else {
                char tmp = string[l];
                string[l] = string[r];
                string[r] = tmp;
                l++;
                r--;
            }
        }
        return new String(string);
    }

    /**
     * Does the string contain alphabet characters or any other?
     * @param string - input string
     * @return - boolean
     */
    private static boolean isStringOnlyAlphabet(String string) {
        return string.matches("^[a-zA-Z]*$");
    }
}
