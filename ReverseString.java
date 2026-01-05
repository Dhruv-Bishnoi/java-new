public class ReverseString {
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder("dhruv") ;
    
        
        int n = str.length();
        for( int i = 0 ; i<n/2;i++){
            
            int front = i;
            int back = n-1-i;

            char charfront = str.charAt(front);
            char charlast = str.charAt(back);
            str.setCharAt(back, charfront);
            str.setCharAt(front, charlast);
        

         }
         System.out.println(str);
    }
    
}
