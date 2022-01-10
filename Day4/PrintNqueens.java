package com.company.Day4;

import java.util.Scanner;

public class PrintNqueens {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] chess = new int[n][n];
//        for(int i=0;i<chess.length;i++){
//            for(int j=0;j<chess[0].length;j++){
//                chess[i][j]=scn.nextInt();
//            }
//        }
        printNQueens(chess,"",0);

    }

    public static void printNQueens(int[][] chess, String path, int row) {
        if(row==chess.length){
            System.out.println(path);
            return;
        }
        for(int c=0; c<chess.length;c++){
            if(isSafe(chess,row,c)){
                chess[row][c]=1;
                printNQueens(chess,path+row+"-"+c+", ",row+1);
                chess[row][c]=0;
            }
        }

    }
    public static boolean isSafe(int [][]chess,int r,int c){
        for(int row=r-1, col=c;row>=0;row--){
            if(chess[row][col]==1){
                return false;
            }
        }
        for(int row=r-1, col=c-1;row>=0 && col>=0;row--,col--){
            if(chess[row][col]==1){
                return false;
            }
        }
        for(int row=r-1, col=c+1;row>=0 && col<chess.length;row--,col++){
            if(chess[row][col]==1){
                return false;
            }
        }
        return true;
    }
}
