/**
 321
 543
 765
 987
 */

package com.pattern;

import java.util.Scanner;

public class Q2 {
    public  static void main(String [] args){
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
        k = 4;
        for(int r = 1 ; r<= n ; r++){
            int item = k-1;
           for(int c = 0; c< 3 ; c++){
               System.out.print(item--);
           }
           k =k+2;
            System.out.println("");
        }

    }
}
