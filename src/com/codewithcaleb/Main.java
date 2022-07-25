package com.codewithcaleb;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //to read input from the console we use System.in
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        //i can get various types of inputs so i must specify
        //There are other methods like nextFloat and nextDouble
       // byte age = scanner.nextByte();
        //we do not have next String but rather we have the Next Method
        //The next method reads Only a single token
        //String age = scanner.next()
        //NextLine reads all the lines that the user has entered,no matter how many spaces or tabs
        // that are there
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);

    }
}
