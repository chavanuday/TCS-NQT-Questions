package Strings;
import java.util.*;

class sumNumber {

    public static void newFunc(String s){
     
        String res = "";
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                res += c;
            }else if(!res.isEmpty()){
                count += Integer.parseInt(res);
                res = "";
            }
        }


        if(!res.isEmpty()){
            count += Integer.parseInt(res);
        }
        System.out.println("Enter: " + count);

    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String and a Digit: ");
        String str = in.nextLine();
        newFunc(str);
    }
}
