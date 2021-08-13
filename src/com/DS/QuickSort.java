package com.DS;

import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    public static void swap(int [] list, int beg , int end ){
        int temp = list[beg];
        list[beg] = list[end];
        list[end] = temp;
    }
    public static void show(int [] list ){
        for(int l = 0; l< list.length ; l++){
            System.out.print(list[l]+ " ");
        }
        System.out.println("");
    }
    public static void sort(int [] list , int low, int high){
        if(low<high) {
            int part = partition(list, low, high);
            sort(list, low, part - 1);
            sort(list, part + 1, high);
        }
    }
    public static int partition(int [] list, int low ,int high){
        int pivot = list[low];
        int beg= low+1;
        int end = high;
        while(end> beg){
        while(list[beg]<= pivot){
            beg++;
        }
        while(list[end]> pivot){
            end--;
        }
        if(end>beg){
            swap(list, beg , end);
        }
        }
        swap(list, low, end);
        return end;
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
        sort(list , 0 , len-1);
        System.out.println("Shorted : ");
        show(list);
    }
}
