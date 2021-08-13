package com.Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class TCSQ2factN {
    private static final int MAX = 10000;
    private static void fact(int arr[], int n){
        int res= 1;
        int len=0;
        int size = 1;
        arr[0]= 1;
        for(int i= 2 ; i <=n; i++){
            size= multiply(arr,i,size);
        }
        for(int i = size-1; i>=0 ; i--){
            System.out.print(arr[i]);
        }
    }
    public static int multiply(int arr[], int n, int size){

        int carry=0;
        for(int i = 0 ; i<size; i++){
            int res= arr[i]*n+carry;
            arr[i]= res%10;
            carry = res/10;
        }
        while (carry!=0)
        {
            arr[size] = carry % 10;
            carry = carry / 10;
            size++;
        }
        return size;
    }
    public static void main(String [] args){
        int n=0;
        int arr[]=new int[MAX];
        Scanner sc =new Scanner(System.in);
        boolean done = false;
        System.out.println("Enter the number to get factorial of that");
        while(!done){
            try{
                n = Integer.parseInt(sc.nextLine());
                done=true;
            }catch (Exception e){
                System.out.println("Must be a Integer");
            }
        }
        fact(arr,n);
       /** int number = n;
        arr[0]=1;
        int length =0;

        while(number!=0){
            arr[length]= number%10;
            number = number/10;
            length++;
        }
        for(int i = length-1; i>=0; i--){
            System.out.print(arr[i]);

        }*/
    }

}
