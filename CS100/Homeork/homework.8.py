# Define your functions here.

def int_to_reverse_binary(integer_value):
    """
    Takes a positive integer and returns a string
    of 1's and 0's representing the integer in binary
    (in reverse order).
    """
    # Start with an empty string
    reverse_binary_string = ""
    
    # Handle the special case of 0
    if integer_value == 0:
        return "0"
        
    # Loop as long as the integer is greater than 0
    while integer_value > 0:
        # Get the remainder (0 or 1)
        remainder = integer_value % 2
        
        # Add the remainder to our string
        reverse_binary_string += str(remainder)
        
        # Update the integer using integer division
        integer_value = integer_value // 2
        
    return reverse_binary_string

def string_reverse(input_string):
    """
    Takes an input string and returns a new
    string with the characters in reverse order.
    """
    # The [::-1] slice notation is a concise way
    # to reverse a string in Python.
    return input_string[::-1]


if __name__ == '__main__':
    # Type your code here.
    # Get the integer input from the user
    num = int(input())
    
    # 1. Call int_to_reverse_binary() to get the binary string in reverse
    reversed_binary = int_to_reverse_binary(num)
    
    # 2. Then call string_reverse() to get the correct order
    correct_binary = string_reverse(reversed_binary)
    
    # 3. Print the final result
    print(correct_binary)