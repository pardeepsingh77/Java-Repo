package com.pardeep;

import java.util.Scanner;

public class Fibonacci {

    static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }


    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Which nth number you want fibonacci:");
        int n = input.nextInt();

        System.out.println(n-1);
        System.out.print("Result : "+ fibonacci(n-1) );

//        int previous = 0;
//        int current = 1;
//        int count = 3;
//        while (count <= n){
//            int temp = current;
//            current = current + previous;
//            previous = temp;
//            count++;
//        }
//        System.out.println("Fibonacci for that nth number is "+current);
    }
}
