package com.pardeep;

import java.util.Scanner;

public class Sum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num 1 :");
        int num1 = input.nextInt();
        System.out.print("Enter num 2 :");  
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of two number is : " + sum);
    }
}
