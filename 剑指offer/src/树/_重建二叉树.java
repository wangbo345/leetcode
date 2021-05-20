package 树;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/20
 * @description :
 */
public class _重建二叉树 {
    public static void main(String[] args) {
        int[] pre =new int[]{3,9,20,15,7};
        int[] in =new int[]{9,3,15,20,7};
        TreeNode treeNode = buildTree(pre, in);

    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        //创建根节点
        TreeNode root=new TreeNode(preorder[0]);
        //递归构建根节点的左右子树
        //传入左子树的前序遍历,中序遍历数组值
        //先获取中序遍历
        int indexInArray = findIndexInArray(inorder, preorder[0]);
        int[] arrayByIndexLeft = createArrayByIndex(inorder, 0, indexInArray - 1);
        //在获取前序遍历数组
        int[] arrayByIndex = createArrayByIndex(preorder, 1, indexInArray);
        root.left=buildTree(arrayByIndex,arrayByIndexLeft);
        int[] arrayByIndexRight = createArrayByIndex(inorder, indexInArray + 1, inorder.length - 1);
        //获取前序遍历数组
        int[] arrayByIndex1 = createArrayByIndex(preorder, indexInArray + 1, preorder.length - 1);
        root.right=buildTree(arrayByIndex1,arrayByIndexRight);
        return root;
    }

    //传入一数值找出其在数组中的下标
    public static int findIndexInArray(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //传入下标构建数组
    public static int[] createArrayByIndex(int[] array,int start, int end) {
        int[] a = new int[end - start + 1];
        int count=0;
        for (int i = start; i <= end; i++) {
            a[count] = array[i];
            count++;
        }
        return a;
    }
}
