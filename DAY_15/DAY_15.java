

// Created by KUNTAL OJHA .
// Today 15/09/2022 (dd/mm/yyyy)
// Problem Link: https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true
// Problem Title: Java Substring.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        System.out.println(S.substring(start,end));
    }
}
