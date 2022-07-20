class Solution {
    int print2largest(int arr[], int n) {
        int one=-1;
        int two=-1;
        for(int i=0;i<n;i++){
            if(one<arr[i] ){
                two=one;
                one=arr[i];
            }
            else if(one>arr[i] && two<arr[i])
            two =arr[i];
        }
        return two;
    }
}
