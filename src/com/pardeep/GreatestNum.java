package com.pardeep;

import java.util.Scanner;

public class GreatestNum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        // assume a is greatest
        int max = a;
        if(b > max){
            max = b;
        }if(c > max){
            max = c;
        }
        System.out.println("Greatest is "+max);
    }
}
