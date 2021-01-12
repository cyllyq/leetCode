/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MergeTwoLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if (l1==null || l2==null){
            return l1==null?l2:l1;
        }
        ListNode firstNode = null;
        ListNode temp = null;
        while (l1!=null && l2!=null){
            if (l1.val<l2.val){
                if (firstNode==null){
                    firstNode=l1;
                    temp=firstNode;
                }else{
                    temp.next = l1;
                    temp = l1;
                }
                l1 = l1.next;
            }else{
                if (firstNode==null){
                    firstNode=l2;
                    temp=firstNode;
                }else{
                    temp.next = l2;
                    temp = l2;
                }
                l2=l2.next;
            }
        }
        temp.next = l1 == null ? l2 : l1;
        return firstNode;
    }


    public static void main(String[] args) {
        //
//        ListNode l1 = new ListNode(5, new ListNode(9, new ListNode(25, new ListNode(60, null))));
//        ListNode l2 = new ListNode(4, new ListNode(17, new ListNode(20, new ListNode(23, null))));
        ListNode l1 = null;
        ListNode l2 = new ListNode(0);
//        while (l1!=null){
//            System.out.println(l1.val);
//            l1 = l1.next;
//        }
//        while (l2!=null){
//            System.out.println(l2.val);
//            l2 = l2.next;
//        }
        ListNode newList = MergeTwoLists.mergeTwoLists(l1, l2);
        while (newList!=null){
            System.out.println(newList.val);
            newList = newList.next;
        }
    }
}
