// You are given the heads of two sorted linked lists list1 and list2.

// Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

// Return the head of the merged linked list.

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //check both edge cases where either lists could have nothing then return the list
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        //check if list1 index is smaller then list 2
        if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
