
#Write code that will write the line 'Hello, world!' into a text file named greeting.txt

file1= open('greeting.txt','w')
file1.write("Hello world")
file1.close()


#----------------------------------------------------------------------------------------------------------------------------

#write a code that will print the first 3 lines of a text named data.txt

file1 = open('greeting.txt', 'r')
linesList = file1.readlines()[0:3]
print(linesList)
file1.close()

#----------------------------------------------------------------------------------------------------------------------------

#write a program that writes hello 5 times to data.txt
outfile=open('greeting.txt','w')
for i in range(5):
   outfile.write("hello\n")
outfile.close()

#----------------------------------------------------------------------------------------------------------------------------

inFile = open('scores.txt','r')
for line in inFile:
   wordsList=line.split()
   name=wordsList[0]
   print(name)
inFile.close()

#----------------------------------------------------------------------------------------------------------------------------

#create a function named getAverage(filename),return the avg score of exam

def getAverage(filename):
   files=open(filename,'r')
   scoreList=[]
   
   for line in files:
      wordsList=line.split()
         #going to be str so have to convert to int
      score=int(wordsList[1])
      scoreList.appen(score)
   filename.close
   return sum(scoreList)/len(scoreList)

#----------------------------------------------------------------------------------------------------------------------------
#Write a program that copies only lines containing the string 'python' from notes.txt into a new file called 'python_notes.txt'

infile=open('notes.txt','r')
outfile=open("python_notes.txt",'w')
for line in infile:
   if 'python' in line:
      outfile.write(line)
infile.close()
outfile.close()
#----------------------------------------------------------------------------------------------------------------------------
#write code to open a file named poem.txt in read mode and print its entire content to the screen

file=open('poem.txt','r')
content=file.read()
print(content)
file.close()

#----------------------------------------------------------------------------------------------------------------------------
#write code that print only the first word of each line from a text file named students.txt 
file=open('students','r')
for line in file:
   print(line.split()[0])
file.close()

#----------------------------------------------------------------------------------------------------------------------------
#write a function numWords(filename) that retuns the number of words in a file
def numWords(filename):
   idk=open(filename,'r')
   data=inFile.read()
   wordsList=data.split()
   idk.close()
   return len(wordsList)

#----------------------------------------------------------------------------------------------------------------------------
#write a function studensWithAs() that takes two parameters: 
# 1. name, the name of an input file containing students scores in this format: studentsName™ studentsScore 
# 2.name2, the name of an output file to write to The function writes to the output file the names of the students who got an A, one name per line. 
# For example, if namel is "scores.txt" the output file should contain John Jill

def studentsWithAs(name,name2):
   inputFile=open(name,'r')
   outputFile=open(name2,'w')
   
   for line in inputFile:
      wordsList=line.split()
      name = wordsList[0]
      score=int(wordsList[1])
      
      if score>= 90:
         outfile.write(name+'\n')
   inFile.close()
   outfile.close()

studentsWithAs('scores.txt','out.txt')