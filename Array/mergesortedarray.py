'''class Solution {
    public void mergesortedarray(int[] nums1, int m, int[] nums2, int n) {
        for(int j=0;j<n;j++)
        {
            nums1[m+j]=nums2[j];
        }
        Arrays.sort(nums1);
        
    }
}/'''
class Solution(object):
    def mergesortedarray(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        for j in range(n):
            nums1[m+j]=nums2[j]
        nums1.sort()