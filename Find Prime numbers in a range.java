
class Solution {
    static boolean isprime(int n){
       for(int i=2;i<=(int)Math.sqrt(n);i++){
           if(n%i==0)
           return false;
       }
       return true;
   }
   ArrayList<Integer> primeRange(int M, int N) {
       // code here
       ArrayList<Integer> ar=new ArrayList<>();
       for(int i=M;i<=N;i++){
           if(i>1 && isprime(i))
           ar.add(i);
       }
       return ar;
   }
}
    
