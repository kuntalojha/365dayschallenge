// Created by KUNTAL OJHA .
// Today 28/08/2022 (dd/mm/yyyy)
// Problem Link: https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
// Problem Title:  Java Loop II.

import java.util.*;
import java.io.*;
import java.lang.*;
class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int total = 0,power=0;
            for(int j=0;j<n;j++)
            {
                power = (int)Math.pow(2,j);
                total=(power*b)+total;
                System.out.print((total+a)+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
