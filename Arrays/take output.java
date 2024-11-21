package Arrays;
import java.util.*;

 class largestnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("ENter arrayys: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int num: arr){
            System.out.println(num + "");
        }
        sc.close();
    }
}
