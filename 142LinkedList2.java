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

//  //**
//  To solve this problem, you can use Floyd's Tortoise and Hare algorithm, also known as the "hare and tortoise" algorithm. Here's how it works:

// Initialize two pointers, slow and fast, both pointing to the head of the linked list.
// Move slow one step at a time and fast two steps at a time.
// If there is a cycle, eventually slow and fast will meet at some point within the cycle.
// Once they meet, reset one of the pointers back to the head of the list, and move both pointers one step at a time. The point where they meet again will be the start of the cycle.
// Here's the implementation:

// This algorithm runs in O(n) time complexity and O(1) space complexity, meeting the requirements of the problem.

// **/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // No cycle if there are less than two nodes
        }

        ListNode slow = head;
        ListNode fast = head;

        // Move slow and fast pointers until they meet
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break; // Cycle detected
            }
        }

        // If fast reached the end of the list, there is no cycle
        if (fast == null || fast.next == null) {
            return null;
        }

        // Reset one of the pointers to the head 
        //and move both at the same pace
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // The point where they meet is the start of the cycle
        return slow;
    }
}
