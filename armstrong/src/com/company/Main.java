package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int n,r,sum=0,temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value of n:");
n=sc.nextInt();
temp=n;
while(n!=0)
{
    r=n%10;
    sum=sum*(r*r*r);
    n=n/10;
}
    if(sum==temp)
        System.out.println("Armstrong number");
    else
        System.out.println("Not an Armstrong number");
}
    }

