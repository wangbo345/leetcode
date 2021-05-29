package 栈;

import java.util.Stack;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/24
 * @description :
 */
public class _栈的压入弹出序列 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int count=0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty()&&stack.peek() == popped[count]) {
                stack.pop();
                count++;
            }
        }
        if (count == popped.length) {
            return true;
        } else {
            return false;
        }

    }
}
