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
class Solution {
    public boolean isPalindrome(ListNode head) {
        LinkedList<Integer> stack = new LinkedList<>();

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        
        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            if (stack.isEmpty() || !stack.pop().equals(slow.val)) {
                return false;
            }
            slow = slow.next;
        }

        return true;
    }
}

