# Created by KUNTAL OJHA .
# Today 17/10/2022 (dd/mm/yyyy)
# Problem Link: https://www.codechef.com/submit/SUGARCANE
# Problem Title: Sugarcane Juice Business
# Programmng Language: PYTHON



def main():
    t = int(input())
    i=0 
    while i<t:
      i=i+1

      n = int(input())
      
      n=n*50
      print(int(n-((n*0.2)+(n*0.2)+(n*0.3))))


if __name__=='__main__':
    main()