// Created by KUNTAL OJHA .
// Today 24/08/2022 (dd/mm/yyyy)
// Problem Link: https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
// Problem Title:  Java If-Else. I

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kuntal = new Scanner(System.in);
        int n = kuntal.nextInt();
        if(n%2!=0)
        {
            System.out.println("Weird");
        }else if( 20<n)
        {
            System.out.println("Not Weird")   ;
        }else if( 6<=n && n<=20)
        {
            System.out.println("Weird");
        }else if(2<=n && n<=5)
        {
            System.out.println("Not Weird");
        }
    }
}
