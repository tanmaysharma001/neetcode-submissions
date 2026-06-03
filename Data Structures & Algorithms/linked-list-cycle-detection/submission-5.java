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
    public boolean hasCycle(ListNode head) {

        ListNode curr= new ListNode();
        curr= head;
        HashSet <ListNode> set = new HashSet<>();

        while(curr!=null){
            if(set.contains(curr)){
                return true;
            }
            else{
                set.add(curr);
            }

            curr= curr.next;
        }
        return false;
    }
}
