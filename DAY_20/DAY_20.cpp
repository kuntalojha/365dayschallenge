// Created by KUNTAL OJHA .
// Today 20/09/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/submit/AVGPROBLEM
// Problem Title: Greater Average.
// Programmng Language: C++



#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	   float a,b,c;
	   cin>>a>>b>>c;
	   
	   if((a+b)/2>c)
	   {
	       cout<<"YES"<<endl;
	   }else
	   {
	       cout<<"NO"<<endl;
	   }
	}
	return 0;
}
