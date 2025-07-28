# 📚 My Data Structures & Algorithms Solutions – A Journey Through DSA in Java

This repository is a personal collection of **Data Structures and Algorithms** problems solved primarily in **Java**.  
It serves as my learning journal, showcasing clean code, optimized logic, and key DSA patterns.

---

## 🔹 Topics Covered

- **Binary Search** – Efficient searching in sorted data or over monotonic answer spaces.

---

## 🔍 Binary Search Problems

### 1. Find Peak Element (LeetCode 162)

**Problem:**  
A peak element is an element that is strictly greater than its neighbors.  
Find any one peak element and return its index.

**Example:**  
Input: `[1,2,3,1]` → Output: `2`  
Input: `[1,2,1,3,5,6,4]` → Output: `1` or `5`

**Approach:**  
Use a binary search on index space.  
- If `nums[mid] > nums[mid+1]`, search left.  
- Else, search right.

🔗 **[Solution File → FindPeakElement.java](./BinarySearch/FindPeakElement.java)**

---

### 2. Search in Rotated Sorted Array (LeetCode 33)

**Problem:**  
Search for a target in a rotated sorted array without duplicates.

**Example:**  
Input: `nums = [4,5,6,7,0,1,2]`, target = `0` → Output: `4`

**Approach:**  
Modified binary search:  
- Check which side is sorted.  
- Narrow down based on target position.

🔗 **[Solution File → SearchInRotatedSortedArray.java](./BinarySearch/SearchInRotatedSortedArray.java)**

---

### 3. Find First and Last Position of Element in Sorted Array (LeetCode 34)

**Problem:**  
Find the starting and ending position of a given target value.  
If not found, return `[-1, -1]`.

**Example:**  
Input: `nums = [5,7,7,8,8,10]`, target = `8` → Output: `[3, 4]`

**Approach:**  
Two binary searches:  
- One for first occurrence.  
- One for last occurrence.

🔗 **[Solution File → FirstAndLastPosition.java](./BinarySearch/FirstAndLastPosition.java)**

---

## 📌 Notes

- More problems coming soon: Sliding Window, Recursion, Graphs, etc.
- Solutions include: Description + Example Inputs/Outputs + Approach + Java Code

---

## 🛠 Tech Stack

`Java` | `DSA Patterns` | `LeetCode Problems`

[![Repo](https://img.shields.io/badge/DSA%20Solutions-Java%20%7C%20LeetCode-blueviolet?style=flat-square&logo=java)](https://github.com/mohsinkhan85090/DSA-Java-Solutions)

---

## 📂 Folder Structure

