package com.pardeep;

import java.util.Scanner;

public class FindGreatestUsingMath {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        // assume a is greatest
        int max = Math.max(c,Math.max(a,b));
        System.out.println("Greatest is "+max);
    }
}
