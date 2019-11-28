# Problem 3: Palindromic Substrings
Given a string, your task is to count how many palindromic substrings in this string. 
The substrings with different start indexes or end indexes are counted as different substrings even they consist of the same characters. 

## Step-1: Defining the problem and solution recursively
By comparing between characters of a palidrome center. 

if palidrome has a length > 1, then another palidrome must exist, check if both characters are same or not
if it is a palindrome, check the rest of the substring, then return
if not a palindrom, check palindrome substrings, remove similar substrings then return 
The solution is when you no longer have palindromes. 

## Step-2: Utilization of sub-problems to solve a global problem
Breaking down this problem was difficult since I always have had a problem thinking about palindromes. What I had to do was research, basically to identify what htis problem was asking. By defining the characterisitics of the problem such as

N is length of the string, 
The middle of the palindrome is possibly in 2N-1 positions resulting it being a letter or between two letters. 

Using a for-loop to iterate throught the center of a string, I was able to use a while loop to check the the values given by the left and right substrings. Thus allowing the counting of all possible palindromes that can be created with a string. 

## Step-3: IDEAL and Duke 7 implementation 
Using IDEAL really helped in the engagment of the problem. It allowed me to identify core attributes needed to solve this problem such as the logic. By breaking everything down and coming up with various strategies I was able to cement a solution. 
