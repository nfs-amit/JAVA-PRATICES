package dsa;

import java.util.Scanner;

public class Problem_4 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] numbers = new int[size];
        
        //input
        for (int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        
        boolean isAscending = true;
        boolean isDescending = true;
        
        for (int i = 0; i< numbers.length-1; i++){     // NOTICE numbers.length - 1 as termination condition
            if (numbers[i] > numbers[i+1]){           // This is the condition for descending order
              isAscending = false;
            }
            if (numbers[i] < numbers[i + 1]) {       // Condition for ascending order
                isDescending = false;
            }
        }
        if (isAscending){
            System.out.println("The array is sorted in ascending order");
        } else if (isDescending) {
            System.out.println("The array is sorted in descending order");

        } else {
            System.out.println("The array is not sorted in ascending order");
        }
    }
}
