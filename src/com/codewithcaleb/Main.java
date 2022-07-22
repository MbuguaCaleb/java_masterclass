
package com.codewithcaleb;
public class Main {
    public static void main(String[] args){
       //The Math Class

        //It has a number of useful methods

        //When the same method is implemented twice we say it has been overloaded

        //We use this method to round a floating point number to a whole number

        //        int result = Math.round(1.1F);
        //        System.out.println(result);
        //
        //        int resultCeil = (int) Math.ceil(1.1F);
        //        System.out.println(resultCeil);


        //        int result = Math.max(1,2);
        //        System.out.println(result);

        //        int result = Math.min(1,2);
        //        System.out.println(result);

        //Math Random returns a random number between zero and one

        //Math random always returns a double
        // double result = Math.random();
        // System.out.println(result);


        //Returning a Number Between 0 to 100

        //Explicit casting is where i want to cast regardaless
        //If i still want it to be an Integer i will explicitly cast it

       //int result = (int) Math.round(Math.random() * 100);
       //System.out.println(result);

        int result = (int) (Math.random() * 100);

        System.out.println(result);

    }
}
