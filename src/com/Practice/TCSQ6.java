package com.Practice;

import java.util.Scanner;

public class TCSQ6 {
    public static void main(String [] args){
        int num=0; ;
        Scanner sc = new Scanner(System.in);
        boolean done = false;
        while(!done){
            try{
                num= Integer.parseInt(sc.nextLine());
                done= true;
            }catch(Exception e){
                System.out.println("Enter A valid Integer");
            }
        }
        boolean flag = false;
        for(int i =2 ; i< num/2; i++){
            if(num%i == 0){
                flag= true;
            }
        }
        if(!flag){
            System.out.println("This is a prime number and SQRT is "+ Math.round(Math.sqrt(num)*100.00)/100.00 );
        }else{
            System.out.println("This is a non prime number and SQRT is "+ Math.round(Math.sqrt(0)*100.00)/100.00 );
        }

    }
}
