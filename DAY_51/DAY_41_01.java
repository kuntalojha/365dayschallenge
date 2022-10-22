// Created by KUNTAL OJHA .
// Today 22/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/problems/BIRDFARM?tab=statement
// Problem Title: Chef and Bird farm
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
	    	int y = kuntal.nextInt();
	    	int z = kuntal.nextInt();
		    
		    if (z%x==0 && z%y==0) 
		        System.out.println("ANY");
		    else if (z%x==0) 
		        System.out.println("CHICKEN");
		    else if(z%y==0) 
		        System.out.println("DUCK");
		    else 
		        System.out.println("NONE");
            
		}

	}
}
