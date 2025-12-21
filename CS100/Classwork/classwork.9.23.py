#ask for a word and check: Print "short" if length <= 3, Print "Medium" if 4-6 Print"Long" if>6

word=input("Enter a word: ")
if (len(word)<=3):
   print("This word is short")
   
elif (len(word)>=4 and len(word)<=6):
   print("This word is Medium")
   
else:
   print("This word is long")
   
#2 create a list nums = 1,2,3. Print Empty if the list is empoty, otherise print "not empty"
print("------------")

nums=[1,2,3]
if len(nums)!=0:
   print("list is not empty")
else:
   print("empty list")
   
#Print yes if sum of [1,2,3] is greater than 5
print("------------")

lis=[1,2,3]
if sum(lis)>5:
   print("yes")

#print has three if [3,7,3,1] contains at least 1 3
print("------------")

lis=[3,7,3,1]
hold=lis.count(3)
if hold!=0:
   print("list has a 3")
else:
   print("list does not have a 3")
   
#given:names = ['alice','bob','charlie'] ask the user to type a name. 
# If the name is in the list, print its index, else if it is not in the list, append and sort list, print final list
print("------------")

names = ['alice','bob','charlie']
ans=input("Enter a name: ")
if ans in names:
   print(names.index(ans))
else:
   names.append(ans)
   names.sort()
   print(names)
   
# remove 3 from [1,3,5 ] only if it exists
lis=[1,3,5]
if 3 in lis:
   lis.remove(3)
print(lis)

#ask the user for a number and check: print "negative" if <0, Print "zero" if 0, print "positive even" if >0 and eve Print "positive odd" otherise
num=int(input("Enter a num to get checked: "))
if num<0:
   print("Negative")
elif( num ==0):
   print("number is zero")
elif(num%2==0):
   print("num is even")
elif(num%2 != 0):
   print("num is odd")
   
#print "equal if " min of [4,7,9] is equal to 4
print("-------------")
lis=[4,7,9]

#write code that prints "yes " if 4 is in the lsit [1,2,3,4]
print("-------------")

lis=[1,2,3,4]
if 4 in lis:
   print("yes")
else:
   print("no")

#print "yes" if adv of [10,20,30] is greater than 15
print("-------------")
lis= [10,20,30]
adv=sum(lis)/len(lis)
if adv>15:
   print("yes")
else:
   print("no")

#given: a ="hi" b="There" Ask the user to type "join" or "repeat" if "join", print a and b concatenated with a space, else if "repeat", print a repeated 3 times. Otherwise print "invalid satmeent"
a="Hi"
b="There"

userInput=input("join or repeat: ")
if userInput == 'join':
   print(a +' '+b)
elif userInput == "repeat":
   print(a*3)
else:
   print("Invalid input")
#write code to check if the last element of pets=['ant','bat','cow'] is 'cow'
pets=['ant','bat','cow']
if pets[-1]=="cow":
   print("last element is cow")
else:
   print("naur")
   