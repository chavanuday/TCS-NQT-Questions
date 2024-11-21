package ApriShift2;
import java.util.*;

class cubesum {

    public static void func(int start, int end){
        int count = 0;

        for(int i = start; i <= end; i++){
            int sum = (int) Math.pow(i , 3);
            count += sum;

        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        func(start , end);        
    }
    
}
