#Write the code that prints the absolute value of -99
print(abs(-99))

#--------------------------------------------------------------------------------------------------------------------
#Print the max of 5, 12, -3, 9
arry=[5,12,-3,9]
print(max(arry))
#--------------------------------------------------------------------------------------------------------------------
#Write code that calculates the area of a rectangle with the width of 10 and height of 4

width =10
height = 4
print("area = ",width*height)
#--------------------------------------------------------------------------------------------------------------------
#ask the user to enter their age and print "Next year you will be: "

age =input("enter your current age: ")
age=int(age)
print("next year you will turn ",age+1)
#--------------------------------------------------------------------------------------------------------------------

#Store Python in a variable and print its first and last charater together

var="Python"
print(var[0]+var[-1])
#--------------------------------------------------------------------------------------------------------------------

#Write a program that takes two integers and prints both their quotient and remainder
var1=int(input("Enter a num: "))
var2=int(input("Enter a second num: "))

quo=var1//var2
rem=var1%var2
print("the quotient of these two numbers is {} and the remainder is {}".format(quo,rem))
#--------------------------------------------------------------------------------------------------------------------
#Create a Varibale x =7 and print its ^2

x=7
print(x**2)
#--------------------------------------------------------------------------------------------------------------------
#find and print the smallest number between 14,9,21,3
holder=[14,21,3,9]
hold=min(holder)
str(hold)
print("min of these numbers are",hold)

#ask the user for two num and print "a^b=result"
num1=int(input("enter the first num:"))
num2=int(input("enter the second num:"))

print("a^b = {}".format(num1**num2))
#--------------------------------------------------------------------------------------------------------------------
#Print the remainder when 25 is divided by 4
print("the remainder of 25 / 4 is:{}".format(25%4))
#--------------------------------------------------------------------------------------------------------------------
#Store your first and last name in 2 variables and print them tg as 1 string
first=input("Enter your first name:")
last=input("Enter your last name:")
print("is your name, {} ?".format(first+last))

#--------------------------------------------------------------------------------------------------------------------
#Convert the string "123" into an interger and print
string="123"
print(int(string))
#--------------------------------------------------------------------------------------------------------------------
#store the num 3.14 in a var and check its type
num=3.14
print("the type of num is: {}".format(type(num)))
#--------------------------------------------------------------------------------------------------------------------
#Write the code that asks the user for their name and print it in the format"Hello,!". (using the f string of format function)
name=input("enter your name pofavor: ")
print("hello {} its great to see you!".format(name))
#--------------------------------------------------------------------------------------------------------------------
#Write code that prints weather 12345 is even or not
num =12345
if(num%2==0):
   print("num is even")
else:
   print("num is odd")
#--------------------------------------------------------------------------------------------------------------------
#Store '5.75' in a variable, then convert it into an interger 
var1="5.75"

print(float(var1))