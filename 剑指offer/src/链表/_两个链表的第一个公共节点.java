package 链表;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/4
 * @description :
 */
public class _两个链表的第一个公共节点 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        ListNode pA=headA;
        while(pA!=null){
            ListNode pC=headB;
            while(pC!=null){
                if(pA==pC){
                    return pA;
                }
                pC=pC.next;
            }
            pA=pA.next;
        }
        return null;
    }
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
