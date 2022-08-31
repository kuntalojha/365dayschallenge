// Created by KUNTAL OJHA .
// Today 31/08/2022 (dd/mm/yyyy)
// Problem Link:https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
// Problem Title: Java Static Initiallizer Block

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kuntal = new Scanner(System.in);
        byte x = kuntal.nextByte();
        byte y = kuntal.nextByte();
        if(x>0 && y>0)
        {
            
            System.out.println(x*y);
        }else
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }
}
