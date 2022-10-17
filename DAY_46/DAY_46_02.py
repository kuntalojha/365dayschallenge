# Created by KUNTAL OJHA .
# Today 17/10/2022 (dd/mm/yyyy)
# Problem Link: https://www.codechef.com/submit/CHEAPFOOD
# Problem Title: Best Coupon
# Programmng Language: PYTHON

  
  
def main():
    t = int(input())
    i=0 
    while i<t:
      i=i+1
      
      x = int(input())
      
      k = int(x*0.1)

      if k<=100:
          print("100")
      else:
          print(k)

if __name__=='__main__':
    main()







