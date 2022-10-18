// Created by KUNTAL OJHA .
// Today 18/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/problems/ACTEMP
// Problem Title: Air Conditioner Temperature
// Programmng Language: C++



#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int a,b,c;
	    cin>>a>>b>>c;
	    
	    if(b>=a && b>=c && (a>=b || b>=a))
	    {
	        cout<<"YES"<<endl;
	    }else 
	    {
	        cout<<"NO"<<endl;
	    }
	}
	return 0;
}