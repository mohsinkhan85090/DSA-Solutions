# 📈 DSA– My Data Structures & Algorithms Journey in Java


This repository is a personal collection of **Data Structures and Algorithms** problems solved in **Java**.  
It is organized **folder-wise** according to topics, each containing clean and optimized solutions following common DSA patterns.

---
## Array

```java
Solved Questions:-
TWO POINTER

1. Two Sum  II (LeetCode 167)

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

4. Remove Element (LeetCode 27)
Problem: Remove all occurrences of a given value in-place and return the new length.
Approach: Two-pointer method for in-place modification without extra space.
File: Array&String/Removeelement.java

Example:
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]

5. Squares of a Sorted Array (LeetCode 977)
Problem: Given a sorted integer array, return a new array of the squares of each number, also sorted in non-decreasing order.
Approach: Use a two-pointer technique—compare absolute values from both ends, place the larger square at the end of the result array, and move inward.
Time complexity: O(n).
File: Array&String/SortedSquares.java

Example:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]

6.Valid Palindrome (LeetCode 125)
Problem: Check if a string reads the same forward and backward, ignoring non-alphanumeric characters and case.
Approach: Use two pointers to skip non-alphanumeric characters and compare letters/digits.
File: Array&String/validpalindrome.java

Example:
Input: s = "A man, a plan, a canal: Panama"
Output: true

7. Container With Most Water (LeetCode 11)
Problem: Given an array of heights, find two lines that together with the x-axis form a container that holds the maximum water.
Approach: Use two pointers—one at the start and one at the end. Calculate area, move the pointer pointing to the shorter line inward (since area is limited by the shorter line).
Time complexity: O(n).
File: Array&String/MaxWaterContainer.java

Example:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49**

8. Find Duplicate (LeetCode 287)
Problem: Finds a duplicate number in an array containing n+1 integers in [1, n].
File: Array&String/findDuplicate.java

Example:
Input: nums = [1,3,4,2,2]
Output: 2

9. Find Peak Element (LeetCode 162)
Problem: Finds a peak element (greater than its neighbors).
File: Array&String/findPeakElement.java


10. Search Insert Position (LeetCode 35)
Problem: Finds the index where a target should be inserted in a sorted array.
File: Array&String/searchinsertposition.java

Example:
Input: nums = [1,3,5,6], target = 5
Output: 2
```


```java
Solved Question:-
KADEN'S ALGORITHM

1.Maximum Subarray (LeetCode 53)
Problem: Find the contiguous subarray with the maximum sum.
Approach: Kadane’s Algorithm — track currSum and update maxSum. O(n) time.
File: Array&String/maximumsubarray.java

Example:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6 (subarray [4,-1,2,1])

2. Maximum Product Subarray (LeetCode 152)
Problem: Find the contiguous subarray with the maximum product.
Approach: Track both maxProd and minProd at each step (because a negative number can flip min to max). O(n) time.
File: Array&String/maximumproductsubarray.java

Example:
Input: nums = [-2,3,-4]
Output: 24 (subarray [-2,3,-4])
```

