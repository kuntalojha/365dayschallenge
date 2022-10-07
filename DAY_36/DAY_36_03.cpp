// Created by KUNTAL OJHA .
// Today 07/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/OCT221D/problems/MINPIZZA
// Problem Title: Minimum Pizzas


#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int n,x,a,b;
	    cin>>n>>x;
	    a=n*x;
	    if(a%4==0)
	    {
	        cout<<a/4<<endl;
	    }else
	    {
	        cout<<(a/4)+1<<endl;
	    }
	}
	return 0;
}
