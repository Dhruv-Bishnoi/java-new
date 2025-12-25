package function;
//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class greater {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            
            System.out.println("enter first number:");
            int a = sc.nextInt();
            System.out.println("enter second number:");
            int b = sc.nextInt();

            if (a<b) {
                System.out.println(b+"is greater then "+a);
                
            }else{
                System.out.println(a+"is greater then "+b);
            }
    }

    
}
