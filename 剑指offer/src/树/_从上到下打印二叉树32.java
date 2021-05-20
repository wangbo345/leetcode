package 树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/20
 * @description :
 */
public class _从上到下打印二叉树32 {
    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode poll = queue.poll();
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
                size--;
                list.add(poll.val);
            }
        }

        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        return a;
    }

}
