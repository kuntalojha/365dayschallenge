// Created by KUNTAL OJHA .
// Today 29/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/problems/SST
// Problem Title: Sasta Shark Tank
// Programmng Language: C++



#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int a,b;
	    cin>>a>>b;
	    
	    if(a*10 == b*5)
	    {
	        cout<<"ANY"<<endl;
	    }else if(a*10> b*5)
	    {
	        cout<<"FIRST"<<endl;
	    }else
	    {
	        cout<<"SECOND"<<endl;
	    }
	}
	return 0;
}

