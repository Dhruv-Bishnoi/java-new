public class ReverseString{
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder("dhruv") ;
    
        
        int n = str.length();
        for( int i = 0 ; i<n/2;i++){
            int last = n-1-i;

            char temp = str.charAt(last);
            str.setCharAt(last, str.charAt(i));
            str.setCharAt(i, temp);

         }
         System.out.println(str);
    }
    
}
