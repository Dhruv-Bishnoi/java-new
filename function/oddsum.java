package function;
//Write a function to print the sum of all odd numbers from 1 to n.
public class oddsum {

    // public static sumodd(){}
    public static void main(String[] args) {
        int n = 30;
        int sum = 0;
        for(int i = 1 ; i<=n;i++ ){
            if (i%2!=0) {
                sum = sum+i;    
            }
        }
        System.out.println(sum);
        
    }
    
}
