
// Created by KUNTAL OJHA .
// Today 08/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/OCT221D/problems/BUILDINGRACE
// Problem Title: Building Race




#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    float a,b,x,y;
	    cin>>a>>b>>x>>y;
	    float kuntal=a/x ,ojha=b/y;
	    
	    if(kuntal==ojha)
	    {
	        cout<<"Both"<<endl;
	    }else if(kuntal<ojha)
	    {
	        cout<<"Chef"<<endl;
	    }else {
	        cout<<"Chefina"<<endl;
	    }
	}
	return 0;
}
