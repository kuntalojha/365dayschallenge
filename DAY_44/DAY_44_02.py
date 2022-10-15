# Created by KUNTAL OJHA .
# Today 14/10/2022 (dd/mm/yyyy)
# Problem Link: https://www.codechef.com/submit/MARKSTW
# Problem Title: Alice and Marks
# Programmng Language: PYTHON



# 1st method
x,y=map(int,input().split())

if x>= 2*y:
    print("YES")
else:
    print("NO")



# 2nd method
def main():
    x,y=map(int,input().split())

    if x>= 2*y:
        print("YES")
    else:
        print("NO")
        
if __name__=='__main__':
    main()
