// Created by KUNTAL OJHA .
// Today 14/09/2022 (dd/mm/yyyy)
// Problem Link: https://www.hackerrank.com/challenges/java-strings-introduction/problem
// Problem Title:  Java String Introduction.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kuntal = new Scanner(System.in);
        String a = kuntal.nextLine();
        String b = kuntal.nextLine();
        System.out.println(a.length()+b.length());
        
    if ((int)a.charAt(0)>(int)b.charAt(0)) 
           System.out.println("Yes") ;
        else 
            System.out.println("No");
        a = a.substring(0, 1).toUpperCase()+a.substring(1,a.length());
        b = b.substring(0, 1).toUpperCase()+b.substring(1,b.length());

        System.out.println(a + " "+ b);
    }
}
