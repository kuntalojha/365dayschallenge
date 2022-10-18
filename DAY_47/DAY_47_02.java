// Created by KUNTAL OJHA .
// Today 18/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/problems/CHEFCAND
// Problem Title: Chef and Candies
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
		    int n = kuntal.nextInt();
		    int x = kuntal.nextInt();
		    int y= n-x;
		    if(n<=x)
		    {
		        System.out.println("0"); 
		    }else if (y%4==0)
		    {
		        System.out.println(y/4);
		    }else
		    {
		        System.out.println((y/4)+1); 
		    }

		}

	}
}