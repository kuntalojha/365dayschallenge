// Created by KUNTAL OJHA .
// Today 14/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/submit/TCKTFINE
// Problem Title: Ticket Fine
// Programmng Language: C++



#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int x,p,q;
	    cin>>x>>p>>q;
	    
	    cout<<(p-q)*x<<endl;
	}
	return 0;
}

