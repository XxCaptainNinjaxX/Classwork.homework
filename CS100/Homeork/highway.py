#Primary U.S. interstate highways are numbered 1-99.
# Odd numbers (like the 5 or 95) go north/south, and evens (like the 10 or 90) go east/west.
# Auxiliary highways are numbered 100-999, and service the primary highway indicated by the rightmost two digits. 
# Thus, I-405 services I-5, and I-290 services I-90. Note: 200 is not a valid auxiliary highway because 00 is not a valid primary highway number.

#Given a highway number, indicate whether it is a primary or auxiliary highway. 
# If auxiliary, indicate what primary highway it serves. Also indicate if the (primary) highway runs north/south or east/west.

#find if even or odd
   #even = east/west
   #odd = north/south

   #100-999 = Auxiliary Highway 

#input
highwayIMP=int(input("Please enter a highway num: "))
stringIMP=str(highwayIMP)

#acceptable statments
if highwayIMP==0 or highwayIMP>1000 or stringIMP[-1]=="0" and stringIMP[-2]=="0":
   print(stringIMP+" is not a valid interstate highway number. ")
else:
#oddEven
   oddEven=""
   if highwayIMP%2==0:
      oddEven="east/west"
   elif highwayIMP%2==1:
      oddEven="north/south"
      
# type
   typeHigh = ""
   if highwayIMP >= 1 and highwayIMP <= 99:
        typeHigh = "primary"
   elif highwayIMP >= 100 and highwayIMP <= 999:
        typeHigh = "auxiliary"

    # output
   if typeHigh == "primary":
        print("I-{} is primary, going {}.".format(highwayIMP, oddEven))
   else:
        primaryServed = highwayIMP % 100
        if primaryServed == 0:
            print("{} is not a valid interstate highway number.".format(highwayIMP))
        else:
            direction = "east/west" if primaryServed % 2 == 0 else "north/south"
            print("I-{} is auxiliary, serving I-{}, going {}.".format(highwayIMP, primaryServed, direction))
