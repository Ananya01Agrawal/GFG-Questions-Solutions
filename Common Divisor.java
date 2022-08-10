
class Complete{
    
    // Function for finding maximum and value pair
    public static int common_divisor (int n, int m) {
        //Complete the function
        int a=0;
        for(int i=1;i<=Math.min(m,n);i++)
        {
            if(n%i==0 &&m%i==0){
                a++;
            }
        }
        return a;
    }
    
    
}
