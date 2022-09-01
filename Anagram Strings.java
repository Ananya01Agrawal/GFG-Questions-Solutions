class Solution {
    static int areAnagram(String S1, String S2) {
        char temp1[]=S1.toCharArray();
        char temp2[]=S2.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        if(Arrays.equals(temp1,temp2)){
            return 1;
        }
        return 0;
        
    }
}
