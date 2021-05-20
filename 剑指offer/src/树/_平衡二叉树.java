package 树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/19
 * @description :
 */
public class _平衡二叉树 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(depth(root.left) - depth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    //输入一颗二叉树,计算出他的深度
    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(depth(root.left),depth(root.right))+1;
    }
}
