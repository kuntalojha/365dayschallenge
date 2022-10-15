// Created by KUNTAL OJHA .
// Today 14/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/submit/ENSPACE
// Problem Title: Enough Space
// Programmng Language: C++



#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int n,x,y;
	    cin>>n>>x>>y;
	    
	    if(n>=(x*1)+(y*2))
	    {
	        cout<<"YES"<<endl;
	    }else
	    {
	        cout<<"NO"<<endl;
	    }
	}
	return 0;
}
