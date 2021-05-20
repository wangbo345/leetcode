package 树;
/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/19
 * @description :
 */
public class _二叉搜索树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        if (left == null) {
            return right;
        }
        else {
            return left;
        }

    }
}
