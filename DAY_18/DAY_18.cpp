// Created by KUNTAL OJHA .
// Today 18/09/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/submit/SALESEASON
// Problem Title: Sale Season.
// Programmng Language: C++



#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int x;
	    cin>>x;
	    
	    if(x<=100)
	    {
	        cout<<x<<endl;
	    }else if (100<x && 1000>=x)
	    {
	        cout<<x-25<<endl;
	    }else if (1000 < x && 5000>=x)
	    {
	        cout<<x-100<<endl;
	    }else
	    {
	        cout<<x-500<<endl;
	    }
	}
	return 0;
}




