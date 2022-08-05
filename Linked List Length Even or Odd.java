
/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/
/* isLengthEvenorOdd method should return 0 if the length of LL is even 
   otherwise return 1.*/
class GFG
{
	int isLengthEvenorOdd(Node head1)
	{
	    //Add your code here.
	    int count=0;
	    while(head1!=null){
	        count++;
	        head1=head1.next;
	    }
	    if(count%2==0){
	        return 0;
	    }
	    return 1;
	}
}
