/*
*
* */
package com.Practice;
import java.util.Scanner;

public class TCSQ3 {
    public static void main(String args[]){
        float radius= 0;
        Scanner sc= new Scanner(System.in);
        try{
            radius = Float.parseFloat(sc.nextLine());
        }catch (NumberFormatException e){
            System.out.print("The Argument entered should be Int");
        }
        float area= (float) (3.14*radius*radius);
        System.out.println(area+ " sqr");

    }
}
