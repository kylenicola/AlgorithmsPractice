package com.kylenicola.leetcode;

/**
 * Created by kyle on 2/8/15.
 */

/*
Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".
 */

/*
    O(N) time
    Goes backwards through the string.  Keep track of the end of the word to add to string
    buffer once it finds a space char.
     */
public class ReverseWords {
    public String reverseWords(String s) {
        StringBuffer strBuf = new StringBuffer();
        int end = s.length();
        for(int x = s.length() - 1; x >= 0; x--) {
            if (s.charAt(x) == ' ' || x == 0) {
                strBuf.append(s.substring(x > 0 ? x + 1 : 0, end));
                strBuf.append(" ");
                while (x - 1 > 0 && s.charAt(x-1) == ' ') {
                    x -= 1;
                }
                end = x;
            }



        }
        while (strBuf.length() > 0 && strBuf.charAt(strBuf.length() - 1) == ' ') {
            strBuf.deleteCharAt(strBuf.length() - 1);
        }
        while (strBuf.length() > 0 && strBuf.charAt(0) == ' ') {
            strBuf.deleteCharAt(0);
        }
        return strBuf.toString();
    }
}