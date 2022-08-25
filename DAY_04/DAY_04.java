// Created by KUNTAL OJHA .
// Today 25/08/2022 (dd/mm/yyyy)
// Problem Link: https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
// Problem Title: Java Stdin And Stdout II

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kuntal = new Scanner(System.in);
        int a = kuntal.nextInt();
        double b = kuntal.nextDouble();
        kuntal.nextLine();
        String c = kuntal.nextLine() ;

        System.out.println("String: "+c);
        System.out.println("Double: "+b);
        System.out.println("Int: "+a);
    }
}
