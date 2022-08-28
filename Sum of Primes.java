
class Solution{
    static int primeSum(int N){
        int sum=0;
        while(N>0){
            int num=N%10;
            if(num==2||num==3||num==5||num==7){
                sum=sum+num;
            }
            N=N/10;
        }
        return sum;
        
    }
}