```java
Solved Question:-
DIVIDE AND CONQUER

1. Binary Search (LeetCode 704)
Problem: Given a sorted array of integers and a target value, return the index if the target is found. If not, return -1.
Approach: Use the binary search technique — repeatedly divide the search space into halves.
Time Complexity: O(log n).
File: Array&String/BinarySearch.java

Example:
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4

2. Find First and Last Position of Element in Sorted Array (LeetCode 34)
Problem: Given a sorted array of integers and a target value, return the starting and ending position of the target. If not found, return [-1, -1].
Approach: Use binary search twice — once to find the first occurrence and once for the last occurrence.
Time Complexity: O(log n).
File: Array&String/FirstAndLastPosition.java

Example:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3, 4]

3. Search in Rotated Sorted Array (LeetCode 33)
Problem: Searches for a target in a rotated sorted array.
File: Array&String/search.java

Example:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

4. Kth Largest Element in an Array (LeetCode 215)

Problem: Find the Kth largest element in an unsorted array.
Approach: Use Divide and Conquer (Quickselect) for average O(n) time.
File: Divide_and_Conquer/KthLargestElement.java

Example:
Input: nums = [3,2,1,5,6,4], k = 2  
Output: 5

```
```java
Solved Question:-
PREFIX SUM

1. Running Sum of 1D Array (LeetCode 1480)

Problem: Given an array nums, return the running sum of nums. The running sum of an array is defined as runningSum[i] = sum(nums[0]…nums[i]).
Approach: Use prefix sum technique. Start with the first element as it is, then for each index i, add nums[i] to the previous running sum.
Time complexity: O(n)
Space complexity: O(1) if done in-place, O(n) if using a separate array.
File:Array&String/runningsum.java
Example: Input: nums = [1,2,3,4]
         Output:  [1,3,6,10]


2. Find Pivot Index (LeetCode 724)
Problem:Find the pivot index of the array where the sum of the numbers on the left is equal to the sum of the numbers on the right. If no such index exists, return -1. If there are multiple pivot indexes, return the leftmost one.
Time Complexity: O(n)
Space Complexity: O(1)
File: Array&String/FindPivotIndex.java
Example:Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation: At index 3, left sum = 1+7+3 = 11 and right sum = 5+6 = 11.

3. Product of Array Except Self (LeetCode 238)
Problem: Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i]. You must solve it without using division and in O(n) time.
Time complexity: O(n)
Space complexity: O(1) (if output array doesn’t count, otherwise O(n))
File: Array&String/ProductOfArrayExceptSelf.java
Example:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

4. Find the Middle Index in Array (LeetCode 1991)
Problem: Find the leftmost index where the sum of elements to its left equals the sum of elements to its right. Return -1 if no such index exists.
File: Array&String/findmiddleindex.java
Example:
Input: nums = [2,3,-1,8,4]
Output: 3

5. Find the Highest Altitude (LeetCode 1732)
Problem: Given the net gains in altitude between points of a road trip, return the highest altitude reached starting from 0.
File: Array&String/findhighestaltitude.java
Example:
Input: gain = [-5,1,5,0,-7]
Output: 1

6. Range Sum Query – Immutable (LeetCode 303)
Problem: Given an integer array, implement a data structure NumArray that supports querying the sum of elements between indices left and right (inclusive). Must answer multiple queries efficiently.
File: Array&String/rangesumquery.java
Example:
Input: nums = [-2,0,3,-5,2,-1], Queries:
sumRange(0,2) → 1
sumRange(2,5) → -1
sumRange(0,5) → -3
```

```java
Solved Question:-
HASHMAP / HASHSET

1. Contains Duplicate (LeetCode 217)
Problem: Checks if any value appears more than once in the array.
Approach: Uses a HashSet for O(n) time complexity.
File: Array&String/ContainsDuplicate.java
Example:
Input: nums = [1,2,3,1]
Output: true

2. Majority Element (LeetCode 169)
Problem: Finds the element that appears more than n/2 times. using HAshMAp 
File: Array&String/MajorityElement.java

Example:
Input: nums = [3,2,3]
Output: 3

3. Unique Number of Occurrences (LeetCode 1207)
Problem: Given an integer array arr, return true if the number of occurrences of each value is unique, otherwise return false.
Approach: Use a HashMap to count the frequency of each number. Then insert all frequencies into a HashSet. If the size of the set equals the size of the map, all frequencies are unique. Use old-style for loops for beginner-friendly coding.
File: Array&HashMap/UniqueNumberOfOccurrences.java

Example:
Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: Frequencies are {1:3, 2:2, 3:1} → all counts are unique.
4. Longest Consecutive Sequence (LeetCode 128)
Problem: Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence. You must write an algorithm that runs in O(n) time.
Approach: Use a HashSet to store all numbers. For each number, only start counting if it is the beginning of a sequence (i.e., num-1 is not in the set). Expand the sequence forward and keep track of the maximum length.
File: Array&HashSet/LongestConsecutiveSequence.java

Example:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

5. Intersection of Two Arrays (LeetCode 349)
Problem: Find the unique common elements between two arrays.
Approach: Use a HashSet to store elements of the first array, then check each element of the second array for presence. Time complexity: O(n + m).
File: Array&String/Intersection349.java

Example:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]  // order not guaranteed

6. Intersection of Two Arrays II (LeetCode 350)
Problem: Find the common elements between two arrays, including duplicates.
Approach: Use a HashMap to count the frequency of elements in the first array, then traverse the second array to add common elements based on remaining counts. Time complexity: O(n + m).
File: Array&String/Intersection350.java

Example:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

7. Find Duplicate (LeetCode 287)
Problem: Finds a duplicate number in an array containing n+1 integers in [1, n].
File: Array&String/findDuplicate.java

Example:
Input: nums = [1,3,4,2,2]
Output: 2

```
```java
Solved Question:-
SLIDING WINDOW

1. Minimum Size Subarray Sum (LeetCode 209)
Problem:Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray of which the sum is greater than or equal to target. If there is no such subarray, return 0.
Approach:Use the sliding window technique with two pointers (start and end). Expand the window by adding elements to sum until it is greater than or equal to target. Then shrink the window from the left while maintaining the condition, updating the minimum length each time.
Time complexity: O(n).
File:Array&String/MinSubarrayLen.java

Example:
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
(Explanation: The subarray [4,3] has the minimal length under the problem constraint.)

2. Maximum Average Subarray I (LeetCode 643)
Problem:You are given an integer array nums consisting of n elements, and an integer k. Find a contiguous subarray whose length is equal to k that has the maximum average value, and return this value. Any answer with a calculation error less than 10^-5 will be accepted.
Approach:Use the sliding window technique.
Compute the sum of the first k elements.
Store its average as the initial maximum.
Slide the window by removing the element that goes out of the window and adding the next element.
Update the maximum average whenever a larger average is found.

Time complexity: O(n) (each element is processed once).


File:Array&String/MaxAverageSubarray.java
Example:
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75
(Explanation: The subarray [12, -5, -6, 50] has the maximum average of 12.75.)

```

