package com.Practice;

import java.util.Scanner;

public class TCSQ1 {
    public static void fibo(int n){
        int t1=0 , t2 = 1, nextTemp;
        for(int i=0; i<n;i++){
            nextTemp= t1+t2;
            t1=t2;
            t2=nextTemp;
        }
        System.out.println(t1);


    }
    public static void prime(int n){
        int num=0;
        int count=0;
        int flag = 0;
        int pr=2;
            flag = 0;
            while(count!=n+1){
                flag = 0;

                for(int j=2;j<pr/2;j++){
                    if(pr%j==0){
                        flag ++;
                        break;
                    }
                }
                if(flag==0){
                    num = pr;
                    count++;
                }
                pr++;
            }


        System.out.println(num);
    }



    public static void main(String args[]){
        int n;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();

        if(n%2 == 1){
            fibo(n/2+1);
        }else{
            prime(n/2);
        }

    }
}
