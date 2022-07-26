package com.codewithcaleb;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //        System.out.print("Principal:");
        //        Scanner scanner = new Scanner(System.in);
        //        Double principalAmount = scanner.nextDouble();
        //        System.out.println("Annual Interest Rate:");
        //        Double annualInterestRate = scanner.nextDouble();
        //        System.out.println("Period:");
        //        Integer payments = scanner.nextInt();
        //
        //        //Interest formulae
        //        Double monthlyInterestRate = (annualInterestRate/12)/100;
        //
        //        Double mortgage = principalAmount * (((monthlyInterestRate)*(Math.pow((1 +monthlyInterestRate),payments)))/((Math.pow((1 +monthlyInterestRate),payments))-1));
        //
        //        NumberFormat currencyFormat= NumberFormat.getCurrencyInstance();
        //
        //        System.out.println(currencyFormat.format(mortgage));
        //        System.out.print(mortgage);

        //Solution Two
        final byte MONTHS_IN_YEAR =12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        Integer principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        Float annualInterest = scanner.nextFloat();
        Float monthlyInterest = annualInterest /PERCENT/MONTHS_IN_YEAR;

        System.out.println("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal*(monthlyInterest * Math.pow(1+ monthlyInterest,numberOfPayments))/
                (Math.pow(1+monthlyInterest,numberOfPayments) -1 );

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage:" + mortgageFormatted);

    }
}
