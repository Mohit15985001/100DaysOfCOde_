package com.company.Day4;

import java.util.Scanner;

public class knightTour {


    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] chess= new int[n][n];
        printKnightsTour(chess,r,c,1);


    }
    public static int [][]Dir={{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,-1}};

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        if (r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] > 0) {
            return;
        }
        if (upcomingMove == chess.length * chess.length) {
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
        chess[r][c] = upcomingMove;
        for (int d = 0; d < 8; d++) {
            int row = r + Dir[d][0];
            int col = c + Dir[d][1];
            printKnightsTour(chess, row, col, upcomingMove + 1);

        }
        chess[r][c] = 0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
