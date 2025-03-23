package dsa;
public class array{
    public static void main(String []args){
        int [] marks = new int[4];
        //int marks[] = new int[4]; we can use like that in the array
        marks[0] = 97; //phy
        marks[1] = 98; //math
        marks[2]= 85; //sst
        marks[3]= 75; //gk

//        System.out.println(marks[0]);
//        System.out.println(marks[3]);

//        we can print the value using loop
        for (int i =0; i<3; i++){
            System.out.println(marks[i]);
        }
    }
}