/*
 * Handling console inputs
 */
package com.java.lec4;

import java.util.Scanner;

public class NameMaker {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String fname = in.nextLine();
        System.out.println("First name is:" + fname);

        String lname = in.nextLine();
        System.out.println("First name is:" + lname);

        System.out.println("Full Name is:" + fname + " " + lname);
        //get char 
        System.out.println("Enter your age");
        int myage = in.nextInt();
        System.out.println("Age is:" + myage);

        System.out.println("What is your favorit letter:");
        char charAt = in.next().charAt(0);
        System.out.println("The letter is:" + charAt);
    }

}
