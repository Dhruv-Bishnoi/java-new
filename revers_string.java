public class revers_string {
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder("HELLO") ;
        
        int n = str.length();
        int m = n-1;
         for( int i = 0 ; i<=n/2;i++){


            Character temp = str.charAt(m);
            str.setCharAt(m, str.charAt(i));
            str.setCharAt(i, temp);


            m--;

         }
         System.out.println(str);
    }
    
}
