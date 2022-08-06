class Solution
{
    public void countOddEven(int[] arr, int n)
    {
        int counte=0;
        int counto=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                counte++;
            }
            else{
                counto++;
            }
        }
        System.out.println(counto+" "+counte);
        
        // Code here
    }
}
