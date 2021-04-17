package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 编写一个程序，找到两个单链表相交的起始节点。
 */

public class GetIntersectionNode {
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while (headA!=null || headB!=null){
            if (headA!=null && !set.add(headA)){
                return headA;
            }
            if (headB!=null && !set.add(headB)){
                return headB;
            }
            headA = headA!=null?headA.next:headA;
            headB = headB!=null?headB.next:headB;
        }
        return null;
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null || headB==null){
            return null;
        }

        ListNode head1 = headA;
        ListNode head2 = headB;

        while (head1 != head2){
            if (head1 == null){
                head1 = headB;
            }else{
                head1 = head1.next;
            }

            if (head2 == null){
                head2 = headA;
            }else{
                head2 = head2.next;
            }
        }
        return head1;
    }

}
