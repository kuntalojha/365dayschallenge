// Created by KUNTAL OJHA .
// Today 12/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/submit/EXPERT
// Problem Title: Expert Setter
// Programmng Language: C++


#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    float y,x;
	    cin>>y>>x;
	    
	    if( ((x/y)*100) >= 50)
	    {
	        cout<<"YES"<<endl;
	    }else
	    {
	        cout<<"NO"<<endl;
	    }
	}
	return 0;
}

