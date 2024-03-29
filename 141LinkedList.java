// 141. Linked List Cycle
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// To determine if a linked list has a cycle, you can use Floyd's Tortoise and Hare algorithm. This algorithm involves two pointers, one moving at twice the speed of the other. If there is a cycle, eventually the faster pointer will meet the slower pointer. If there is no cycle, the faster pointer will reach the end of the list.

// Here's a Java implementation:

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle if the list is empty or has only one node
        }
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false; // Reached the end of the list, no cycle
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return true; // Cycle detected
    }
}
// This algorithm has a time complexity of O(n) and a space complexity of O(1), meeting the requirement of solving it using constant memory.


