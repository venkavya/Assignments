package com.company;

public class Main {

    public static void main(String[] args) {
	try {
        int num1= 67, num2= 0;
        int num3= num1/num2;
        System.out.println ("result:" +num3);
    }
    catch (ArithmeticException e) {
        System.out.println(" cannot be divided by zero");
        }
    }
}
