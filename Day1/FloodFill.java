package com.company.Day1;

import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");
    }

    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String path) {
        if(sr==maze.length-1 && sc == maze[0].length-1){
            System.out.println(path);
            return;
        }
        if(sr<0 || sc<0  || sr==maze.length || sc==maze[0].length || maze[sr][sc]==1){
            return;
        }
        maze[sr][sc]=1;
        floodfill(maze,sr-1,sc,path+"t");
        floodfill(maze,sr,sc-1,path+"l");
        floodfill(maze,sr+1,sc,path+"d");
        floodfill(maze,sr,sc+1,path+"r");
        maze[sr][sc]=0;
    }
}
