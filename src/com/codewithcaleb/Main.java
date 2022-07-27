package com.codewithcaleb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Number:");
        //i create an instance of the scanner class
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if((number % 5 == 0) && (number % 3)== 0)
            System.out.println("FizzBuzz");
        else if(number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
}
