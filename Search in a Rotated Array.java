class Solution
{
    int search(int arr[], int l, int h, int key)
    {
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr[mid]==key) return mid;
            if(arr[l]<=arr[mid]){
                if(key<=arr[mid]&&key>=arr[l]){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(key<=arr[h]&&key>=arr[mid])
                {
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
        }
        return -1;
        
    }
}
