lass Solution{
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        Arrays.sort(v1);// sorting the first array
        Arrays.sort(v2);// sorung the second array
        ArrayList<Integer>arr=new ArrayList<>();// creating the new array
        int i=0,j=0;
        while(i<v1.length && j<v2.length){
            if(v1[i]==v2[j]){// if the elements are same then then we add the elements in the arraylist
            arr.add(v1[i]);
            i++;
            j++;
                
            }
            else if(v1[i]>v2[j]){
                j++;
                continue;
            }
            else if(v1[i]<v2[j]){
                i++;
                continue;
            }
        }
        return arr;
        
    }
}
