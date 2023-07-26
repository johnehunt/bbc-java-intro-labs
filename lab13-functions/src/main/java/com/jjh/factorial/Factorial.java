package com.jjh.factorial;

import java.util.function.*;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Function<Integer, Integer> factorial = n -> {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        };

        // Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input the number to calculate the factorial for: ");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Error number must be non negative");
        } else if ((number == 0) || (number == 1)) {
            System.out.printf("Factorial of %d is 1", number);
        } else {
            int result = factorial.apply(number);
            System.out.printf("The factorial of %d is %d", number, result);
        }
    }
}
