#create a program in python that prompts the user for how many numbers they want to input
#then, prompt the user for a intager, 
#then, check to see if the number is less than 100
   #if it is, add it to a seperate list
   #then print the entire list out
   
amnt=int(input("enter how many nums you wanna add: "))
lists=[]
for user in range(amnt):
   num=int(input("Your number: "))
   if num <= 100:
      lists.append(num)
      
print(lists)

