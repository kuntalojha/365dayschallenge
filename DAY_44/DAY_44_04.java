// Created by KUNTAL OJHA .
// Today 14/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/submit/PASSTHEEXAM
// Problem Title: Pass the Exam
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
		    int a = kuntal.nextInt();
		    int b = kuntal.nextInt();
		    int c = kuntal.nextInt();
		    
		    if(a+b+c>=100 && a>=10 && b>=10 && c>=10)
		    {
		        System.out.println("PASS");
		    }else {
		        System.out.println("FAIL");
		    }
		}

	}
}

