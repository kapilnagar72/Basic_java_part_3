# Basic_java_part_3

        **  Operators in Java  **

Java provides many types of operators which can be used according to the need. They are classified based on the functionality they provide. In this article, we will learn about Java Operators and learn all their types.

What are the Java Operators?
Operators in Java are the symbols used for performing specific operations in Java. Operators make tasks like addition, multiplication, etc which look easy although the implementation of these tasks is quite complex.


**Types of Operators in Java**
There are multiple types of operators in Java all are mentioned below:

1.Arithmetic Operators
2.Unary Operators
3.Assignment Operator
4.Relational Operators
5.Logical Operators
6.Ternary Operator
7.Bitwise Operators
8.Shift Operators
9.instance of operator

1. Arithmetic Operators
They are used to perform simple arithmetic operations on primitive data types. 

* : Multiplication
/ : Division
% : Modulo
+ : Addition
– : Subtraction

2. Unary Operators
Unary operators need only one operand. They are used to increment, decrement, or negate a value. 

– : Unary minus, used for negating the values.
+ : Unary plus indicates the positive value (numbers are positive without this, however). It performs an automatic conversion to int when the type of its operand is the byte, char, or short. This is called unary numeric promotion.
++ : Increment operator, used for incrementing the value by 1. There are two varieties of increment operators. 
Post-Increment: Value is first used for computing the result and then incremented.
Pre-Increment: Value is incremented first, and then the result is computed.
– –  : Decrement operator, used for decrementing the value by 1. There are two varieties of decrement operators. 
Post-decrement: Value is first used for computing the result and then decremented.
Pre-Decrement: The value is decremented first, and then the result is computed.
! : Logical not operator, used for inverting a boolean value.

3. Assignment Operator
 ‘=’ Assignment operator is used to assign a value to any variable. It has right-to-left associativity, i.e. value given on the right-hand side of the operator is assigned to the variable on the left, and therefore right-hand side value must be declared before using it or should be a constant. 

The general format of the assignment operator is:

variable = value;
In many cases, the assignment operator can be combined with other operators to build a shorter version of the statement called a Compound Statement. For example, instead of a = a+5, we can write a += 5. 

+=, for adding the left operand with the right operand and then assigning it to the variable on the left.
-=, for subtracting the right operand from the left operand and then assigning it to the variable on the left.
*=, for multiplying the left operand with the right operand and then assigning it to the variable on the left.
/=, for dividing the left operand by the right operand and then assigning it to the variable on the left.
%=, for assigning the modulo of the left operand by the right operand and then assigning it to the variable on the left.

4. Relational Operators
These operators are used to check for relations like equality, greater than, and less than. They return boolean results after the comparison and are extensively used in looping statements as well as conditional if-else statements. The general format is, 

variable relation_operator value
Some of the relational operators are- 

==, Equal to returns true if the left-hand side is equal to the right-hand side.
!=, Not Equal to returns true if the left-hand side is not equal to the right-hand side.
<, less than: returns true if the left-hand side is less than the right-hand side.
<=, less than or equal to returns true if the left-hand side is less than or equal to the right-hand side.
>, Greater than: returns true if the left-hand side is greater than the right-hand side.
>=, Greater than or equal to returns true if the left-hand side is greater than or equal to the right-hand side.


5. Logical Operators
These operators are used to perform “logical AND” and “logical OR” operations, i.e., a function similar to AND gate and OR gate in digital electronics. One thing to keep in mind is the second condition is not evaluated if the first one is false, i.e., it has a short-circuiting effect. Used extensively to test for several conditions for making a decision. Java also has “Logical NOT”, which returns true when the condition is false and vice-versa

Conditional operators are:

&&, Logical AND: returns true when both conditions are true.
||, Logical OR: returns true if at least one condition is true.
!, Logical NOT: returns true when a condition is false and vice-versa

6. Ternary operator
The ternary operator is a shorthand version of the if-else statement. It has three operands and hence the name Ternary.

The general format is:

condition ? if true : if false
The above statement means that if the condition evaluates to true, then execute the statements after the ‘?’ else execute the statements after the ‘:’.  

7. Bitwise Operators
These operators are used to perform the manipulation of individual bits of a number. They can be used with any of the integer types. They are used when performing update and query operations of the Binary indexed trees. 

