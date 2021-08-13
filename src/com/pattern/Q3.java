package com.pattern;

import java.util.Scanner;

public class Q3 {
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
        int m = 0;
        for(int r = n; r>0; r--){

            int x = r ;
            int y = 2*m -1;
            int z = 2*n -  (x - y);
            m++;
            for(int c = 1 ; c <= x; c++){
                System.out.print(c);
            }

            for(int c = 1; c<= y ; c++){
                System.out.print(" ");
            }
            for(int c = z ; c>0; c--){
                System.out.print(c);
            }
            System.out.println("");
        }



    }
}
