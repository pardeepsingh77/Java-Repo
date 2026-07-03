package com.pardeep;

import java.util.Scanner;

public class Temperature {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give Celcius : ");
        float C = input.nextFloat();
        float temp = (C * 9/5) + 32;
        System.out.println("Temperature from given celcius is "+temp);
    }
}
