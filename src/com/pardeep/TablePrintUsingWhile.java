package com.pardeep;

import java.util.Scanner;

public class TablePrintUsingWhile {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = input.nextInt();
        int i = 0;
        while(i <= n){
            System.out.println(i);
            i++;
        }
    }
}
