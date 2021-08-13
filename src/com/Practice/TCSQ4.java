/*
* Year is lepear or not
* */
package com.Practice;

import java.util.Scanner;

public class TCSQ4 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int year = 0;
       boolean done = false;
        while(!done){
            try{
                year = Integer.parseInt(sc.nextLine());
                done=true;
            }catch (Exception e){
                System.out.println("Must enter a Valid Year");
            }
        }
        if((year %4 == 0) && (year % 100!= 0) || (year % 400 == 0)){
             System.out.println("Year " + year + "Is a leap Year");
        }else{
            System.out.println("Year " + year + " Is not a leap Year");
        }
    }
}
