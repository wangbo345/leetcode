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
public class _从上到下打印二叉树 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<List<Integer>> lists=new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list=new ArrayList<>();
            int size = queue.size();
            while (size > 0) {
                TreeNode poll = queue.poll();
                list.add(poll.val);
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
                size--;
            }
            lists.add(list);
        }
        return lists;
    }
}
