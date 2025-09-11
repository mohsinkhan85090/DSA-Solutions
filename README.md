# 📈 DSA– My Data Structures & Algorithms Journey in Java


This repository is a personal collection of **Data Structures and Algorithms** problems solved in **Java**.  
It is organized **folder-wise** according to topics, each containing clean and optimized solutions following common DSA patterns.

---

## Array

```java
Solved Questions
Two Pointers
1. Two Sum (LeetCode 1)

Problem: Find two numbers in a sorted array that sum to a given target.
Approach: Use two pointers—one at the start, one at the end—and move them based on the sum compared to the target. Time complexity: O(n).
File: Array&String/Twosum.java

Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]

2. Move Zeroes (LeetCode 283)
Problem: Moves all zeroes to the end while keeping the relative order of non-zero elements.
File: Array&String/movezeros.java

Example:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

3. Remove Duplicates from Sorted Array (LeetCode 26)
Problem: Remove duplicates in-place from a sorted array so that each unique element appears only once. Return the number of unique elements.
Approach: Two-pointer technique to overwrite duplicates while maintaining order.
File: Array&String/Removeduplicatefromsortedarray.java

Example:
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
2. Concatenation of Array (LeetCode 1929)
Problem: Concatenates an array to itself and returns the new array.
File: Array&String/Concatenation of Array.java

Example:
Input: nums = [1,2,3]
Output: [1,2,3,1,2,3]

3. Contains Duplicate (LeetCode 217)
Problem: Checks if any value appears more than once in the array.
Approach: Uses a HashSet for O(n) time complexity.
File: Array&String/ContainsDuplicate.java

Example:
Input: nums = [1,2,3,1]
Output: true

4. Remove Element (LeetCode 27)
Problem: Remove all occurrences of a given value in-place and return the new length.
Approach: Two-pointer method for in-place modification without extra space.
File: Array&String/Removeelement.java

Example:
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]

5. Majority Element (LeetCode 169)
Problem: Finds the element that appears more than n/2 times.
File: Array&String/MajorityElement.java

Example:
Input: nums = [3,2,3]
Output: 3

6. Missing Number (LeetCode 268)
Problem: Finds the missing number in an array containing n distinct numbers in [0, n].
File: Array&String/Missingnumber.java

Example:
Input: nums = [3,0,1]
Output: 2

7. Find Duplicate (LeetCode 287)
Problem: Finds a duplicate number in an array containing n+1 integers in [1, n].
File: Array&String/findDuplicate.java

Example:
Input: nums = [1,3,4,2,2]
Output: 2

8. Find Peak Element (LeetCode 162)
Problem: Finds a peak element (greater than its neighbors).
File: Array&String/findPeakElement.java

Example:
Input: nums = [1,2,3,1]
Output: 2

9. Merge Sorted Array (LeetCode 88)
Problem: Merges two sorted arrays in-place.
File: Array&String/mergesortedarray.py

Example:
Input: nums1 = [1,2,3,0,0,0], m = 3
 nums2 = [2,5,6], n = 3
Output: nums1 = [1,2,2,3,5,6]



11. Search in Rotated Sorted Array (LeetCode 33)
Problem: Searches for a target in a rotated sorted array.
File: Array&String/search.java

Example:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

12. Search Insert Position (LeetCode 35)
Problem: Finds the index where a target should be inserted in a sorted array.
File: Array&String/searchinsertposition.java

Example:
Input: nums = [1,3,5,6], target = 5
Output: 2

13.Rotate Array (LeetCode 189)
Problem: Rotate an array to the right by k steps.
Approach: Use modulo indexing: B[i] = A[(i + k) % n]. This creates the rotated array efficiently.
File: Array&String/RotateArray.java

Example:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]


14. Maximum 69 Number (LeetCode 1323)
Problem: Change at most one 6 to 9 to maximize the number.
Approach: Replace the first 6 with 9.
File: Array&String/Maximum69Number.java

Example:
Input: 9669
Output: 9969




16. Palindrome Number (LeetCode 9)  
Problem: Check if an integer is a palindrome. A palindrome reads the same forward and backward.  
File: Array&String/PalindromeNumber.java  

Example:  
Input: x = 121  
Output: true  

Input: x = -121  
Output: false

16.Valid Palindrome (LeetCode 125)
Problem: Check if a string reads the same forward and backward, ignoring non-alphanumeric characters and case.
Approach: Use two pointers to skip non-alphanumeric characters and compare letters/digits.
File: Array&String/validpalindrome.java

Example:
Input: s = "A man, a plan, a canal: Panama"
Output: true

17. Best Time to Buy and Sell Stock (LeetCode 121)
Problem: Given an array of stock prices, find the maximum profit by choosing a single buy and sell day.
Approach: Track the minimum price so far and calculate the maximum profit in one pass (O(n) time).
File: Array&String/besttimetobuyandsellstock.java

Example:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.

18. Best Time to Buy and Sell Stock II (LeetCode 122)
Problem: Maximize profit by buying and selling stocks on multiple days. You can hold at most one share at a time.
Approach: Sum all positive differences between consecutive days (O(n) time).
File: Array&String/besttimetobuyandsellstockII.java

Example:
Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2, sell on day 3 (profit = 4), then buy on day 4, sell on day 5 (profit = 3). Total = 7.

Input: prices = [1,2,3,4,5]
Output: 4

19. Maximum Subarray (LeetCode 53)
Problem: Find the contiguous subarray with the maximum sum.
Approach: Kadane’s Algorithm — track currSum and update maxSum. O(n) time.
File: Array&String/maximumsubarray.java

Example:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6 (subarray [4,-1,2,1])

20. Valid Anagram (LeetCode 242)
Problem: Check if two strings are anagrams (contain the same characters in the same frequency, but possibly in a different order).
Approach: Sort both strings and compare character by character.
File: Array&String/validAnagram.java

Example:
Input: s = "anagram", t = "nagaram"
Output: true

Input: s = "rat", t = "car"
Output: false

21.Single Number
Problem:
Every element appears twice except one. Find that single one.
Constraint: O(n) time, O(1) space.

Trick
Use XOR: x ^ x = 0
         x ^ 0 = x
         XOR of all numbers leaves the single element.
Example:Input: nums = [4,1,2,1,2]
        Output: 4

22. Kth Largest Element in an Array (LeetCode 215)

Problem: Find the Kth largest element in an unsorted array.
Approach: Use Divide and Conquer (Quickselect) for average O(n) time.
File: Divide_and_Conquer/KthLargestElement.java

Example:
Input: nums = [3,2,1,5,6,4], k = 2  
Output: 5

```
String
---
```java
1. Valid Parentheses (LeetCode 20)
Problem: Given a string containing (, ), {, }, [ and ], determine if the input string is valid. A string is valid if brackets are closed in the correct order.
Approach: Uses a Stack (or ArrayDeque) and a HashMap for matching brackets → O(n) time complexity.
File: Array&String/ValidParentheses.java

Example:
Input: s = "{[()]}"
Output: true

Input: s = "([)]"
Output: false

2. Is Subsequence (LeetCode 392)
Problem: Check if string s is a subsequence of string t.
Approach: Use two pointers to traverse both strings. Runs in O(n) time.
File: Array&String/IsSubsequence.java

Example:
Input: s = "abc", t = "(ahbgdc)"
Output: true

3. Roman to Integer (LeetCode 13)
Problem: Convert a Roman numeral string into an integer.
Approach: Traverse from right to left, map Roman characters to values, and subtract if a smaller value appears before a larger one, else add.
File: String/RomantoInteger.java

Example:
Input: "(MCMXCIV)"
Output: 1994

4. First Unique Character in a String (LeetCode 387)
Problem: Find the index of the first non-repeating character in a string.
Approach: Use a frequency array (26 letters) to count occurrences, then scan the string to find the first index with count = 1.
File: String/firstuniquecharacterinstring.java

Example:
Input: "(leetcode)"
Output: 0

5. Find the Difference (LeetCode 389)
Problem: Given two strings s and t, where t is formed by shuffling s and adding one extra character, return the extra character.
File: String/FindTheDifference.java



6. Longest Substring Without Repeating Characters (LeetCode 3)

Problem: Find the length of the longest substring in a string without repeating characters.
Approach: Sliding Window + HashSet/HashMap to maintain unique characters. Expand window if unique, shrink when duplicate appears.
Time Complexity: O(n)
File: String/LongestSubstringWithoutRepeating.java

Example:  
Input: abcabcbb  
Output: 3  substring = abc

7. Longest Common Prefix – Explanation  
Problem: We want to find the longest common prefix among an array of strings.  

Example:  
Input: [flower, flow, flight] 
Output: fl

8. Reverse String (LeetCode 344)
Problem: Write a function that reverses a string. The input string is given as an array of characters, and you must do this in-place without returning anything.
File: Array&String/reversestring.java

Example:  
Input: [h,e,l,l,o] 
Output: [o,l,l,e,h]

9. Reverse String II (LeetCode 541)
Problem: Given a string s and integer k, reverse the first k characters for every 2k characters counting from the start. If fewer than k characters remain, reverse all. If between k and 2k, reverse only the first k.

Approach: Process the string in chunks of 2k. For each chunk, reverse the first k characters (or until end of string). Use two pointers (start, end) to swap.
File: String/ReverseStringII.java

Example:
Input: s = "abcdefg", k = 2
Output: bacdfeg

10. Find the Index of the First Occurrence in a String (LeetCode 28)
Problem: Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack. Return 0 if needle is empty.

Approach: Slide over haystack, check substrings of length needle.length(). Use substring + equals for comparison.
File: String/StrStr.java

Example:
Input: haystack = hello, needle = ll
Output: 2

11. Add Binary (LeetCode 67)
Problem: Given two binary strings a and b, return their sum as a binary string.
Approach: Convert both strings to integers (base 2), add them, then convert back to binary string. Time complexity → O(n).
File: Array&String/AddBinary.py

Example:
Input: a = "11", b = "1"
Output: "100"

Input: a = "1010", b = "1011"
Output: "10101"
```

Linked list
---
```java


```
---



## 🛠 Tech Stack
- **Language:** Java & Python
- **Patterns:** Sliding Window, Binary Search, Hashing, Two Pointers, etc.  
- **Platform:** LeetCode

---

## 📌 Notes
- Each solution contains:
  - Problem statement summary
  - Approach description
  - Java/python implementation
- More problems coming soon: Recursion, Graphs, Dynamic Programming, etc.

---

## 🤝 Contribution
This repository is primarily for personal learning. If you have suggestions for cleaner solutions or optimizations, feel free to fork and create a pull request.

---

**Author:** Mohsin Khan  
**GitHub:** [mohsinkhan85090](https://github.com/mohsinkhan85090)
