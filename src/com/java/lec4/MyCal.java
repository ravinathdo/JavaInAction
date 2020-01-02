/*
 * Handling inputs from console
 */
package com.java.lec4;

import java.util.Scanner;

public class MyCal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = in.nextInt();
        System.out.println("Enter second number:");
        int num2 = in.nextInt();
        System.out.println("Enter operator (+ - / * ):");
        char op = in.next().charAt(0);

        int answer = 0;
        switch (op) {
            case '+':
                answer = num1 + num2;
                System.out.println("Answer is:" + answer);
                break;
            case '-':
                answer = num1 - num2;
                System.out.println("Answer is:" + answer);
                break;
            case '/':
                answer = num1 / num2;
                System.out.println("Answer is:" + answer);
                break;
            case '*':
                answer = num1 * num2;
                System.out.println("Answer is:" + answer);
                break;
        }
    }
}
