class Solution
{
     long floorSqrt(long x)
	 {
	    long  low=1,high=x,mid ,msq,ans=-1;
	     while(low<=high){
	          mid=(low+high)/2;
	          msq=mid*mid;
	         if(msq==x)
	            return mid;
	         else if(msq>x)
	            high=mid-1;
	         else{
	             low=mid+1;
	             ans=mid;
	         }
	           
	     }
	     return ans;
	 }
}
