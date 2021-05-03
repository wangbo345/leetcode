package 链表;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/3
 * @description :
 */
public class _链表中倒数第k个节点 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p=head;
        if(p==null){
            return null;
        }
        Stack<Integer> stack=new Stack<>();
        while(p!=null){
            stack.push(p.val);
            p=p.next;
        }
        int count=0;
        List<Integer> list=new ArrayList<>();
        while(count<k){
            list.add(stack.pop());
            count++;
        }
        ListNode pFinal=new ListNode(-1);
        ListNode pReturn=pFinal;
        for (int i=list.size()-1;i>=0;i--){
            ListNode temp=new ListNode(list.get(i));
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
