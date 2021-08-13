package com.Competitive;

import java.util.Locale;
import java.util.Scanner;

public class VirusCheckup {
    public static int checkReport(String p ,String virus){
        int i =0;
        int j = 0;
        int flag = 0;
       // System.out.println(p);
       while(i<p.length() && j<virus.length()){
           if(p.charAt(i)== virus.charAt(j)){
               j++;
               i++;
               flag = 1;
           }else{
               j++;
               flag = 0;
           }
       }
        return flag;
    }

    public static void main(String args[] ) throws Exception {
        Scanner  sc = new Scanner(System.in);
        boolean done = false ;
        int n=0 ;
        String virus = sc.nextLine();
        virus = virus.toLowerCase();
       while(!done) {
           n = Integer.parseInt(sc.nextLine());
           if (n <= 10) {
               done = true;
           }
       }
        int [] result = new int[n];
        String [] p = new String[n];
        for(int i= 0; i<n;i++) {
            done = false;
            while(!done){
                p[i] = sc.nextLine();
                if(p[i].length() <= virus.length()){
                    done=true;
                }
            }
        }
        for(int i= 0; i<n;i++){
            result[i]=checkReport(p[i],virus);
        }
        for(int i = 0; i<n; i++){
            if(result[i] == 0){
                System.out.println("NEGATIVE");
            }else if(result[i]==1){
                System.out.println("POSITIVE");
            }
        }

    }
}
