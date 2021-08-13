package com.DS;

import java.util.Random;
import java.util.Scanner;

public class MargeSort {
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
    public static int[] sort(int [] list,int low ,int high){
        marge(sort(list,low,high/2),sort(list,high/2,high));
        return list;
    }
    public static void marge(int [] list1,int [] list2){
        int i=0;
        int j=0;
        int k=0;
        int [] newL =  new  int[list1.length+list2.length];
        while(i<list1.length && j<list2.length){
            if(list1[i]<list2[j]){
                newL[k++]= list1[i++];
            }else{
                newL[k++]= list1[j++];
            }
        }
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

        System.out.println("Shorted : ");
        show(sort(list,0,len));
    }
}
