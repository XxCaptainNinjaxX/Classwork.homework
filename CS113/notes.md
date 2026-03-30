# Java notes

### Concatinate

```Java
"CS" + 1 + 13 = CS113
13 + 1 + "CS" = 14CS

```

### Data types

```Java
// Intagers
byte - 8 bits,   min -128,           max, 127
short - 16 bits, min -32,768,        max, 32,767
int - 32 bits,   min -2,147,483,648, max, 2,147,483,647
long - 64 bits

float - 32 bits
double - 64 bits

//Charaters
char - 16 bits, "a"


```

---

# Chapter 3

### Classes

```Java
//Objects creating

   // assign, new, Constructior class, Paramters, close

   // classname var = classname();

String t = new _____String("hello")______;
```

### Creating a class

- method within a class = function in java
    - Method types:

        ```java
        void method1(/*paramaters*/) {}

        int method2(/*paramaters*/) {}
        ```

---

# Chapter 6

### Swtiches

Usefule for nested if statments that need to be exact

```Java

switch (category)
{

case 10:
  System.out.println("a perfect score. Well done.");
  break;

  case 9:
  System.out.println("well above average. Excellent.");
  break;

  case 8:
  System.out.println("above average. Nice job.");
  break;

  case 7:
  System.out.println("average.");
  break;

  case 6:
  System.out.println("below average. You should see the");
  System.out.println("instructor to clarify the material "
  + "presented in class.");
  break;

  default:
  System.out.println("not passing.");
}

```

# Chapter 8 Arrays

## 2d arrays

### Paramaters

primitive data paramter = sends a copy
object data paramter = send a refrence to the originial

'method overloading' -> multiple methods with same name but DIFFRENT paramaters

```Java

table = new int [3][4]; //creates an array, row x column

table.length; //gets how many rows
table[0].length; // gets how many columns in that specific row

/*

2d = array of arrays
|_| -> |_|_|_|_|
|_| -> |_|_|_|_|
|_| -> |_|_|_|_|

*/


int[][] table = new int[5][10];

// Load the table with values
for (int row = 0; row < table.length; row++)
  for (int col = 0; col < table[row].length; col++)
  table[row][col] = row * 10 + col;

// Print the table
for (int row = 0; row < table.length; row++)
  {
  for (int col = 0; col < table[row].length; col++)
  System.out.print(table[row][col] + "\t");
  System.out.println();
}

```
