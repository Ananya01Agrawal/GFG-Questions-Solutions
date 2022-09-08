class Solution {
    Node deleteMid(Node head) {
        Node curr=head;
        int len=0;
        while(curr!=null){
            len++;// calculating the length of the linked list
            curr=curr.next;
        }
        Node slow=head;
        for(int i=1;i<len/2;i++){
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
