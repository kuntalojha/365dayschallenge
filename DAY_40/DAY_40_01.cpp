// Created by KUNTAL OJHA .
// Today 11/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/problems/LAZYCHF
// Problem Title: Lazy Chef
// Programmng Language: C++



#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int x,m,d;
	    cin>>x>>m>>d;
	    
	    if(m*x >= x+d)
	    {
	        cout<<x+d<<endl;
	    }else
	    {
	        cout<<m*x<<endl;
	    }
	}
	return 0;
}

