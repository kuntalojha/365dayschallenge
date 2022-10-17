// Created by KUNTAL OJHA .
// Today 17/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/submit/SUBSCRIBE_
// Problem Title: The Cooler Dilemma 1
// Programmng Language: C++



#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int x,m,y;
	    cin>>x>>y>>m;
	    
	    if(y>x*m)
	    {
	        cout<<"YES"<<endl;
	    }else
	    {
	        cout<<"NO"<<endl;
	    }
	}
	return 0;
}


