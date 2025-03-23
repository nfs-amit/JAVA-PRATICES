package dsa;
import java.util.Arrays;
public class SecondLargestElement {
    public static int getLargestNumber(int[]arr){
       int n = arr.length;
       Arrays.sort(arr);

               for(int i =n-2; i>=0; i--){
                   if (arr[i]!=arr[n-1]){
                       return arr[i];
                   }
               }
               return -1;
    }
    public static void main(String [] args){
        int[]arr = {35,40,55,20,12,58};
        System.out.println("The second largest number is: " +getLargestNumber(arr));
    }
}
