package function;

import java.util.Scanner;

public class searchx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userin = sc.nextInt();

        int arr[] = new int[userin];


        //make arry
        for(int i = 0 ; i<userin;i++){
            arr[i]=sc.nextInt();


        }

        //find X
        int x = 10;
        int found = 0;
        for(int i = 0 ; i<userin;i++){
            if (arr[i]==x){
                System.out.println("found element"+ x);
                found = 1;
                
            }
            
        } if (found==0){
            System.out.println("element not found");
        }



    }
}
