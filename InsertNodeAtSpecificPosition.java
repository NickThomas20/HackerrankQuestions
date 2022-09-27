 public static SinglyLinkedListNode insert_at_position(SinglyLinkedListNode head, int val, int pos) {
    // Write your code here
        SinglyLinkedListNode node = new SinglyLinkedListNode(val);
        SinglyLinkedListNode tmp = head;

                if(pos == 0) {

                        node.next = head;
                        head = node;
                }
                else {
                        for (int i = 0; i < pos - 1; i++) {
                                tmp = tmp.next;
                        }
                        node.next = tmp.next;
                        tmp.next = node;
                }
                return head;
    }

}
