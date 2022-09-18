// Created by KUNTAL OJHA .
// Today 17/09/2022 (dd/mm/yyyy)
// Problem Link: https://www.hackerrank.com/challenges/java-biginteger/problem
// Problem Title: Java BigInteger.

import java.io.*;
import java.util.*;
import java.math.BigInteger;  

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner kuntal = new Scanner(System.in);
        BigInteger A = kuntal.nextBigInteger();
        BigInteger B = kuntal.nextBigInteger();
        
        System.out.println(A.add(B));
        System.out.println(A.multiply(B));
    }
}
