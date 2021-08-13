package com.Practice;

import java.util.Scanner;




public class TCSQ8 {
    public static void decodeToBinary( int x){
        int [] binaryNumber = new int [32];
        int i = 0;
        while(x>0){
            binaryNumber [i] = x%2;
            x/=2;
            i++;
        }
        for(int z = i-1;z>=0; z--){
            System.out.print(binaryNumber[z]);
        }
    }

    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        decodeToBinary(n);
    }
}
