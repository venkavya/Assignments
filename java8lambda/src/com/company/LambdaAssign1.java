package com.company;

@FunctionalInterface
interface Arithmetic {
    int operations(int a,int b);
}
public class LambdaAssign1 {
    public static void main(String args[])
    {
        Arithmetic addition = (num1, num2) -> num1 + num2;
        System.out.println("Addition ->" + addition.operations (7 , 9));

        Arithmetic subtraction = (num1, num2) -> num1 - num2;
        System.out.println("subtraction ->" + addition.operations (4, 9) );

        Arithmetic multiplication = (num1, num2) -> num1 * num2;
        System.out.println("multiplication ->" + addition.operations (56, 90) );

        Arithmetic division = (num1, num2) -> num1 / num2;
        System.out.println("division ->" + addition.operations (8, 9) );

    }
}
