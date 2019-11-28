# Problem 1: Minimum ASCII Delete Sum for Two Strings
Given two strings s1, s2, find the lowest ASCII sum of deleted characters to make two strings equal.

## Step-1: Defining the problem and solution recursively
The goal is to keep track of both s1 and s2 current ASCII sums and the deleted characters ASCII sum and when the sum of the current strings ASCII sum == the sum of the deleted ASCII characters, then you will have the minimum sum possible. 

Given s1 and s2, we can define this problem recursively by defining the cases. 

if either s1 or s2 is empty, the value of the ASCII sum of the non-empty string is taken.
if s1[i] equals s2[j], ignore the characters, else at least one must be deleted.

When the value of the s1 and s2 are equal to the ASCII sum of characters deleted, the problem is solved. 


## Step-2: Utilization of sub-problems to solve a global problem
Sub-problems developed involved were the comparing of both strings characters. Using a 2D array, I store the ASCII values of each string, then proceed to iterating through each word to get the total ASCII value of each character through the use of a for-loop, then proceed to a nested for-loop where I can compare the string characters at their respected positions in the 2D array, if they are equal, we ignore the characters, else we delete one the characters and store the value in the 2D array. All of the sub-problems ultimately produce the solution to the global problem. 


## Step-3: IDEAL and Duke 7 implmentation
Using IDEAL and Duke 7 helped with the process of breaking the problem down to implement easier. By identifying and defining the problem I was able to understand it more clearly which ultimately allowed me to come up with possible strategies.

Breaking down the problem by task helped make the solution more clear and thus allowed me to execute it. Specically with the 2D array. 


