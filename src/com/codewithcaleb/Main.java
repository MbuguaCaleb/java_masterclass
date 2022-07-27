package com.codewithcaleb;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Its not advisable to put the scanner Object inside the While Loop due to Memory
        Scanner scanner = new Scanner(System.in);
        String input = "";

        //We cannot use comparison Operators between reference Types
        //This is wrong
        //input != "quit"
        while(!input.equals("quit")){
            System.out.println("Input:");
            input = scanner.nextLine().toLowerCase();
            System.out.println(input);
        }


    }
}
