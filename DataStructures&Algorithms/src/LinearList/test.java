package LinearList;

public class test {
    //Definition for singly-linked list.
 public static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
        ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 static class Solution {
     public static void main(String[] args) {
         ListNode node = new ListNode();
     }

     public static ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode pre = head;
         ListNode node = head;
         int last = 0;
         while(node != null){
             last++;
             node = node.next;
         }
         if(last == 0){
             return head.next;
         }
         for(int i = 0; i < last -1; i++){
             pre = pre.next;
         }
         pre.next = pre.next.next;
         return head;
     }
 }
}
