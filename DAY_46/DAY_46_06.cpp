// Created by KUNTAL OJHA .
// Today 17/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/submit/TESTAVG
// Problem Title: Test Averages
// Programmng Language: C++



#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	  int a,b,c,l,m,n;
	  cin>>a>>b>>c;
	  
	  l = (a+b)/2;
      m = (a+c)/2;
      n = (b+c)/2;
      
      if (l >=35 && m >=35 && n >=35)
          cout<<"Pass"<<endl;
      else
          cout<<"Fail"<<endl;
	}
	return 0;
}



