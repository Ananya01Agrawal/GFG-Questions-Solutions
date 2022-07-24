
class Solution
{
	int  select(int arr[], int i)
	{
	    int min=i;
	    for(int j=i+1;j<arr.length;j++){
	        if(arr[j]<arr[min]){
	            min=j;
	        }
	    }
	    return min;
        // code here such that selectionSort() sorts arr[]
	}
	
	void selectionSort(int arr[], int n)
	{
	    for(int i=0;i<arr.length;i++){
	        int min=select(arr,i);
	        //swapping
	        int temp;
	        temp=arr[i];
	        arr[i]=arr[min];
	        arr[min]=temp;
	    }
	   
	}
}
