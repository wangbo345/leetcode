package 栈;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/8
 * @description :
 */
public class _队列的最大值 {

    private static class MaxQueue {
        private Stack<Integer> stack;
        private Stack<Integer> stack2;
        public MaxQueue() {
            this.stack=new Stack<>();
            this.stack2=new Stack<>();
        }

        public int max_value() {
            if (stack.isEmpty()) {
                return -1;
            }
            List<Integer> list=new ArrayList<>();
            while (!stack.isEmpty()) {
                Integer pop = stack.pop();
                list.add(pop);
            }
            for(int i=list.size()-1;i>=0;i--){
                stack.push(list.get(i));
            }
            Integer max = list.get(0);
            if (list.size() == 1) {
                return max;
            }
            for (int i = 1; i < list.size(); i++) {
                if(list.get(i)>max){
                    max=list.get(i);
                }
            }
            return max;
        }

        public void push_back(int value) {
            stack.push(value);
        }

        public int pop_front() {
            if (stack.isEmpty()) {
                return -1;
            }
            while (!stack.isEmpty()){
                stack2.push(stack.pop());
            }
            Integer pop = stack2.pop();
            while (!stack2.isEmpty()) {
                stack.push(stack2.pop());
            }
            return pop;
        }
    }

}
