// Created by KUNTAL OJHA .
// Today 14/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/submit/SNDMAX
// Problem Title: Second Max of Three Numbers
// Programmng Language: C++



#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int x,y,z;
	    cin>>x>>y>>z;
        
        if((x>y && x<z ) || (x<y && x>z))
        {
            cout<<x<<endl;
        }else if((y>x && y<z ) || (y<x && y>z)) 
        {
            cout<<y<<endl;
        }else
        {
            cout<<z<<endl;
        }
	}
	return 0;
}

