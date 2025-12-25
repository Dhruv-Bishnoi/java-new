package function;

import java.util.Scanner;

//Write a function that takes in the radius as input and returns the circumference of a circle.
public class curcumsfance {        

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter radius of circle:");
        double radius = sc.nextDouble();

        double curcumsfance_ans = 2*(3.14)*radius;

        System.out.println(curcumsfance_ans);

        sc.close();
        
    }
    
}
