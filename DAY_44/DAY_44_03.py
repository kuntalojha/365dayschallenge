# Created by KUNTAL OJHA .
# Today 14/10/2022 (dd/mm/yyyy)
# Problem Link: https://www.codechef.com/submit/CARTRIP
# Problem Title: Car Trip
# Programmng Language: PYTHON



def main():
    t = int(input())
    i=0 
    while i<t:
      i=i+1
      
      x =int(input())
      
      if x<=300:
          print("3000")
      else:
          print(x*10)

if __name__=='__main__':
    main()




