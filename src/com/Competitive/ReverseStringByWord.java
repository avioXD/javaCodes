package com.Competitive;

import java.util.Scanner;

public class ReverseStringByWord {
    public static String removeSpace(String str){
        str= str.trim();
        int len = str.length();
        String pStr="";
        int spaceCnt=0;
        for(int i=0; i<len; i++){
            if(str.charAt(i)==' '){
                if(spaceCnt < 1){
                    pStr += str.charAt(i);
                }
                spaceCnt++;
            }else{
                pStr=pStr+str.charAt(i);
                spaceCnt = 0;
            }
        }
        System.out.println(pStr);
        reverse(pStr);

        return pStr;
    }
    public static void reverse(String str){
        int len = str.length();
        String pStr= "";
        int sublen =0;
        int i;
        int wordlen=0;
        for(i = len-1; i>=0 ;i--){
            if(str.charAt(i)==' '){
                sublen = len-i-1;
                while(wordlen>0){
                    pStr= pStr + str.charAt(len-sublen--);
                    wordlen--;
                }
                pStr = pStr+str.charAt(i);
            }else{
                wordlen ++;
            }
        }
        sublen = len-i-1;
        while(wordlen>0){
            pStr= pStr + str.charAt(len-sublen--);
            wordlen--;
        }


        System.out.println(pStr);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        boolean done =false;
        String str="";
        str = sc.nextLine();
        removeSpace(str);
    }
}
