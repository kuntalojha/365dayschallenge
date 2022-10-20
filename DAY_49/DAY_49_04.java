// Created by KUNTAL OJHA .
// Today 19/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/problems/ACCURACY
// Problem Title: High Accuracy
// Programmng Language: JAVA



/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner kuntal = new Scanner(System.in);
		int t = kuntal.nextInt();
		for(int i=0;i<t;i++)
		{
		    int x = kuntal.nextInt();
		    
		    if(x==0 || (x%3==0))
		    {
		        System.out.println("0");
		    }else if(x%3==1)
		    {
		        System.out.println("2");
		    }else
		    {
		        System.out.println("1");
		    }
		}

	}
}