//To Print Fibonacci Series
package com.logicalProgram;

import java.util.Scanner;

public class fibonacciSeries {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a count");
            int count = sc.nextInt();

            int num1 = 0, num2 = 1, num3, i;
            System.out.print(num1 + " " + num2);
            for (i = 2; i < count; i++) {
                num3 = num1 + num2;
                System.out.print(" " + num3);
                num1 = num2;
                num2 = num3;
            }
        }
    }
