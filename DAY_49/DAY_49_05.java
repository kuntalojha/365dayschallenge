// Created by KUNTAL OJHA .
// Today 19/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/problems/WGHTS
// Problem Title: Weights
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
		    int w = kuntal.nextInt();
		    int x = kuntal.nextInt();
		    int y = kuntal.nextInt();
		    int z = kuntal.nextInt();

            if( w==x+y || w==x+y+z || w==x+z || w==y+z || w==x || w==y || w==z)
            {
                System.out.println("YES");
            }else 
            {
                System.out.println("NO");
            }
		}

	}
}