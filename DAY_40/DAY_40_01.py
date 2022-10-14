# Created by KUNTAL OJHA .
# Today 11/10/2022 (dd/mm/yyyy)
# Problem Link:
# Problem Title:
# Programmng Language: PYTHON

  
  
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

    
