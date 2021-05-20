package 树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/18
 * @description :
 */
public class _二叉树的深度 {
    public static void main(String[] args) {

    }
    //递归dfs(深度优先搜索)
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
    //迭代bfs(广度优先搜索)
    public int maxDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int sum = 0;
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
                size=size-1;
            }
            sum++;
        }
        return sum;
    }
}


























