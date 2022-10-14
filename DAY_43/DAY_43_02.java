// Created by KUNTAL OJHA .
// Today 13/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/submit/CHEFONDATE
// Problem Title: Chef On Date
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
            int x,y;
            x = kuntal.nextInt();
            y = kuntal.nextInt();
            
            if(x>=y)
            {
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }
		}

	}
}
