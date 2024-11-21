package Arrays;
import java.util.*;

public class secondsmallnlarge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Arays");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your arrays: ");


        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int large = arr[0];
        int small = arr[0];
        for(int i = 0; i < n; i++){
            if(small > arr[i]){
                arr[i] = small;
            } else if(large < arr[i]){
                arr[0]
            }
        }

    }
    
}
