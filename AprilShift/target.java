package AprilShift;
import java.util.*;

public class target {

    public static void main(String[] args){
        
        int[] arr = {1,2,4,3,5};
        int target = 7;
        brutforce(arr, target);
    }
    public static void brutforce(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            int cursum = 0;
            for(int j = i; j < arr.length; j++){
                cursum += arr[j];
                if(cursum == target ){
                    for(int k = i; k <= j; k++){
                            System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

}