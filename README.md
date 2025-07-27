# 📚 My Data Structures & Algorithms Solutions – A Journey Through DSA in Java

This repository is a personal collection of Data Structures and Algorithms problems solved primarily in Java. It serves as my learning journal, showcasing problem-solving approaches and implementations for common DSA patterns.

## Topics Covered

- **Binary Search** – Efficient searching in sorted data and on monotonic answer spaces.



## Binary Search Problems

Here are the problems solved under the Binary Search category:

### 1. Find Peak Element (LeetCode 162)

**Problem:** A peak element is an element that is strictly greater than its neighbors. Given an integer array `nums`, where `nums[i] != nums[i+1]` for all valid `i`, find a peak element and return its index. You may imagine that `nums[-1] = nums[n] = -∞`.

**Example:**
Input: nums = [1,2,3,1]
Output: 2 (index of 3, which is a peak because 3 > 2 and 3 > 1)

Input: nums = [1,2,1,3,5,6,4]
Output: 1 (index of 2, because 2 > 1 (left) and 2 > 1 (right))
or 5 (index of 6, because 6 > 5 and 6 > 4). The algorithm can return either.

**Approach:** This problem is solved using a modified binary search approach. Instead of searching for a specific value, we leverage the monotonic property of the array (considering the implied -∞ boundaries) to efficiently find a peak.

The key idea is:

- If `nums[mid] > nums[mid + 1]`: We are on a descending slope or at a peak. A peak must exist at or to the left of `mid`. So, we set `right = mid`.

- If `nums[mid] < nums[mid + 1]`: We are on an ascending slope. A peak must exist to the right of `mid`. So, we set `left = mid + 1`.

The search continues until `left` equals `right`, at which point `left` (or `right`) will be the index of a peak.

**Solution File:** `FindPeakElement.java`
