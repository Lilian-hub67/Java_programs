from random import *
import os 
u_pwd = input("Enter a password:")
pwd=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
     '1','2','3','4','5','6','7','8','9','0']
pw=""
while(pw!=u_pwd):
    pw=""
    for letter in range(len(u_pwd)):
        guess_pwd = pwd[randint(0,35)]
        pw = str(guess_pwd) + str(pw)
    print(pw)
print("Password is cracked!")
os.system("cls")
print("your password is: " + u_pwd)