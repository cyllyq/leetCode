/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class DeleteDuplicates {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode reHead = head;
        ListNode pre = head;
        int val = -1;
        while(head!=null){
            if (head.val==val){
                pre.next = head.next;
            }else{
                pre = head;
                val = head.val;
            }
            head = head.next;
        }
        return reHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        //ListNode head = new ListNode(1, new ListNode(2, new ListNode(2)));
        deleteDuplicates(head);
        while(head!=null){
            System.out.print(head.val);
            head = head.next;
        }
    }
}
