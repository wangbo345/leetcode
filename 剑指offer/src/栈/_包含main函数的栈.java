package 栈;

import java.util.Stack;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/7
 * @description :
 */
public class _包含main函数的栈 {
    public static void main(String[] args) {
        MinStack minStack=new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        minStack.pop();
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());

    }
    private static class MinStack {
        private Stack<Integer> stack;
        private Stack<Integer> minElement;
        /** initialize your data structure here. */
        public MinStack() {
            this.stack=new Stack<>();
            this.minElement=new Stack<>();
        }

        public void push(int x) {
            if (stack.isEmpty()){
                minElement.push(x);
            }
            if(x<=minElement.peek()){
                minElement.push(x);
            }
            stack.push(x);
        }

        public void pop() {
            Integer pop = stack.pop();
            if (pop.equals(minElement.peek())){
                minElement.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int min() {
            return minElement.peek();
        }
    }
}
