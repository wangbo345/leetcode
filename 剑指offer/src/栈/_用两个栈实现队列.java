package 栈;

import java.util.Stack;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/7
 * @description :
 */
public class _用两个栈实现队列 {

    private static class CQueue {
        private Stack<Integer> stack1;
        private Stack<Integer> stack2;
        public CQueue() {
            this.stack1=new Stack<>();
            this.stack2=new Stack<>();
        }

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead() {
            if (stack1.isEmpty()) {
                return -1;
            }
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            Integer pop = stack2.pop();
            while (!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            return pop;
        }
    }
}
