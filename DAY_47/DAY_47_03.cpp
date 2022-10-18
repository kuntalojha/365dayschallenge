// Created by KUNTAL OJHA .
// Today 18/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/problems/JENGA
// Problem Title: Jenga Night
// Programmng Language: C++



#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int n,x;
	    cin>>n>>x;
	    
	    if(n<=x && x%n==0)
	    {
	        cout<<"YES"<<endl;
	    }else
	    {
	        cout<<"NO"<<endl;
	    }
	    
	}
	return 0;
}