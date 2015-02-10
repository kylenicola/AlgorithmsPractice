package com.kylenicola.leetcode;

/**
 * Created by kyle on 2/9/15.
 */
public class ValidateBinaryTree {
    boolean prevValSet = false;
    int prevVal = Integer.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if(root == null)
        {
            return true;
        }
        boolean isValid = true;
        if(root.left != null)
        {
            isValid = isValidBST(root.left);
        }
        if(!isValid)
        {
            return isValid;
        }
        if(prevValSet != false && prevVal >= root.val)
        {
            return false;
        }
        else
        {
            prevVal = root.val;
            prevValSet = true;
        }
        if(root.right != null)
        {
            isValid = isValidBST(root.right);
        }
        return isValid;
    }
}
