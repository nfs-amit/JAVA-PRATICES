package dsa;

import java.util.Scanner;

public class TwoD_Array {
    public  static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[] [] numbers = new int[rows][cols];

        //print the input rows by taking through the user
        for (int i = 0; i<rows; i++){

            //for print the output colms
            for (int j =0 ; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

            //for the data which is print for the user
            for(int i=0; i<rows; i++){
                for (int j=0; j<cols; j++){
                    System.out.print(numbers[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

