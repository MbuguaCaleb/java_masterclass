
package com.codewithcaleb;
public class Main {
    public static void main(String[] args){
        //Casting and Type Conversion

        //Implicit casting

        //Whenever you are adding a smaller datatype to a bigger one, casting
        //happens automatically

        // byte > short > int > long > float > double

       //short x =1;
       //int y = x+2;

       //double x = 1.1;
       //double y = x + 2;

        //N/B
        //Implicit casting happens when there is no chance of data loss

       //if we do not mind about data loss we can do explicit casting

        //explicit casting
        //double x =1.1;
        // int y = (int) x + 2;

        //explicit casting can only happen between compatible types

        String x = "1.1";

        //The Only way that a string can be converted to an integer is through wrapper classes
        //Integer.parseInt()
        //Float.parseFloat()
       // int y = Integer.parseInt(x) + 2;

        //Java is very strict on the datatypes

        Double y = Double.parseDouble(x) + 2;

        //This is very important since we always receive input from a user as a string
        System.out.println(y);


    }
}
