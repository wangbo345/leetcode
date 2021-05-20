package 树;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/18
 * @description :
 */
public class _二叉树的镜像 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root != null) {
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            mirrorTree(root.left);
            mirrorTree(root.right);
            return root;
        }
        return null;
    }
}
