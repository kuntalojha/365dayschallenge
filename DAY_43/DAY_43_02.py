# Created by KUNTAL OJHA .
# Today 13/10/2022 (dd/mm/yyyy)
#  Problem Link: https://www.codechef.com/submit/CHEFONDATE
# Problem Title: Chef On Date
# Programmng Language: PYTHON



def main():
    t = int(input())
    i=0 
    while i<t:
      i=i+1
      
      x,y=map(int,input().split())
      
      if x>=y:
          print("YES")
      else:
          print("NO")
        
if __name__=='__main__':
    main()