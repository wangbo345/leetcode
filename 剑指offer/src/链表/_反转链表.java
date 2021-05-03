package 链表;

import java.util.Stack;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/3
 * @description :
 */
public class _反转链表 {
    public ListNode reverseList(ListNode head) {
        ListNode p=head;
        if (p==null){
            return null;
        }
        Stack<Integer> stack=new Stack<>();
        while(p!=null){
            stack.push(p.val);
            p=p.next;
        }
        ListNode pFinal=new ListNode(-1);
        ListNode pReturn=pFinal;
        while(!stack.isEmpty()){
            ListNode temp=new ListNode(stack.pop());
            pFinal.next=temp;
            pFinal=pFinal.next;
        }
        return pReturn.next;
    }
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
