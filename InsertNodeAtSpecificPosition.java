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

// Write a function that inserts a new item into a Linked List of integers at the given position.

// Input Format

// Your function should accept the following parameters:

// Parameter #1: The first Node of the Linked List (Node is defined in the sample code below)
// Parameter #2: The integer value to be inserted
// Parameter #3: The zero-indexed integer position to insert the item
// Constraints

// 1 <= n <= 1000
// Insertion index will be in the range [0, n]
// Output Format

// Your function should return the first Node of the Linked List with the new value inserted.

// Sample Input 0

// 3
// 1
// 3
// 5
// 2
// 1
// Sample Output 0

// 1,2,3,5
