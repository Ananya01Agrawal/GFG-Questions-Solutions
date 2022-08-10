
class Geeks{
    
    static void follPatt(String s)
    {
        
       int n = s.length();
       int i = 0;
       int result = 1;
       int count_x;
       int count_y; 
       
       while(i<n){
           
           count_x = 0;
           count_y = 0;
           
           //count x
           for(; i<n; i++){
               if(s.charAt(i) == 'x'){
                   count_x++;
               }else{
                   break;
               }
           }
           
           //count y
           for(; i<n;i++){
               if(s.charAt(i) == 'y'){
                   count_y++;
               }else{
                   break;
               }
           }
           //compare
           if(count_x!=count_y){
               result = 0;
               break;
           }
       }
       System.out.println(result);
      
   }
}
