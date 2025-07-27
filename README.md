# 📚 My Data Structures & Algorithms Solutions – A Journey Through DSA in Java

This repository is a personal collection of Data Structures and Algorithms problems solved primarily in Java. It serves as my learning journal, showcasing problem-solving approaches and implementations for common DSA patterns.

## Topics Covered

- **Binary Search** – Efficient searching in sorted data and on monotonic answer spaces.

## `Binary Search Problems`

Here are the problems solved under the Binary Search category:

### 1. Find Peak Element (LeetCode 162)

**Problem:** A peak element is an element that is strictly greater than its neighbors. Given an integer array `nums`, where `nums[i] != nums[i+1]` for all valid `i`, find a peak element and return its index. You may imagine that `nums[-1] = nums[n] = -∞`.

**Example:**
* **Input:** `nums = [1,2,3,1]`
* **Output:** `2` (index of 3, which is a peak because `3 > 2` and `3 > 1`)

* **Input:** `nums = [1,2,1,3,5,6,4]`
* **Output:** `1` (index of 2, because `2 > 1` (left) and `2 > 1` (right)) or `5` (index of 6, because `6 > 5` and `6 > 4`). The algorithm can return either.

**Approach:** This problem is solved using a modified binary search approach. Instead of searching for a specific value, we leverage the monotonic property of the array (considering the implied -∞ boundaries) to efficiently find a peak.

The key idea is:
* If `nums[mid] > nums[mid + 1]`: We are on a descending slope or at a peak. A peak must exist at or to the left of `mid`. So, we set `right = mid`.
* If `nums[mid] < nums[mid + 1]`: We are on an ascending slope. A peak must exist to the right of `mid`. So, we set `left = mid + 1`.

The search continues until `left` equals `right`, at which point `left` (or `right`) will be the index of a peak.

**Solution File:** [`FindPeakElement.java`](./BinarySearch/FindPeakElement/FindPeakElement.java)

---

### 2. Search Insert Position (LeetCode 35)

**Problem:** Given a sorted array of distinct integers `nums` and a `target` value, return the index if the `target` is found. If not, return the index where it would be if it were inserted in order.

**Example:**
* **Input:** `nums = [1,3,5,6]`, `target = 5`
* **Output:** `2`

* **Input:** `nums = [1,3,5,6]`, `target = 2`
* **Output:** `1`

**Approach:** This problem is a direct application of binary search. We are looking for the lowest index where the `target` could be inserted while maintaining the sorted order. The algorithm iteratively narrows down the search space.

The key idea is to keep track of the `insertionIndex` (initially `nums.length`).
* If `nums[mid] == target`, we found it.
* If `nums[mid] < target`, the target must be to the right, so we update `left = mid + 1`.
* If `nums[mid] > target`, `mid` is a potential insertion point, so we record `mid` as `insertionIndex` and search in the left half (`right = mid - 1`) to find an even smaller valid index.

**Solution File:** [`SearchInsertPosition.java`](./BinarySearch/SearchInsertPosition/SearchInsertPosition.java)

---
