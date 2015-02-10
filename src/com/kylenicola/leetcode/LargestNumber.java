package com.kylenicola.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by kyle on 2/8/15.
 */

/*Given a list of non negative integers, arrange them such that they form the largest number.
  For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
  Note: The result may be very large, so you need to return a string instead of an integer.*/

/*
I'd hope that the collections sort method is nlogn
    Implement a comparator that adds the two strings and does string compare and uses
    collections sort to do work
     */

public class LargestNumber {
    public String largestNumber(int[] num) {
        ArrayList<String> newNum = new ArrayList<String>();
        for(int i : num)
        {
            newNum.add(Integer.toString(i));
        }
        Collections.sort(newNum, new longestComparator());
        StringBuffer strBuf = new StringBuffer();
        if(newNum.size() > 0 && Integer.parseInt(newNum.get(0)) == 0)
        {
            strBuf.append("0");
            return strBuf.toString();
        }
        for(String s : newNum)
        {
            strBuf.append(s);
        }
        return strBuf.toString();
    }

    private class longestComparator implements Comparator<String>
    {
        @Override
        public int compare(String s1, String s2) {
            return (s2+s1).compareTo(s1+s2);
        }
    }
}