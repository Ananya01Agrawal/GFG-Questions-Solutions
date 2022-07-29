class GfG {
    int convertfive(int num) {
         int ans=0;
        for(int i=1; num>0; i=i*10) {
            int dig = num%10;
            if(dig==0) {
                dig=5;
            }
            ans = dig*i + ans;
            num=num/10;
        }
        return ans;
    }
}
