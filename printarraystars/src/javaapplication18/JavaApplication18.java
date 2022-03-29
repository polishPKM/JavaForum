
package javaapplication18;
import java.util.Scanner;

public class JavaApplication18 {


    public static void main(String[] args) {
        System.out.print("Enter the number of items:  ");
        Scanner input = new Scanner(System.in);
        int o = input.nextInt();
        int arr[] = new int[o];
        
        String zvezda = "*";
        System.out.print("Enter value of all item, separated by space: ");
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
            System.out.println( i + ": " + zvezda.repeat(arr[i]) + " (" + arr[i] + ")");
    }
    
}
}
