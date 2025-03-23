package dsa;

import java.util.Scanner;

public class secondWaytoDeclareArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int  []number = new int[size];

        //using the for loop to take input
        for (int i = 0; i<size; i++){
            number[i] = sc.nextInt();
        }
        //using the for loop to print the output
        for (int i=0; i<size ;i++){
            System.out.println(number[i]);
        }
    }
}


/*
in this code when the compiler run we give the size first than we give the value like1,2,3
than the compiler print the same value
3
1
2
3
--
1
2
3

 */