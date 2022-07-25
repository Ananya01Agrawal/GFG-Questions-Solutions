class Solution
{
    public static void sort012(int a[], int n)
    {
        int z=0,b=0,c=0;
        for(int i=0;i<n;i++){
            if(a[i]==0) z++;
            if(a[i]==1) b++;
            if(a[i]==2) c++;
            
        }
        for(int i=0;i<n;i++){
            if(i<z) a[i]=0;
            else if(i<z+b) a[i]=1;
            else a[i]=2;
            
        }
       
        
    }
}
