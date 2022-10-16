# Created by KUNTAL OJHA .
# Today 15/10/2022 (dd/mm/yyyy)
# Problem Link: https://www.codechef.com/submit/TVDISC
# Problem Title: TV Discount
# Programmng Language: PYTHON

  
  
def main():
    t = int(input())
    i=0 
    while i<t:
      i=i+1
      
      a,b,c,d=map(int,input().split())
      
      e=a-c
      f=b-d
      
      if e==f:
          print("Any")
      elif e<f :
          print("First")
      else:
          print("Second")

if __name__=='__main__':
    main()

    
