package ApriShift2;
import java.util.*;

class TotalItem {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

      int max = 0;
      String maxCostItem = "";
      double totalprice = 0;
      double avg = 0;

      for(int i = 0; i < n; i++){
          String item = sc.next();
        int price = sc.nextInt();
        int quantity = sc.nextInt();

        totalprice += price * quantity;

        if(totalprice > max){
            maxCostItem = item;
        }
        avg = totalprice / (i + 1);

      }
        System.out.printf(maxCostItem, totalprice, avg);

    }
}
