// Created by KUNTAL OJHA .
// Today 27/08/2022 (dd/mm/yyyy)
// Problem Link: https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
// Problem Title:  Java Loop I. 

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        for(int x=1;x<=10;x++)
        {
            System.out.println(N+" x "+x+" = "+x*N );
        }
    }
}
