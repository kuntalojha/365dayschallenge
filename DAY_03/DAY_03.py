// Created by KUNTAL OJHA .
// Today 24/08/2022 (dd/mm/yyyy)
// Problem Link: https://www.hackerrank.com/challenges/py-if-else/problem?isFullScreen=true
// Problem Title:  Java If-Else. 
  
    n = int(input().strip())
    if n%2 !=0:
        print("Weird");
    elif n>=2 and n<=5:
        print("Not Weird")
    elif n>=6 and n<=20:
        print("Weird")
    else:
        print("Not Weird")
