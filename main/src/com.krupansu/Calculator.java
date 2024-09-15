package com.krupansu;

import java.util.Scanner;
//let's boom

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //take input from user till user does not press X or x
        int ans = 0;
        while (true) {
            System.out.print("inter the operator ");

            // take the operator as input
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') ;
            // input number

            System.out.print("enter two number : ");
            int number1 = in.nextInt();
            int number2 = in.nextInt();


            if (op == '+') {
                ans = number1 + number2;
            }
            if (op == '-') {
                ans = number1 - number2;
            }
            if (op == '*') {
                ans = number1 * number2;
            }
            if (op == '/') {
                if (number2 != 0) {
                    ans = number1 / number2;
                }
            }
            if (op == '%') {
                ans = number1 % number2;

            } else if (op == 'X' || op == 'x') {
                break;
            } else {
                // System.out.println("invalid operation !!");
            }
            System.out.println(ans);

        }
    }
}
//abd
