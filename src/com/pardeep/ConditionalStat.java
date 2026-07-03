package com.pardeep;

import java.util.Scanner;

public class ConditionalStat {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = input.nextInt();
        if(salary > 20000){
            salary += 3000;
        }else if(salary > 10000){
            salary += 2000;
        }else{
            salary += 1000;
        }
        System.out.println("Incremented salary is : "+salary);
    }
}
