// This is an introduction to practice traversing a linked list. Given a pointer to the head node of a linked list, print each node's data element, one per line. If the head pointer is null (indicating the list is empty), there is nothing to print.

// Function Description

// Complete the printLinkedList function in the editor below.

// printLinkedList has the following parameter(s):

// SinglyLinkedListNode head: a reference to the head of the list
// Input Format

// The first line of input contains n, the number of elements in the linked list. The next lines contain one element each, the data values for each node.

// Note: Do not read any input from stdin/console. Complete the printLinkedList function in the editor below.

// Constraints

// 1 <= n <= 1000

// Output Format

// For each node, print its value on a new line (console.log in Javascript).

// Sample Input 0

// 2
// 16
// 13
// Sample Output 0

// 16
// 13



public static void print_linked_list(SinglyLinkedListNode head) {
    // Write your code here
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }

    }


