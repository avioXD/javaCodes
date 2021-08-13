package com.Practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Hollow World");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1 parameter: ");
        int param1=sc.nextInt();
        System.out.print("Enter 2 parameter: ");
        int param2=sc.nextInt();

        System.out.println("Result: "+(param1/param2));


    }
}
