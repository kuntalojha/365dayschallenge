// Created by KUNTAL OJHA .
// Today 15/09/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/problems/F1RULE
// Problem Title: Miami GP.


#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    double x;
	    int y;
	    cin>>x>>y;
	    if((x*1.07)>=y)
	    {
	        cout<<"YES"<<endl;
	    }else
	    {
	        cout<<"NO"<<endl;
	    }
	}
	return 0;
}
