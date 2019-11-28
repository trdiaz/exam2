# Problem 2: Minimum falling path sum
Given a square array of integers A, we want the minimum sum of a falling path through A. A falling path starts at any element in the first row, and chooses one element from each row. The next row's choice must be in a column that is different from the previous row's column by at most one.

## Step-1: Defining the problem and solution recursively
Compare all possible paths taken to reach a given destination and find the path with the smallest sum. 

Given an integer A[r][c],
We find the minimum path knowing the minimum sum of that path and tracing back until we arrive at the given destination. By repitition the path will eventually lead the initial path taken. 

## Step-2: Utilization of sub-problems to solve a global problem
Breaking down this problem into sub-problems was done by the identifying necessary result. The conditions necessary for the search through the 2D array were essential in providing a minmum falling path sum. This allowed me to store the value into a temp variable to store the lowest value in A[r][c] as paths are taken and to check other indexs within the 2D array. This ultimately led to the solution of the global problem. 


## Step-3: IDEAL and Duke 7 implementation 
Using IDEAL and Duke 7, I broke this problem down by identifying and defining the problem and so forth with the problem solving method. 

Breaking down the problem is also necessary, such as the need for a 2D array, the conditions for path finding and comparing. Initializing these steps allows a higher likelihood of success. Printing the paths also helps before you compare them. 
