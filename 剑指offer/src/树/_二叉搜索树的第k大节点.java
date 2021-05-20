package 树;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/18
 * @description :
 */
public class _二叉搜索树的第k大节点 {
    public int kthLargest(TreeNode root, int k) {
        if (root == null || k<0) {
            return 0;
        }
        List<Integer> list=new ArrayList<>();
        LDR(root, list);
        if (list.size() < k) {
            return 0;
        }
        return list.get(list.size()-k);
    }
    //中序遍历
    public void LDR(TreeNode treeNode,List<Integer> list) {
        if (treeNode == null) {
            return;
        }
        LDR(treeNode.left, list);
        list.add(treeNode.val);
        LDR(treeNode.right,list);
    }
}
