package 链表;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : wangbo
 * @version : 1.0
 * @date :Create in 2021/5/4
 * @description :
 */
public class _复杂链表的复制 {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Node p=head;
        Map<Node,Node> map=new HashMap<>();
        while(p!=null){
            map.put(p,new Node(p.val));
            p=p.next;
        }
        p=head;
        while(p!=null){
            map.get(p).next=map.get(p.next);
            map.get(p).random=map.get(p.random);
            p=p.next;
        }
        return map.get(head);

    }
    private static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
