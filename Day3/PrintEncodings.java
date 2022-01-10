package com.company.Day3;

import java.util.Scanner;

public class PrintEncodings {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printEncodings(str,"");

    }

    public static void printEncodings(String str,String path) {
        if(str.length()==0){
            System.out.println(path);
            return;
        }
        char ch1 = str.charAt(0);
        String ros = str.substring(1);
        int num1 = ch1 - '0';
//         (char)(num1+'a'-1);
        printEncodings(ros,path+(char)(num1+'a'-1));
        if(str.length()>1){
            char ch2= str.charAt(1);
            int num2 = ch2-'0';
            int num3 = num1*10+num2;
            if(num3<=26){
                printEncodings(str.substring(2),path+(char)(num3+'a'-1));
            }
        }
//        printEncodings(str.substring(1), path + (char)(num1+ 'a' - 1));

    }

}
