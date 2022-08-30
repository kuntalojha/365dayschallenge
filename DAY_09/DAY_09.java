// Created by KUNTAL OJHA .
// Today 30/08/2022 (dd/mm/yyyy)
// Problem Link: https://www.hackerrank.com/challenges/java-end-of-file/problem
// Problem Title:  Java End of File


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kuntal = new Scanner(System.in);
        int dipa =1;
        while (kuntal.hasNext()) { 
            String S = kuntal.nextLine();
            System.out.println(dipa+" "+S);
            dipa++;  
        }  
        kuntal.close();
    }
}
