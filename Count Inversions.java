// NAIVE SOLUTION
class Solution
{
    // arr[]: Input Array
    // n : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long n)
    {
        int res=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    res++;
                }
            }
        }
        return res;
        // Your Code Here
    }
}
