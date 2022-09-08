class GfG
{
    int compare(Node node1, Node node2)
    {
        Node temp=node1,temp2=node2;
        while(temp!=null&&temp2!=null){
            if(temp.data>temp2.data){
                return 1;
            }
            if(temp.data<temp2.data){
                return-1;
            }
            temp=temp.next;
            temp2=temp2.next;
        }
        return 0;
    }
}
