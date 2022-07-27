package com.codewithcaleb;

public class Main {
    public static void main(String[] args) {

      //Switch Statements
        //
        String role = "admin";
        switch (role){
            case "admin":
                System.out.println("You are an Admin");
                break;
            case "moderator":
                System.out.println("You are a Moderator");
                break;
            default:
                System.out.println("You are a guest");

        }

//        if(role == "admin")
//            System.out.println("You are an Admin");
//        else if (role == "moderator")
//            System.out.println("You are a moderator");
//        else
//            System.out.println("You are a guest");


        //Switch Statement


    }
}
