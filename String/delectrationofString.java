package String;

import java.util.Scanner;

public class delectrationofString {
    public static void main(String[]args){
        //using of scanner class
//        Scanner sc= new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("your name is:" +name);

        String firstname ="Amit";
        String lastname = "kumar";
        String fullname= firstname + " " + lastname;
        //charAt
        for (int i=0; i<fullname.length();i++){
            System.out.print(fullname.charAt(i));

        }
    }
}