&, Bitwise AND operator: returns bit by bit AND of input values.
|, Bitwise OR operator: returns bit by bit OR of input values.
^, Bitwise XOR operator: returns bit-by-bit XOR of input values.
~, Bitwise Complement Operator: This is a unary operator which returns the one’s complement representation of the input value, i.e., with all bits inverted.

8. Shift Operators
These operators are used to shift the bits of a number left or right, thereby multiplying or dividing the number by two, respectively. They can be used when we have to multiply or divide a number by two. General format- 

 number shift_op number_of_places_to_shift;
<<, Left shift operator: shifts the bits of the number to the left and fills 0 on voids left as a result. Similar effect as multiplying the number with some power of two.
>>, Signed Right shift operator: shifts the bits of the number to the right and fills 0 on voids left as a result. The leftmost bit depends on the sign of the initial number. Similar effect to dividing the number with some power of two.
>>>, Unsigned Right shift operator: shifts the bits of the number to the right and fills 0 on voids left as a result. The leftmost bit is set to 0.


9. instanceof operator
The instance of the operator is used for type checking. It can be used to test if an object is an instance of a class, a subclass, or an interface. General format- 

object instance of class/subclass/interface


**Advantages of Operators in Java**
The advantages of using operators in Java are mentioned below:

Expressiveness: Operators in Java provide a concise and readable way to perform complex calculations and logical operations.
Time-Saving: Operators in Java save time by reducing the amount of code required to perform certain tasks.
Improved Performance: Using operators can improve performance because they are often implemented at the hardware level, making them faster than equivalent Java code.

Disadvantages of Operators in Java
The disadvantages of Operators in Java are mentioned below:

Operator Precedence: Operators in Java have a defined precedence, which can lead to unexpected results if not used properly.
Type Coercion: Java performs implicit type conversions when using operators, which can lead to unexpected results or errors if not used properly.


          ** pattern **
In Java, a pattern typically refers to a particular arrangement or sequence of characters or symbols. It's a common task to create patterns using loops and conditional statements for various purposes such as formatting output, solving mathematical problems, or implementing algorithms.

Patterns can range from simple geometric shapes to complex sequences. Here are a few examples:

Geometric Patterns: These patterns involve arranging characters or symbols in geometric shapes such as squares, triangles, or diamonds. For example, printing a triangle of asterisks or numbers.

Numeric Patterns: These patterns involve sequences of numbers arranged in a particular order or sequence. For example, Fibonacci sequence or Pascal's triangle.

Alphabetic Patterns: These patterns involve arranging alphabetic characters in specific shapes or sequences. For example, printing the alphabet in a certain pattern or arranging characters to form a pyramid.

Custom Patterns: These are patterns that you design for specific purposes, such as displaying a logo or a custom design.

In Java, patterns are often created using loops (such as for loops, while loops, or do-while loops) and conditional statements (such as if statements) to control the arrangement and repetition of characters or symbols.

 
    ** Arrays **

    an array is a collection of similar type of elements which has contiguous memory location.

Java array is an object which contains elements of a similar data type. Additionally, The elements of an array are stored in a contiguous memory location. It is a data structure where we store similar elements. We can store only a fixed set of elements in a Java array.

Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on.


There are two types of array.

Single Dimensional Array
Multidimensional Array

For-each Loop for Java Array
We can also print the Java array using for-each loop. The Java for-each loop prints the array elements one by one. It holds an array element in a variable, then executes the body of the loop.

          
          ** String **

Java String class provides a lot of methods to perform operations on strings such as compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.

What is String in Java?
Generally, String is a sequence of characters. But in Java, string is an object that represents a sequence of characters. The java.lang.String class is used to create a string object.

How to create a string object?
There are two ways to create String object:

By string literal
By new keyword

Immutable String in Java
A String is an unavoidable type of variable while writing any application program. String references are used to store various attributes like username, password, etc. In Java, String objects are immutable. Immutable simply means unmodifiable or unchangeable.

Once String object is created its data or state can't be changed but a new String object is created.

Java String compare
java string comparison
We can compare String in Java on the basis of content and reference.

It is used in authentication (by equals() method), sorting (by compareTo() method), reference matching (by == operator) etc.

There are three ways to compare String in Java:

By Using equals() Method
By Using == Operator
By compareTo() Method



