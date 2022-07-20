class Solution{
    static int checkPerfectSquare(int N){
        for(int i=1;i*i<=N;i++){
            if(i*i==N)
            return 1;
        }
         return 0;
    }
    
}
