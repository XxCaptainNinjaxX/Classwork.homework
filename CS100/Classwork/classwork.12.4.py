 
class CollegeDirectory:
   def __init__(self,collegeName):
      self.cName=collegeName
      self.students={}
      
   def addStudent(self,studentName,emailAddress):
      self.students[studentName]=emailAddress
      
   def getEmailList(self):
      emailList=[]
      for name in self.students:
         string='{} <{}>'.format(name,self.students[name])
         emailList.append(string)
         
         return emailList
      
college1 = CollegeDirectory('NJIT')
college1.addStudent("john","John@njit.edu")

print(college1.getEmailList())
 




# -----------------------------------------------------------------------------------
#Jacob Parry and Robert Rodriguez
# -----------------------------------------------------------------------------------
 
# Question 1

def age_vertification():
   
   try:
      if userAge < 13:
         userAge=int(input("Enter your age as a number: "))
         print("you must be 13+ to sign up.")
      else:
         print("Signup successful!")
   except:
      print("Please enter a number")

age_vertification()
 
# -----------------------------------------------------------------------------------
# Question 2

class BankAccount:
   def __init__(self,userName,balance):
      self.cName = userName
      self.balance = balance
      
   def withdraw(self,amnt):
      try:
         if amnt < self.balance:   
            self.balance = self.balance - amnt
            return self.balance
            
      except:
            print("Error, you will either have a negative balance or you did not enter a interger")
            
            
account1= BankAccount("Account Name", 1000)
print(account1.withdraw("hi"))
print(account1.withdraw(100))


      
# -----------------------------------------------------------------------------------
# Question 3

def calculator():
    while True:
        try:
            num1 = int(input("Enter your first number: "))
            break
        except:
            print("Please enter a number")

    while True:
        try:
            num2 = int(input("Enter your second number: "))
            break
        except:
            print("Please enter a number")

    while True:
        operator = input("Enter your operator or 'done' to exit: ")
        if operator == "done":
            return None
            
        if operator in "+-*/":
            break

        else:
            print("Please enter a +, -, *, or /")

    try:
        if operator == "*":
            return num1 * num2
        elif operator == "/":
            return num1 / num2
        elif operator == "+":
            return num1 + num2
        else:
            return num1 - num2
    except:
        print("An error occured in the calculation")
        return None

print(calculator())
 