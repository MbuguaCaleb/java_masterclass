package com.codewithcaleb;

public class Main {
    public static void main(String[] args){

        //Method One
        //        int temp = 32;
        //        if(temp > 30){
        //            System.out.println("It's a hot day");
        //            System.out.println("Drink Water");
        //        }else if(temp > 20 && temp <=30){
        //            System.out.println("Beautiful Day");
        //        }else{
        //            System.out.println("Cold Day ");
        //        }

        //Method Two
        //IF you are printing Only One clause you can do away with the braces

        int temp = 32;
        if(temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink Water");
        }
        else if(temp > 20)
            System.out.println("Beautiful Day");
        else
            System.out.println("Cold Day ");




    }
}
