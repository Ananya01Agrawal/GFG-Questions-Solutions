class Solution {
    int binarysearch(int arr[], int n, int k) {
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>k){
                end = mid-1;
            }else if(arr[mid]<k){
                start = mid+1;
            }else{
                return mid;
            }
            
        }
        return -1;
    }
}
