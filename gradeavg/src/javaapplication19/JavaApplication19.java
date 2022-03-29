
package javaapplication19;

import  java.util.Scanner;

public class JavaApplication19 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int numStudents = input.nextInt();
        int []grades = new int[numStudents];
        for (int i = 0; i<grades.length; i++){
            System.out.printf("Enter the grade for student %d: ", i+1);
            int number = input.nextInt();
            while ((number>100) || (number < 0)){
                System.out.println("Error, please input a number between 0 - 100");
                System.out.printf("Enter the grade for student %d: ", i+1);
                number = input.nextInt();
            }
            grades[i] = number;
        }
        double sum = 0;
        for (int i = 0 ; i < numStudents; i++){
            sum += grades[i];
        }
        double average = (sum/numStudents);
        System.out.println("The average is: " + average);
        int min = grades[0];
        int max = grades[0];
        for (int i = 0; i < grades.length; i++){
            if (grades[i] < min) {
                min = grades[i];
            }
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }
}
  
