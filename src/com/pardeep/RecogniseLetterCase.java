package com.pardeep;

import java.util.Scanner;

public class RecogniseLetterCase {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a letter: ");
        char c = input.next().trim().charAt(0);
        if(c >= 'a' && c <= 'z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
