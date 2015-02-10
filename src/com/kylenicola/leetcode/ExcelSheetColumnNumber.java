package com.kylenicola.leetcode;

/**
 * Created by kyle on 2/9/15.
 */

/*Given a column title as appear in an Excel sheet, return its corresponding column number.

        For example:

        A -> 1
        B -> 2
        C -> 3
        ...
        Z -> 26
        AA -> 27
        AB -> 28*/

/* Notes:

    O(N)
    This is like using base 26 numbers.

     */

public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int answer = 0;
        int aChar = (int) 'A' - 1;
        int n = 0;
        for(int x = s.length() - 1; x >= 0; x--)
        {
            answer += (int) (s.charAt(x) - aChar) * Math.pow(26, n++);
        }
        return answer;
    }
}
