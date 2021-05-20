package 树;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/20
 * @description :
 */
public class _对称的二叉树 {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }

    //返回一个二叉树的对称树
    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }

}
