package com.Competitive;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Anagrams {


    public static void checkAnagram(String s1, String s2){
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        int s1len= s1.length();
        int s2len= s2.length();
        boolean notAnagram = false;
        if(s1len == s2len){
            int charSet1[] = new int[90];
            //int charSet2[] = new int[90];
            /*for(int i = 0; i<s1len ; i++){
                charSet1[(s1.charAt(i))]++;
                charSet2[(s2.charAt(i))]++;
            }*/
            for(int i = 0; i<s1len ; i++){
                charSet1[(s1.charAt(i))]++;
                charSet1[(s2.charAt(i))]--;
            }
           /* for(int i =0 ; i<90; i++){
                if(charSet1[i] != charSet2[i]){
                    notAnagram = true;
                    System.out.println("Strings are not Anagram");
                    return;
                }
            }*/
            for(int i =0 ; i<90; i++){
                if(charSet1[i] != 0){
                    notAnagram = true;
                    System.out.println("Strings are not Anagram");
                    return;
                }
            }
            System.out.println("Strings are Anagram");

        }else{
            System.out.println("Strings are not Anagram");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        boolean done =false;
        String s1="";
        String s2="";
        while(!done) {
            try {
                s1 = sc.nextLine();
                s2 = sc.nextLine();
                done = true;
            } catch (InputMismatchException e) {
                System.out.println("Your Input not belongs to any String type");
            }
        }

        checkAnagram(s1, s2);
        System.out.println(s1+s2);
    }
}
