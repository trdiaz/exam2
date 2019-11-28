# Problem 4: Number of Arithmetic Slices
A sequence of number is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.

## Step-1: Defining the problem and solution recursively
Comparing 3-adjacent numbers within the array until the solution is reachec at n-1, decreasing after each recursive call, for each call we store the number of arithmetic sequences. 

## Step-2: Utilization of sub-problems to solve a global problem
Utilizing an array and a variable count to store the number of occurences possible, this was done by iterating through a nested for-loop and comparing the values of the adjacent numbers.

## Step-3: IDEAL and Duke 7 implementation 
Research again was needed. Using IDEAL i was able to better identify attributes neccessary to solving this problem.
