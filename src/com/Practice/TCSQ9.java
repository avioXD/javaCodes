package com.Practice;

import java.util.Scanner;

public class TCSQ9 {
    public static int isPrime(int x){
        int i =(int)Math.sqrt(x);
        int flag = 0;
        while(i>1){
            if(x%i--==0){
                flag = 1;
                return 0;
            }
        }
        return x;
    }
    public static void main(String [] args){
        int low, high;
        Scanner sc =new Scanner (System.in);
        low = Integer.parseInt(sc.nextLine());
        high = Integer.parseInt(sc.nextLine());
        int  sumOfPrime= 0;
        for(int i = low ; i <= high; i++ ){
            int temp = isPrime(i);
            if(temp!=0) {
                sumOfPrime +=temp;
            }
        }
        System.out.println(sumOfPrime);

    }
}
