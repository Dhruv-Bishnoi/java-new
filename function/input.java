package function;
//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        int nagitive = 0 ;
        int zero = 0;
        int positive = 0 ;
        System.out.println("do you want to continue if yes enter 1 if no enter 0 ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        
        while(input==1){
            System.out.println("enter a number");
            int num = sc.nextInt();
                if(num>0){
                    nagitive++;

                }
                if(num==0){
                    zero++;
                }
                else{
                    positive++;
                }


            
        System.out.println(nagitive);
        System.out.println(positive);
        System.out.println(zero);
        
        System.out.println("do you want to continue if yes enter 1 if no enter 0 ");

         input = sc.nextInt();

        }
        // else{
        //     System.out.println("program terminated");
        // }

        
    }
}
