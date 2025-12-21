import string

#Write code that converts user input to lowercase and print it 
#_____________________________________________________________________
'''
str1= input("Enter a word: ")
str1=str1.lower()
print(str1)
'''
#_____________________________________________________________________
#write a function 'clean_words' that splits a sentence into words and removes punctuation from each word
'''
nums=int(input("How many words do you want: "))
wordsList=[]
for i in range(nums):
   word=input("Enter your word: ")
   wordsList.append(word)
   word=""
newwords=[]

def cleanwords (wordsList):
   for word in wordsList:
      word = word.strip(string.punctuation)
      newwords.append(word)
   return newwords
print(cleanwords(wordsList))
'''
#_____________________________________________________________________
# write a function odd_count that returns the number of odd ints in a list
'''
nums_list =[1,2,3,4,5]

def odd_count(first):
   count=0
   for num in first:
      if num % 2 != 0:
         count+=1
      return count 
print(odd_count(nums_list))
'''
#_____________________________________________________________________
#Wrie a function voweWrods() that takes 1 paramater: text, a string containing words and white spaces.
#the function returens the nuber of all words that start in a vowel.
# For example, if text says: Hi everyone It is what it is python is fun
#Funtion returns "6"
'''
text=input("Enter a sentence and ill give you the vowel nums: ")

def vowelWords(text):
   count = 0
   wordsList = text.lower().split()
   for word in wordsList:
      if word[0] == wordsList:
         count+=1
         
print(vowelWords(text))
'''
#_____________________________________________________________________
#Write a function count_vowels that returns the number of vowels in s 
'''
def count_vowels(s):
   count = 0
   for char in s:
      if char.lower() in "aeiou":
         count +=1
      return count
print(count_vowels("abcde"))
'''
#_____________________________________________________________________
#Write a function is_all_digits (s) that returns True if s contains only digits
'''
def is_all_digits(strings):
   if strings.type==int:
      return True
   else:
      return False
   
strings=input("Enter something: ")
   
print(is_all_digits(strings))
'''
#_____________________________________________________________________
#Write a function odd_list(lst) that returns a new list with only odd numbers from the input
oglist=[1,2,3,4,5,6,7,8,9]
newlist=[]
def odd_list(lst):
   print(lst.length)
   
   for num in range(lst.length):
      if num%2 != 0:
         newlist.append(num)
   return newlist
print(odd_list(oglist))

#_____________________________________________________________________
#Write a function repeatedWords() that takes 1 parameter: text, a string containing words and white spaces The function returns a list of words that repeat in the text.
#Case letters doesn't matter For example, if text is:
#Hi everyone
#It is what it is python is fun
#the function returns l'it', 'is','it','is' ,'is']
#Bonus: return a list of distinct words that repeat. L'it','is']'

def repeatedWords(text):
   results = []
   wordsList = text.lower.split()
   
   for word in wordsList:
      wordsList.count(word)
   