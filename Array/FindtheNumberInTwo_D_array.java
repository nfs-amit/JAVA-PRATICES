package dsa;

import java.util.Scanner;

public class FindtheNumberInTwo_D_array {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][]numbers = new int[rows][cols];

        //input
        //rows
        for (int i = 0; i<rows; i++){
            //cols
            for (int j = 0; j<cols; j++){
                numbers[i][j] =sc.nextInt();
            }
        }
        int x = sc.nextInt();

        for (int i =0; i<rows; i++){
            for(int j =0; j<cols; j++){
                //compare with x
                if (numbers[i][j] == x){
                    System.out.println("X found at location(" + i +", "+ j +")");
                }

            }
        }
    }
}

/*
output
        3  ->rows
        4  ->cols
        1 2 3 4
        2 5 11 66
        3 5 6 0
        66
        X found at location(1, 3)

 */