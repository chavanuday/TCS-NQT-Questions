package Arrays;
import java.util.*;

 class largestelemet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");

        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter arrays");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] < arr[0]){
                arr[0] = arr[i];
            }
        }
        System.out.println("This is final array: " + max);
        
    }
    
}
