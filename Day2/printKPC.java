package com.company.Day2;

import java.util.Scanner;

public class printKPC {
    static String [] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        printKPC(s,"");

    }

    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        char ch = str.charAt(0); //"7"
        String ros = str.substring(1);

        int num = ch-'0'; // 7

        String codefrCh= codes[num]; // tu

        for(int i=0;i<codefrCh.length();i++){
            printKPC(ros,asf+codefrCh.charAt(i));
            // asf.add(codefrCh.chaAt(i));
        }



    }

}
