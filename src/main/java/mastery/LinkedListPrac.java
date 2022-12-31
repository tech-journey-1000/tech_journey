package mastery;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class LinkedListPrac {

    int value;
    LinkedListPrac next;

    public LinkedListPrac(int value) {
        this.value = value;
    }

    public LinkedListPrac(int value, LinkedListPrac next) {
        this.value = value;
        this.next = next;
    }

    public LinkedListPrac() {

    }

    public static void main(String[] args) {

        LinkedListPrac head1 = new LinkedListPrac(1);
        LinkedListPrac nodea = new LinkedListPrac(2);
        LinkedListPrac nodeb = new LinkedListPrac(3);
        LinkedListPrac nodec = new LinkedListPrac(4);
//        LinkedListPrac noded = new LinkedListPrac(5);

        head1.next = nodea;
        nodea.next = nodeb;
        nodeb.next = nodec;
//        nodec.next = noded;

        LinkedListPrac head2 = new LinkedListPrac(1);
        LinkedListPrac heada = new LinkedListPrac(1);
        LinkedListPrac headb = new LinkedListPrac(8);
        LinkedListPrac headc = new LinkedListPrac(9);
        LinkedListPrac headd = new LinkedListPrac(10);

        head2.next = heada;
        heada.next = headb;
        headb.next = headc;
        headc.next = headd;

//        System.out.println(countNodes(node));
//        System.out.println(reverse(node));
//        System.out.println(palindrome(node));
//        System.out.println(newLL(node));
//        System.out.println(reverse2(node));
//        System.out.println(zip(node, head));
//        System.out.println(dummy(node));
//        System.out.println(removeElements(node, 2));
//        System.out.println(mergeTwoLl(head1, head2));
        System.out.println(reorderList(head1));
    }

    static LinkedListPrac mergeTwoLl(LinkedListPrac node1, LinkedListPrac node2){
        //1,2,3,4,5 // 1,1,8,9,10
        // 0,1,1,1,8,9,10
        LinkedListPrac result = new LinkedListPrac(); // 0,null
        LinkedListPrac dummy = result; //0,null
        while(node1!=null && node2!=null){
            if(node1.value<node2.value){
                dummy.next = node1;
                node1 = node1.next;
            } else {
                dummy.next = node2;
                node2 = node2.next;
            }
            dummy = dummy.next;
        }
        if(node1!=null){
            dummy.next = node1;
        } else{
            dummy.next = node2;
        }
        return result.next;
    }

    static Boolean reorderList(LinkedListPrac head){

        LinkedListPrac dummy = head;
        int count = 0;
        while(dummy!=null){
            count++;
            dummy = dummy.next;
        }
        int middle = count/2;
        int lenght = 0;

        LinkedListPrac head2 = null; // 4,3
        LinkedListPrac dummy2 = head;
        //[1,2,3,4]
        while(dummy2!=null) {
            LinkedListPrac next = dummy2.next;
            if(lenght>=middle){
                LinkedListPrac temp = head2; //null
                dummy2.next = temp; // null
                head2 = dummy2; // 3,null
            }
            lenght++;
            dummy2 = next;
        }
        while(head2.next!=null){ // 3
            LinkedListPrac next = head.next; // next = 2,3
            head.next = head2; // head = 1,4,3
            head = next; // head = 2,3

            next = head2.next; // 3,null
            head2.next = head; //
            head2 = next; // 3,null
        }
        return true;
    }

    //1,2,3,4,5 result = 1,2,3
    static LinkedListPrac dummy(LinkedListPrac head){

        LinkedListPrac dummy = new LinkedListPrac();//0
        dummy.next = head; // 012345
        LinkedListPrac prev = dummy;

        while (head!=null && head.value<=3){
            prev = head;
            head = head.next;
        }
//        head.next = null;

        return dummy.next;
    }

    static LinkedListPrac removeElements(LinkedListPrac head, int val) {
        LinkedListPrac dummy = new LinkedListPrac();
        dummy.next = head;
        LinkedListPrac prev = dummy;

        while(head!=null){
            if(head.value == 2){
                prev.next = head.next;
            } else {
                prev = head;
            }
            head = head.next;
        }
        return dummy.next;
    }

    //1,2,3,4,5 = node
    //6,7,8,9,10 = head
    //1,6,2,7,3,8,4,9,5,10
    static LinkedListPrac zip(LinkedListPrac node, LinkedListPrac head) {
        int count = 0;
        LinkedListPrac result = node; //
        LinkedListPrac current1 = node.next; //

//        LinkedListPrac result = node; // here node will remain same only its next will change because result.next is updating
//        result.next = head;

        while(current1!=null && head!=null){
            if (count%2 == 0){
                result.next = head;
                head = head.next;
            } else {
                result.next = current1;
                current1 = current1.next;
            }
            result = result.next; //
            count++;
        }
        if(current1!=null) result.next = current1;
        if(head!=null) result.next = head;

        return node;
    }

    //1,2,3,4,5
    static LinkedListPrac reverse2(LinkedListPrac node) {
        LinkedListPrac result = null;
        while(node!=null){
            LinkedListPrac next = node.next; // 2,3,4,5

            node.next = result; // null // 1,null
            result = node; // 1,null // 2,1,null
            node = next;
        }
        return result;
    }

    //1,2,3,4,5
    static int countNodes(LinkedListPrac node) {
        int count = 0;
        while(node != null){
            count ++;
            node = node.next;
        }
        return count;
    }

    static LinkedListPrac newLL(LinkedListPrac head) {
        LinkedListPrac newNode = head;
        return newNode;
    }

    //1,2,3,4,5
    static int loopInTheNode(LinkedListPrac node) {
        int count = 0;
        while(node != null){
            count ++;
            node = node.next;
        }
        return count;
    }

    static LinkedListPrac reverse(LinkedListPrac head){
        LinkedListPrac result = null;
        while(head != null) {
            LinkedListPrac nextTemp = head.next; // 2,3,4,5 // 3,4,5
            head.next = result; // null // 1,null
            result = head; // 1,null //
            head = nextTemp; // 2,3,4,5 // 3,4,5
        }

        return result;
    }

    static boolean palindrome(LinkedListPrac head){
        LinkedListPrac result = null;
        boolean res = false;
        LinkedListPrac og = head;

        while(og != null) {
            LinkedListPrac nextTemp = og.next; //
            og.next = result; // sending/moving the prev val to next
            result = og; // taking curr value to head
            og = nextTemp; // 2,3,4
        }

        while(head != null) {
            if (head == result) {
                return true;
            }
            head = head.next;
        }
        return res;
    }

//    public static LinkedListPrac linkFirst(int val) {
//        LinkedListPrac f = first;
//        LinkedListPrac newNode = new LinkedListPrac(null, 1, f);
//        first = newNode;
//        if (f == null) {
//            last = newNode;
//        } else {
//            f.prev = newNode;
//        }
//        return f;
//    }

}