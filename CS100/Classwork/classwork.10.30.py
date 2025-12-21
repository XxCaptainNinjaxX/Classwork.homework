#write a function count to five that prints numbers 1 - 5 using a while loop 
'''
def count_to_five():
   num=1
   while num <=5:
      print (num)
      num+=1
count_to_five()
'''
#write a function sum_numbers() that give sums numbers (given by the user one by one) until the user types stop 
'''
def sum_numbers():
   total=0
   num=0
   user=""
   while user!="stop":
      user=input("would you like to stop? if so say 'stop' ")
      if user=="stop":
         break
      num=int(input("Enter a number: "))
      total+=num
      return total
print(sum_numbers())
'''
'''
# write a function password_with_hint that asks the user for the password; then it gives hint after 3 tries. (the hint indicates the first letter of secret)
def password_with_hint(secret):
   count=0
   user=''
   while user!=secret:
      user=input("Enter a password: ")
      if user ==secret:
         print("Correct")
         break
      elif user != secret:
         count+=1
      if count==3:
         print("your hint is {}".format(secret[0]))
password_with_hint("password")
'''
   
#write a function skip_word(word,skip) that prints all charaters in word exept te skip charater 
def skip_word(word,skip):
   for i in word:
      if i ==skip:
         print("")
      else:
         print(i)
print(skip_word("words","o"))

#class 

def calc():
   
   while True:
      operation=input("choose: + - * /, or type exit")
      if operation == 'exit':
         print ('exit out of the calculator')
         break
      num1= float(input("Enter number 1: "))
      num2= float(input("Enter number 1: "))
      
      if operation == '+':
         print("Resut is {}".format(num1+num2))
      elif operation == '-':
         print("Resut is {}".format(num1-num2))
      elif operation == '/':
         if num2 != 0:
            print("Resut is {}".format(num1/num2))
         else:
            print("error, you cannot divide by 0")
      elif operation == '*':
         print("Resut is {}".format(num1*num2))
      else:
         print("invalid opperation")

calc()