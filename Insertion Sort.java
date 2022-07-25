class Solution
{
    public void insert(int arr[], int n)
    {
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            for(;j>=0;j--){
                if(arr[j]>temp)
                arr[j+1]=arr[j];
                else
                break;
            }
            arr[j+1]=temp;
        }
    }
     public void insertionSort(int arr[], int n)
    {
        insert(arr,n);
    }
};
        
