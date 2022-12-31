package mastery;

import jdk.nashorn.internal.ir.Node;

public class AddTwoNumbersLinkedL {

      public static class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

      public static ListNode addTwoNumbers() {

            ListNode dummyHead = new ListNode(0);
            ListNode resultHead = new ListNode();
            ListNode p = new ListNode();
            p.val = 5;
            ListNode q = new ListNode();
            int sum = 0;
            int carry = 0;

            while(p != null || q != null) {
                  if (p != null && q != null) {
                        sum = p.val+q.val+carry; //10
                        p = p.next;
                        q = q.next;
                  } else if(p != null) {
                        sum = p.val+carry;
                        p = p.next;
                  } else if(q != null) {
                        sum = q.val+carry;
                        q = q.next;
                  }

                  carry = sum/10; // 1 --- divisor
                  sum = sum%10; // 0... this should be added to dummyhead

                  dummyHead.next = new ListNode(sum);
                  dummyHead = dummyHead.next;
            }

            if (carry>0) {
                  dummyHead.next = new ListNode(carry);
                  dummyHead = dummyHead.next;
            }
            return resultHead.next;
      }

      public static void main(String[] args){
            System.out.println(addTwoNumbers());
      }


}
