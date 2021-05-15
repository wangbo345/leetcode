package others;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/15
 * @description :
 */
public class _合并两个排序的链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode listNode=new ListNode(-1);
        ListNode p=listNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                p.next=l1;
                p=p.next;
                l1=l1.next;
            }
            else {
                p.next=l2;
                p=p.next;
                l2=l2.next;
            }
        }
        if (l1 == null) {
            p.next=l2;
        }
        else {
            p.next=l1;
        }
        return listNode.next;
    }

      private static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

}
