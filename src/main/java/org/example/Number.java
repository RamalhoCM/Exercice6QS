package org.example;

public class Number {
    public double calculateAverageOfDigits(int number) {
        String numberStr = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < numberStr.length(); i++) {
            sum += Character.getNumericValue(numberStr.charAt(i));
        }
        return (double) sum / numberStr.length();
    }
}

