# 📚 DSA-Solutions – My Data Structures & Algorithms Journey in Java

This repository is a personal collection of **Data Structures and Algorithms** problems solved in **Java**.  
It is organized **folder-wise** according to topics, each containing clean and optimized solutions following common DSA patterns.

---

## 📂 Folder Structure & Problem Index
## Array&String 
```java
## 1. Two Sum (LeetCode 1)
**Problem:** Find two numbers in an array that sum to a given target.  
**Approach:** Uses a HashMap for O(n) time complexity.  
**File:** `Array&String/Twosum.java`  

Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]

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

10. Move Zeroes (LeetCode 283)
Problem: Moves all zeroes to the end while keeping the relative order of non-zero elements.
File: Array&String/movezeros.java

Example:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

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

```
### **Binary Search**
- **Find Peak Element (LeetCode 162)**  
  Finds an element greater than its neighbors using binary search on index space.  
  *File:* `Binary Search/FindPeakElement.java`

- **Search in Rotated Sorted Array (LeetCode 33)**  
  Modified binary search to handle rotated sorted arrays.  
  *File:* `Binary Search/SearchInRotatedSortedArray.java`

- **Find First and Last Position of Element in Sorted Array (LeetCode 34)**  
  Uses two binary searches to find the first and last occurrence of a target.  
  *File:* `Binary Search/FirstAndLastPosition.java`

- **Search Insert Position (LeetCode 35)**  
  Finds the index of a target or the position to insert it to maintain sorted order.  
  *File:* `Binary Search/SearchInsertPosition.java`

---

### **Sliding Window**
- **Length of Longest Substring Without Repeating Characters**  
  Uses a sliding window and hash set to find the maximum length substring with all unique characters.  
  *File:* `Sliding Window/lenghtoflongestsubstring.java`

---

## 🛠 Tech Stack
- **Language:** Java  
- **Patterns:** Sliding Window, Binary Search, Hashing, Two Pointers, etc.  
- **Platform:** LeetCode, Custom DSA Practice  

---

## 📌 Notes
- Each solution contains:
  - Problem statement summary
  - Approach description
  - Java implementation
- More problems coming soon: Recursion, Graphs, Dynamic Programming, etc.

---

## 🤝 Contribution
This repository is primarily for personal learning. If you have suggestions for cleaner solutions or optimizations, feel free to fork and create a pull request.

---

**Author:** Mohsin Khan  
**GitHub:** [mohsinkhan85090](https://github.com/mohsinkhan85090)
