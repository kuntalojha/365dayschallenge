// Created by KUNTAL OJHA .
// Today 08/10/2022 (dd/mm/yyyy)
// Problem Link: https://www.codechef.com/OCT221D/problems/BUILDINGRACE
// Problem Title: Building Race

  
  
def main():
    t = int(input())
    for i in range(t):
        a,b,x,y=map(int,input().split())
        a=a/x
        b=b/y
    
        if a==b:
            print("Both")
        elif a<b:
            print("Chef")
        else:
            print("Chefina")


if __name__=='__main__':
    main()

    
