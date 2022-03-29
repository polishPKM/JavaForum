
package javaapplication16;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class JavaApplication16 {

     public static void main(String[] args) throws IOException {
        
        System.out.println("Enter the array size : ");
        boolean check = true;
        int items = 0;
        while(check){
            Scanner inputUser = new Scanner(System.in);
            items = inputUser.nextInt();
            if(items <= 0 ){
                System.out.println("No negative and a zero pls");
            }
            else{
                check = false;
            }
        }
        
        int[] size = new int[items];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the array elements : ");
        
        String[] stringArr = reader.readLine().split(" ");
        for(int i = 0; i < size.length; i++){
            size[i] = Integer.parseInt(stringArr[i]);
        }
        
          System.out.print("The values are: [");
        for(int i = 0; i < size.length; i++){
            if(i != size.length -1){
                System.out.print(size[i]+",");

            }
            else{
                System.out.print(size[i]);
            }
        }
        System.out.print("]");
     }
}