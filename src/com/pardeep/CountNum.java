package com.pardeep;

import java.util.Scanner;

public class CountNum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter iterating int: ");
        int num = input.nextInt();
        System.out.print("Enter which number to find: ");
        int whichToFind = input.nextInt();
        int count = 0;
        while(num > 0){
            int rem = num % 10;
            if(rem == whichToFind){
                count++;
            }
            num = num / 10;
        }

        System.out.println("Count of "+whichToFind+" in the string is "+count);
    }
}
