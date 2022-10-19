// Created by KUNTAL OJHA .
// Today 18/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/problems/TEA
// Problem Title: Chef Drinks Tea
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
	    
	    if(x<y)
	    {
	        cout<<z<<endl;
	    }
	    else if(x%y==0)
	    {
	        cout<<(x/y)*z<<endl;
	    }else {
	        cout<<((x/y)+1)*z<<endl;
	    }
	}
	return 0;
}
