
class Solution {
    int remove_duplicate(int a[],int n){
        if(n==0){
            return 0;
        }
        int i=0;
        for(int j=1;j<n;j++){
            if(a[j]!=a[i])
            i++;
            a[i]=a[j];
        }
        return i+1;
        // code here
    }
}
