
class Solution {
    
    public long firstIndex(long arr[], long n)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)
            return i;
        }
        return -1;
        
    }
}
