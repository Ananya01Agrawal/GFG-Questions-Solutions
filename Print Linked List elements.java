class Solution
{
    // Print elements of a linked list on console
    // head pointer input could be NULL as well
    // for empty list
    void display(Node head)
    {
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        display(head.next);
        //add code here.
    }
}
