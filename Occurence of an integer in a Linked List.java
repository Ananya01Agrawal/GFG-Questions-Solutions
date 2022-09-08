lass Solution
{
    public static int count(Node head, int search_for)
    {
        int count=0;
        while(head!=null){
            if(head.data==search_for){
                count++;
            }
            head=head.next;
        }
        return count;
        
    }
}
