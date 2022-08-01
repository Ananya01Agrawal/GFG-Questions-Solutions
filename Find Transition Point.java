class GfG {
    int transitionPoint(int arr[], int n) {
         int l=0;
 int h=n-1;
 int m=0;
 while(l<=h){
     m=(l+h)/2;
     if(arr[m]==1)
         h=m-1;
     else
         l=m+1;
 }
 if(l==n)
    return -1;
 return l;
    }
}
