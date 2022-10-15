# Created by KUNTAL OJHA .
# Today 14/10/2022 (dd/mm/yyyy)
# Problem Link: https://www.codechef.com/submit/TCKTFINE
# Problem Title: Ticket Fine
# Programmng Language: PYTHON

  
  
def main():
    t = int(input())
    i=0 
    while i<t:
      i=i+1
      
      x,p,q=map(int,input().split())
      print((p-q)*x)
if __name__=='__main__':
    main()
    

x,y=map(int,input().split())

if x>= 2*y:
    print("YES")
else:
    print("NO")


def main():
    x,y=map(int,input().split())

    if x>= 2*y:
        print("YES")
    else:
        print("NO")
        
if __name__=='__main__':
    main()