```java
Solved Question:-
GREEDY ALGORITHM

1. Maximum 69 Number (LeetCode 1323)
Problem: Change at most one 6 to 9 to maximize the number.
Approach: Replace the first 6 with 9.
File: Array&String/Maximum69Number.java

Example:
Input: 9669
Output: 9969

2. Best Time to Buy and Sell Stock (LeetCode 121)
Problem: Given an array of stock prices, find the maximum profit by choosing a single buy and sell day.
Approach: Track the minimum price so far and calculate the maximum profit in one pass (O(n) time).
File: Array&String/besttimetobuyandsellstock.java
Example:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.

3. Best Time to Buy and Sell Stock II (LeetCode 122)
Problem: Maximize profit by buying and selling stocks on multiple days. You can hold at most one share at a time.
Approach: Sum all positive differences between consecutive days (O(n) time).
File: Array&String/besttimetobuyandsellstockII.java
Example:
Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2, sell on day 3 (profit = 4), then buy on day 4, sell on day 5 (profit = 3). Total = 7.

Input: prices = [1,2,3,4,5]
Output: 4

```
```java
Solved Question:-
BIT MANIPULATION

1.Single Number
Problem:
Every element appears twice except one. Find that single one.
Constraint: O(n) time, O(1) space.

Trick
Use XOR: x ^ x = 0
         x ^ 0 = x
         XOR of all numbers leaves the single element.
Example:Input: nums = [4,1,2,1,2]
        Output: 4
```
```java
Solved Question:-
MATHEMATICAL APPROACH

1. Missing Number (LeetCode 268)
Problem: Finds the missing number in an array containing n distinct numbers in [0, n].
File: Array&String/Missingnumber.java
Example:
Input: nums = [3,0,1]
Output: 2


2. Palindrome Number (LeetCode 9)  
Problem: Check if an integer is a palindrome. A palindrome reads the same forward and backward.  
File: Array&String/PalindromeNumber.java  

Example:  
Input: x = 121  
Output: true  

Input: x = -121  
Output: false
```
```
Iterative

1. Concatenation of Array (LeetCode 1929)
Problem: Concatenates an array to itself and returns the new array.
File: Array&String/Concatenation of Array.java

Example:
Input: nums = [1,2,3]
Output: [1,2,3,1,2,3]

2.Check if Array Is Sorted and Rotated (LeetCode 1752)
Problem: Check if array can be sorted in non-decreasing order and then rotated.
File: Array&String/Counting/CheckSortedAndRotated.java

Approach: Count positions where arr[i] > arr[(i+1)%n].
If count ≤ 1 → true
Else → false
Time: O(n) | Space: O(1)
Example:
Input: [3,4,5,1,2] → Output: true
Input: [2,1,3,4] → Output: false


```



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
