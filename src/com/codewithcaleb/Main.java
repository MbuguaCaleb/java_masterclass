package com.codewithcaleb;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Refactoring
        //Changing the structure of our code without changing its behavior

        //Read Number will return a value Only when Success
        int principal = (int) readNumber("Principal ",1000,1_000_000);
        float annualInterest = (float) readNumber("Annual Interest Rate: ",1,30);
        byte years =(byte) readNumber("Period (Years): ",1,30);

        //calling the calculate Mortgage Method
        double mortgage = calculateMortgage(principal,annualInterest,years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage:" + mortgageFormatted);

    }

    public static double readNumber(String prompt,double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while(true){
            System.out.print(prompt);
            value = scanner.nextFloat();
            if(value >= min && value <= max)
                break;
            System.out.println("Enter a Value Between" + min + "and"+ max);
        }
        return  value;
    }

    public static double calculateMortgage (int principal,
                                            float annualInterest,
                                            byte years){

        //Always remember about scope, whenever you declare variables inside of a function,
        //They Only belong to that particular scope
        final byte MONTHS_IN_YEAR =12;
        final byte PERCENT = 100;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
        float monthlyInterest = annualInterest /PERCENT/MONTHS_IN_YEAR;
        double mortgage = principal*(monthlyInterest * Math.pow(1+ monthlyInterest,numberOfPayments))/
                (Math.pow(1+monthlyInterest,numberOfPayments) -1 );
        return mortgage;
       }

}
