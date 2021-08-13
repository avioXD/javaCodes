package com.DS;

import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
    public static void swap(int [] list, int key , int i ){
        int temp = list[key];
        list[key] = list[ i];
        list[i] = temp;
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
        for(int l= 0; l< list.length-1; l++){
            int key = l ;
            for(int i = key+1 ; i< list.length; i++ ){
                if(list[i]<list[l]){
                    swap(list,key,i);
                }
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
