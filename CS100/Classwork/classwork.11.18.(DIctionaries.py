#Create a diectinary that stores a student's name Alics and major CS
students={"name":"Alice",
          "major":"CS"}

#Write a function usernames_with_a(user) that returns a list of usernames containing 'a'
#users is a disctionary containing usernames as keys and userages as calues.
#for example:users ={'Ronaldo': 19, 'rose':21,"Darine":18}
users ={'Ronaldo': 19, 'rose':21,"Darine":18}
def usernames_with_a(users):
   newlist=[]
   for user in users:
      if "a" in user:
         newlist.append(user)
      else:
         continue
   return newlist
print(usernames_with_a(users))

#write a function char_frequency(s) that builds a frequency dictionary of charaters in a string 
def char_frequency(s):
   result={}
   for char in s:
      if char not in result:
         result[char]=1
      else:
         result[char]+=1
   return result
text="asdfa"
print(char_frequency(text))

#4
menu={"latte":4.50}
menu['motcha']=5.00
print (menu)

#Werite a function long_destionations(destination) the returns all the destination names longer then 6 char
def long(place):
   result=[]
   for dest in place.values():
      if len(dest)>6:
         result.append(dest)
   return result
temp={"dest 1": 'New York', "dest 2": "New Jersey", "dest 3": "Pennslavania"}
print(long(temp))

#write a function group_transactions(nums) thar returns a dictionary with keys 'even' and "odd"
def group_transactions(nums):
   numDict = {"even":[],"odd":[]}
   for num in nums:
      if num%2==0:
         numDict['even'].append(num)
      else:numDict["odd"].append(num)
   return numDict
numList = [1,2,3,4,5,69,20,40,21]
print(group_transactions(numList))

#given employee ={"email":"RJames@njit.edu"} write the expression to retrive and print the value stored in the key
employee ={"email":"RJames@njit.edu"}
print(employee["email"])

#8
def filter_admins(account):
   admins = {}
   for user in account:
      if user.startswith("admin"):
         admins[user]=account[user]
   return admins 
account={"admin Jorje":"jorje123@gmail.com","ryan":"ryan@njit.edu"}
print(filter_admins(account))

#given: menu={"latte":4.50} change the value of 'latte' in menu to 5.25
menu["latte"]=5.25

#incriment the value stored at key 'views' in dictionary page by 1. 
page={"views":12}
page["views"]+=1
print(page)