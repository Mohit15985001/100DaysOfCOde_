package com.company.Day2;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePath {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int dr=scn.nextInt();
        int dc = scn.nextInt();
        ArrayList<String> ans =getMazePaths(0,0,dr-1,dc-1);
        System.out.println(ans);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> myAns = new ArrayList<>();
        for (int jump = 1; jump + sc <= dc; jump++) {
            ArrayList<String> HAns = getMazePaths(sr, sc + jump, dr, dc);
            for (String ele : HAns) {
                myAns.add("h" + jump + ele);
            }
        }
//        if (sr >= 0 && sc >= 0 && sr <= dr && sc <= dc) {
//
//
//        }
        for (int jump = 1; jump + sr <= dr ; jump++) {
            ArrayList<String> VAns = getMazePaths(sr + jump, sc, dr, dc);
            for (String ele : VAns) {
                myAns.add("v" + jump + ele);
            }
        }
//        if (sr >= 0 && sc >= 0 && sr <= dr && sc <= dc) {
//            for (int jump = 1; jump + sr <= dr && jump + sc <= dc; jump++) {
//                ArrayList<String> recAns = getMazePaths(sr + jump, sc, dr, dc);
//                for (String ele : recAns) {
//                    myAns.add("v" + jump + ele);
//                }
//            }
//
//        }
//        if (sr >= 0 && sc >= 0 && sr <= dr && sc <= dc) {
//
//
//        }
        for (int jump = 1; jump + sr <= dr && jump + sc <= dc; jump++) {
            ArrayList<String> DAns = getMazePaths(sr + jump, sc + jump, dr, dc);
            for (String ele : DAns) {
                myAns.add("d" + jump + ele);
            }
        }
        return myAns;
    }

    }
//        if(sr<0 || sc<0 || sr>dr || sc>dc){
//            return;
//        }
//        ArrayList<String> myAns = new ArrayList<>();
//        for(int i=0;sc+i<=dc;i++){
//            if(sr>=0 && sc>=0 && sr<=dr && sc+i<=dc){
//                ArrayList<String> recAns = getMazePaths(sr,sc+i,dr,dc);
//                for(String ele : recAns){
//                    myAns.add("h"+ele+i);
//                }
//            }
//
//        }
//        for(int i=0;sr+i<=dr;i++){
//            if(sr>=0 && sc>=0 && sr+i<=dr && sc<=dc){
//                ArrayList<String> recAns = getMazePaths(sr+i,sc,dr,dc);
//                for(String ele : recAns){
//                    myAns.add("v"+ele+i);
//                }
//            }
//        }
//        for(int i=0;sr+i<=dr && sc+i<=dc;i++){
//            if(sr>=0 && sc>=0 && sr+i<=dr && sc+i<=dc){
//                ArrayList<String> recAns = getMazePaths(sr+i,sc+i,dr,dc);
//                for(String ele : recAns){
//                    myAns.add("d"+ele+i);
//                }
//            }
//
//
//        }
//        return myAns;


