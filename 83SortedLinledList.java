// To solve the "Remove Duplicates from Sorted List" problem, you can use a simple iterative approach. Here's a step-by-step explanation of how you can implement it:

// Start with the head of the linked list.
// Traverse the linked list one node at a time.
// For each node, compare its value with the value of the next node.
// If the values are the same, skip the next node by adjusting the pointers.
// Repeat this process until you reach the end of the list.
// Here's a Java implementation:

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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode current = head;
        
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next; // Skip the next node
            } else {
                current = current.next; // Move to the next node
            }
        }
        
        return head;
    }
}
// This solution has a time complexity of O(n), where n is the number of nodes in the linked list, because it only requires a single pass through the list.
