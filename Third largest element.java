// time complexity:o(n)

class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    int first=0;
	    int second=Integer.MIN_VALUE;
	    int third=Integer.MIN_VALUE;
	    if(n<3){
	        return -1;
	    }
	    else{
	        for(int i=0;i<n;i++){
	            if(a[i]>=first){
	                third=second;
	                second=first;
	                first=a[i];
	            }
	            else if(a[i]>=second && a[i]<=first){
	                third=second;
	                second=a[i];
	            }
	            else if(a[i]>=third && a[i]<=second ){
	                third=a[i];
	            }
	        }
	    }
	    return third;
    }
}
