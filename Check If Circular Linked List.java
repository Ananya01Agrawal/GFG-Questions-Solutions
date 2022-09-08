class GfG
{
    boolean isCircular(Node head)
    {
        if(head==null) return true;
        
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            if(temp.next==head) return true;
        }
		return false;
    }
}
