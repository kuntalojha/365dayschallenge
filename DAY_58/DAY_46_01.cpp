// Created by KUNTAL OJHA .
// Today 17/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/submit/SUBSCRIBE_
// Problem Title: Subscriptions
// Programmng Language: C++



#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int x,a=0;
	    float n, b=0;
	    cin>>n>>x;
	    a= n/6;
	    b= n/6;
	    
	    if(a==b)
	    {
	        cout<<a*x<<endl;
	    }else
	    {
	        cout<<(a+1)*x<<endl;
	    }
	}
	return 0;
}

