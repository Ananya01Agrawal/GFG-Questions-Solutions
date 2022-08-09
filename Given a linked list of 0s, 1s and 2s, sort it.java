class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        int zeroCount=0;
        int oneCount=0;
        int twoCount=0;
        
        Node current=head;
        
        while(current!=null){
            if(current.data==0){
                zeroCount++;
            }
            else if(current.data==1){
                oneCount++;
            }
            else if(current.data==2){
                twoCount++;
            }
            current=current.next;
        }
        current=head;
        
        while(current!=null){
            if(zeroCount!=0){
                current.data=0;
                zeroCount--;
            }
            else if(oneCount!=0){
                current.data=1;
                oneCount--;
            }
            else if(twoCount!=0){
                current.data=2;
                twoCount--;
            }
            current=current.next;
        }
        return head;
    }
}
