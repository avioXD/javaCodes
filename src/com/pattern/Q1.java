/*
    1
   121
  12312
 1234123
123451234


* **/


package com.pattern;

import java.util.Scanner;

public class Q1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row count");
        boolean done = false;
        int n= 0;
        int k= 0;
        while(!done){
            try {
                n = Integer.parseInt(sc.nextLine());
                done= true;
            }catch (Exception e){
                System.out.println("Enter a valid Integer");
            }
        }
        for(int r= 1 ; r<= n; r++){
            for(int c=1; c<=n-r;c++){
                System.out.print(" ");
            }
            k=1;
            for(int z=1; z<= r ; z++){
                System.out.print(k++);
            }
            k=1;
            for(int z= 1 ; z<=r-1; z++){
                System.out.print(k++);
            }
            System.out.println("");
        }
    }
}
