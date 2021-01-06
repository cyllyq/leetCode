/**
 * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
//Definition for singly-linked list.
class AddTwoNumbers {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode headNode = null;
            ListNode pre = null;
            int jinwei = 0;
            while(l1!=null || l2!=null){
                int _l1 = l1!=null?l1.val:0;
                int _l2 = l2!=null?l2.val:0;
                int val = (_l1+_l2+jinwei)%10;
                if (headNode==null){
                    headNode = new ListNode(val);
                    pre = headNode;
                }else{
                    ListNode _pre = new ListNode(val);
                    pre.next = _pre;
                    pre = _pre;
                }
                l1 = l1==null?null:l1.next;
                l2 = l2==null?null:l2.next;
                jinwei = (_l1+_l2+jinwei)/10;
            }
            if(jinwei!=0){
                pre.next = new ListNode(1);
            }
            return headNode;
        }
    }

    public static void main(String[] args) {

    }
}