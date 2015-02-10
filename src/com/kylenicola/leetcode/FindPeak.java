package com.kylenicola.leetcode;

/**
 * Created by kyle on 2/9/15.
 */

/*
A peak element is an element that is greater than its neighbors.

Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that num[-1] = num[n] = -∞.

For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
 */

/*
O(logn)
    Do a binary search.  Compare the left index and the right index, then decide from there
     */

public class FindPeak {
    public int findPeakElement(int[] num) {
        int answer = 0;
        int low = 0;
        int high = num.length - 1;
        int med = (high+low) / 2;
        while(low <= high)
        {
            if(med - 1 >= 0 && num[med-1] > num[med]) {
                high = med - 1;
            }
            else if(med + 1 < num.length && num[med+1] > num[med])
            {
                low = med+1;
            }
            else
            {
                return med;
            }
            med = (high + low) / 2;
        }
        return answer;
    }
}
