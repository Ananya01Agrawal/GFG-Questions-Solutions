
class Solution
{
    public void swapElements(int[] arr, int n)
    {
        int i=0,j=i+2;
        while(j<n){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j++;
        }
        // Code here
    }
}
