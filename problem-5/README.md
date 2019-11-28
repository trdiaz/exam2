# Problem 5: Perfect Squares
Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

## Step-1: Defining the problem and solution recursively
Finding the n of perfect squares that eventually add up to n-1

x = i * i 
if x == n, then it is a perfect square
if x > n, then n isnt perfect square, 

recursively call until n-1.

## Step-2: Utilization of sub-problems to solve a global problem
This problem was a bit easier, because it was less overloaded than most problems have been. Breaking the problem down was easier by knowing what makes a square. The use of an array was needed, along with a variable labeled max, to check conditions using x and n, then iterate using a for-loop to test if its a square leading to a solution to a global problem. 

## Step-3: IDEAL and Duke 7 implementation 
Breaking down this problem was easier to do knowing what makes a square a square. IDEAL helped by simply reminding me to reflect on old problems. 
