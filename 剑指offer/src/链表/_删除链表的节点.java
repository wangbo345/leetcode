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
public class _删除链表的节点 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head==null){
            return null;
        }
        ListNode p=new ListNode(-1);
        ListNode pFinal=p;
        p.next=head;
        while(head!=null){
            if(head.val==val){
                p.next=head.next;
                head=head.next;
                continue;
            }
            p=p.next;
            head=head.next;
        }
        return pFinal.next;
    }
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

