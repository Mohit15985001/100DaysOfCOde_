package com.company.Day4;

import java.util.Scanner;

public class printTargetSumSubsets {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int target= scn.nextInt();
        printTargetSumSubsets(arr,0,"",0,target);

    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String path, int sum, int target) {
        if(sum>target){
            return;
        }
        if(idx==arr.length){
            if(sum==target){
                System.out.println(path+".");
            }
            return;
        }
        printTargetSumSubsets(arr,idx+1,path+arr[idx]+", ",sum+arr[idx],target);
        printTargetSumSubsets(arr,idx+1,path,sum,target);
    }
}
