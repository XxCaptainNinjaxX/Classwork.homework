
lis = [1,2,"three",True, [4,"five"]]

for item in range(len(lis)):
   print(lis[item])
print("----------")
print(lis[4][0])

lis[0]+=5

# Assign wall_area with a float read from input
print("enter wall area:")
wall_area = float(input())
print("type=",type(wall_area))

# Compute num_gallons
num_gallons = wall_area / 350.0

""" Your solution goes here """
print(f"{num_gallons:.5}","test")
