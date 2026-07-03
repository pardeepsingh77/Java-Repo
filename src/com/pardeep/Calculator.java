package com.pardeep;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Enter operator: ");
            char operator = input.next().trim().charAt(0);
            if(operator == 'x' || operator == 'X'){
                break;
            }
            System.out.print("Enter num 1 : ");
            int num1 = input.nextInt();
            System.out.print("Enter num 2 : ");
            int num2 = input.nextInt();
            int result = 0;
            if(operator == '+' || operator == '-' || operator == '/' || operator == '*' || operator == '%'){
                if(operator == '+'){
                    result = num1 + num2;
                }else if(operator == '-'){
                    result = num1 - num2;
                }else if(operator == '/'){
                    if(num2 != 0){
                        result = num1 / num2;
                    }
                }else if(operator == '*'){
                    result = num1 * num2;
                }else{
                    result = num1 % num2;
                }
            }else{
                System.out.println("Invalid Operator");
            }
            System.out.println("Result is "+result);
        }
    }
}
