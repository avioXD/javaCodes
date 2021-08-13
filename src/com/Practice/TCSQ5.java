package com.Practice;

import java.util.Scanner;

public class TCSQ5 {
    public static int gcd(int a, int b ){
       if(a== 0 )return  b;
       if (b== 0) return a;
       return gcd(b , a%b);
    }
    public static void main(String [] args){
        int T =0 ;
        int arr[] =new int[500];
        Scanner sc = new Scanner(System.in);
        boolean done = false ;
        System.out.println("Enter the number of values want to put : ");
        while(!done){
            try{
                T= Integer.parseInt(sc.nextLine());
                done= true;
            }catch(Exception e){
                System.out.println("Enter A valid Integer");
            }
        }
        System.out.println("Enter values :  ");
        for(int i=0 ; i< T ; i++ ){
            done= false;
            while(!done){
                try{
                        arr[i] = Integer.parseInt(sc.nextLine());
                        done = true;
                }catch(Exception e){
                    System.out.println("Enter a Integer number ") ;
                }
            }

        }
        int temp = arr[0];
        for( int i=1 ; i<T; i++ ){
            temp = gcd(temp , arr[i]);
        }
        System.out.println("GCD is : " + temp);
    }
}
