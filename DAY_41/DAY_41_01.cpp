// Created by KUNTAL OJHA .
// Today 12/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/problems/TAXES
// Problem Title: Tax in Chefland
// Programmng Language: C++



#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int x;
	    cin>>x;
	    if(x<=100)
	    {
	        cout<<x<<endl;
	    }else {
	        cout<<x-10<<endl;
	    }
	}
	return 0;
}

