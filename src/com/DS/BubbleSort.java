package com.DS;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void swap(int [] list, int i){
        int temp = list[i];
        list[i] = list[ i + 1];
        list[i+1] = temp;
    }
    public static void show(int [] list ){
        for(int l = 0; l< list.length ; l++){
            System.out.print(list[l]+ " ");
        }
        System.out.println("");
    }
    public static void sort(int [] list ){
        long complex = 1;
        boolean isShorted = true;
        for(int l = 0 ; l < list.length; l++ ){
            for(int i = 0 ;  i < (list.length  - l -1) ; i++ ) {

                if(list[i] > list [i+1]) {
                    complex = (l+1)*++complex;
                    swap( list, i);
                    isShorted = false;
                }
            }
            if(isShorted){
                 System.out.println("Complexcity: "+ complex + " s");
                return;
            }
        }
        System.out.println("Complexcity: "+ complex+ " s");

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array You want");
        boolean done = false;
        int len= 0 ;

        while(!done) {
            try {
                len = Integer.parseInt(sc.nextLine());
                done = true;
            } catch (NumberFormatException e) {
                System.out.println("You should put a Integer: ");
            }
        }
        int [] list = new int[len];
        Random rand = new Random();
        for(int l = 0 ; l < len ; l++){
            done = false;
            while(!done){
                try{
                  list [ l ]  = rand.nextInt(len*10)+1;
                  //list [ l ]  = Integer.parseInt(sc.nextLine());
                    done= true;
                }catch(NumberFormatException e){
                    System.out.println("You should put a Integer: ");
                }
            }
        }
        show(list );
        sort(list );
        System.out.println("Shorted : ");
        show(list );
    }
}


/*
* Time complexcity : 1+2+3+4+ .... + (n+1) = n(n-1)/2 = bigO(n^2)
* */