package 链表;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/2
 * @description :
 */
public class _从尾到头打印链表 {
    public int[] reversePrint(ListNode head) {
        if(head==null){
            return new int[0];
        }
        Stack<Integer> stack=new Stack<>();
        ListNode p=head;
        while(p!=null){
            stack.push(p.val);
            p=p.next;
        }
        List<Integer> list=new ArrayList<>();
        while(!stack.empty()){
            Integer pop = stack.pop();
            list.add(pop);
        }
        int[] a=new int[list.size()];
        for(int i=0;i<list.size();i++){
            a[i]=list.get(i);
        }
        return a;

    }
    private static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }
}
