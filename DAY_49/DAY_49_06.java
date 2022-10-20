// Created by KUNTAL OJHA .
// Today 19/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/problems/TODOLIST
// Problem Title: Problems in your to-do list
// Programmng Language: JAVA



/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
		// your code goes here
		Scanner kuntal = new Scanner(System.in);
		int t = kuntal.nextInt();
		for(int i=0;i<t;i++) {
            int n = kuntal.nextInt();
            int count=0;
            for(int j=0;j<n;j++) {
                int d = kuntal.nextInt();
                if(d>=1000){
                    count++;
                }
            }
            System.out.println(count);
		}

	}
}