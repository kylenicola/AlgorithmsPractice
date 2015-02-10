package com.kylenicola.leetcode;

/**
 * Created by kyle on 2/9/15.
 */

/*Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

        An example is the root-to-leaf path 1->2->3 which represents the number 123.

        Find the total sum of all root-to-leaf numbers.

        For example,

        1
        / \
        2   3
        The root-to-leaf path 1->2 represents the number 12.
        The root-to-leaf path 1->3 represents the number 13.

        Return the sum = 12 + 13 = 25.*/

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
Recursive, keep track of the increasing value
 */

public class SumRootToLeaf {
    public int sumNumbers(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        int n = 0;
        int answer = sumNumbersHelper(root, n);
        return answer;
    }

    public int sumNumbersHelper(TreeNode node, int n)
    {
        int answer = 0;

        // leaf node, add val to n and return
        if(node.left == null && node.right == null)
        {
            return n + node.val;
        }
        if (node.left != null)
        {
            answer += sumNumbersHelper(node.left, (n+node.val)*10);
        }
        if (node.right != null)
        {
            answer += sumNumbersHelper(node.right, (n+node.val)*10);
        }
        return answer;
    }
}
