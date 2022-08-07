class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int array[], int a, int b)
    {
        int n=array.length;
        int low=0,mid=0,h=n-1;
        // we are taking low for the smallest element
        // we are taking h for the higher element
        // we are taking the m in the middle of the low and high
        while(mid<=h){
            if(array[mid]<a){
                int t=array[mid];
                array[mid]=array[low];
                array[low]=t;
                mid++;low++;
            }
            else if(array[mid]>b){
                int t=array[mid];
                array[mid]=array[h];
                array[h]=t;
                h--;
            }
            else{
                mid++;
            }
        }
        // code here 
    }
}
