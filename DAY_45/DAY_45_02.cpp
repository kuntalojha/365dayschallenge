// Created by KUNTAL OJHA .
// Today 15/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/submit/BROKENPHONE
// Problem Title: Broken Phone
// Programmng Language: C++



#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int x,y;
	    cin>>x>>y;
	    
	    if(x==y)
	    {
	        cout<<"ANY"<<endl;
	    }else if (x<y)
	    {
	        cout<<"REPAIR"<<endl;
	    }else
	    {
	        cout<<"NEW PHONE"<<endl;
	    }
	}
	return 0;
}


