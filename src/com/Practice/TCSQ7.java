package com.Practice;

import java.util.Scanner;

public class TCSQ7 {
    public static int fact(int x){
        int facttorial = 1;
        if(x == 0 || x== 1){
            return 1;
        }else {
            for (int i = 1; i <= x; i++) {
                facttorial = facttorial * i;
            }
            return facttorial;
        }
    }
    public static boolean isStrong(int x){
        int temp = x;
        int sumFact= 0;
        while(temp!=0){
            sumFact = sumFact+fact(temp%10);
            temp = temp/10;
        }
        return (sumFact == x);
    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        if(isStrong(x)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
