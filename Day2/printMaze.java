package com.company.Day2;

import java.util.Scanner;

public class printMaze {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int dr = scn.nextInt();
        int dc = scn.nextInt();
        printMazePaths(0,0,dr-1,dc-1,"");

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr==dr && sc==dc){
            System.out.println(psf);
            return;
        }
        if(sr>=0 && sc >=0 && sr <=dr && sc <=dc ){
            printMazePaths(sr,sc+1,dr,sc,psf+"h");
        }
        if(sr>=0 && sc >=0 && sr <=dr && sc <=dc ){
            printMazePaths(sr+1,sc,dr,sc,psf+"v");
        }

    }
}
