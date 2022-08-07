
class Compute {
    
    public int largest(int arr[], int n)
    {
        int l=arr[0];
        for(int i=1;i<n;i++){
            l=Math.max(l,arr[i]);
        }
        return l;
        
    }
}
