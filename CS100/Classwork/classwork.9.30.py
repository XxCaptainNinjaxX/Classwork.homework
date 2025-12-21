#Count how many times the letter "a" appears in "banana" using a for loop 
string="banana"
num=0
for letter in string:
   if letter=="a":
      num+=1
print("There is an 'a' "+str(num)+" times in "+string)

#2 Print "Hello" 3 times using a for loop 
for num in range(3):
   print("Hello")
   
#3 find the sum of even numbers from a list [1,2,3,4,5,6]
orignal=[1,2,3,4,5,6]
new=[]
for num in range(len(orignal)):
   if num%2 == 0:
      new.append(orignal[num])

print("Sum of even numbers is: "+ str(sum(new)))

#4 Remove vowels from "Python rocks"
string="Python rocks"
vowels=["A","a","E","e","I","i","O","o","Y","y"]
newString=""

for charater in string:
   if charater not in vowels:
      newString= newString+charater
print(newString)

#5 Write a program that uses a for loop to count how many students recived an A grade. Assume the grading scale is A:90-100

scores=[90,80,50,100]
count=0
for score in scores:
   if score >=90 and score<=100:
      count+=1
print("There are "+str(count)+" people in the class that got an A")

#6 Print the numbers 1-5 using a for loop
num=-1
for num in range(5):
   print(num+1)

#7 print all numbers from 1-10 that are divisable by 3

for i in range (1,11):
   if i%3==0:
      print(i)
      
#8 create a new list with only the even numbers from [10,15,20,25]
nums=[10,15,20,25]
new_list=[]
for num in nums:
   if num%2==0:
      new_list.append(num)
print(new_list)

#9 Write a program that uses a for loop to generate a string containing the initials of each person's name. Example input: names=["Alice","Bob","Charlie","Dana"]
namesList=["Alice","Bob","Charlie","Dana"]

initials_string=""
for name in namesList:
   intial=name[0]
   initials_string=initials_string+intial
print(initials_string)