#-------------
                                                            #for loops
#------------- 
'''
for letter in 'apple':
   print(letter)
# creates a variable name, will get asign to the first value, this case "a" cause string hsa multiple charaters 
'''
#-----------------------------------------------------------------------------------------------------------------------------------------------
'''
msg='how are you'
for char in msg:
   print(char)
#same thing but goes thru the variable 'msg'
'''
#-----------------------------------------------------------------------------------------------------------------------------------------------

   #itterating thru a list 
'''
lis=['zero','one','two','three','four']
num=0
for var in lis:
   print(var)
   num+=1
   print(num)
'''

#-----------------------------------------------------------------------------------------------------------------------------------------------
#for loop with a range or a stopping point
'''
num=0
for num in range(5):
   print(num)
'''
#-----------------------------------------------------------------------------------------------------------------------------------------------
#itterating thru a list like in js or java
'''
test =["one","two","three"]
num1=0
for num1 in range(len(test)):
   print(test[num1])
'''
   
#-----------------------------------------------------------------------------------------------------------------------------------------------
#-------------
                                                            #lists
#------------- 
#creating a copy of a list and editing it
'''
list1=["blue","red","yellow","purple"]
list2=list1[:] # <-- creates a copy of list1 and puts it in list2

item=0

print("")
for item in range(len(list1)):
   print(list1[item])
   
print("------------------")
print("list2:")
print("")


for item in range(len(list2)):
   list2[item]=list2[item]+"!"
   print(list2[item])
'''
#-----------------------------------------------------------------------------------------------------------------------------------------------
#-----------------------------------------------------------------------------------------------------------------------------------------------
#------------------------------------------------------------------------------------------------------------------------------------------------
#                                                               Mid term 2
#-----------------------------------------------------------------------------------------------------------------------------------------------
#-----------------------------------------------------------------------------------------------------------------------------------------------
#-----------------------------------------------------------------------------------------------------------------------------------------------





#                                                           built in functions

# .lower(), 
# .upper(), 
# .startswith(), 
# .replace(), 
# = does what you expect 

#-----------------------------------------

#.strip() = gets rid of leading and trailing charaters from a text, unless sum in ()
text="  blah blah blahhh    "
print(text.strip())

#-----------------------------------------

# .find() = finds in (), spits out int, starting 1 
print("there are {} h's in the text".format(text.find("h")))

#-----------------------------------------


#-----------------------------------------------------------------------------------------------------------------------------------------------

#                                                            Files

#-----------------------------------------------------------------------------------------------------------------------------------------------

#will open or create a file, w = writing inside the file insted of just viewing
file1= open('greeting.txt','w')

#adds the following wtv within the file 
file1.write("Hello world")

#closes the file and ends wtv 
file1.close()



#------------------------------------
#reading files
#------------------------------------
'''
.read
.readline

'''


#will read the entire file unless put x amnt of charters 
file1.read()

#will read ONLY the first two charaters
file1.read(2)


#-----------------------------------------------------------------------------------------------------------------------------------------------

#                                                                File practice 

'''
can you create practice problems in python that deals with files, reading, writing, opening and closing files
'''
#-----------------------------------------------------------------------------------------------------------------------------------------------

