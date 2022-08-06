
class Solution {
    static int RedOrGreen(int N, String S) {
        int countr=0;
        int countg=0;
        String str="";
        char c=S.charAt(0);
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)!=c){
                countr++;
            }
            else{
                countg++;
            }
        }
        if(countr>countg){
            return countg;
        }
        return countr;
        //code here
    }
}
