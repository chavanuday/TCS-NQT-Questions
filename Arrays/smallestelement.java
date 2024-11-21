package Arrays;
import java.util.*;


class smallestelement {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nmber; ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Smallest no is; " + sort(arr));

    }

    static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[0];
    }
}   