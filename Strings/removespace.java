package Strings;
import java.util.*;

class removespace{


    public static void RemoveS(String s){
        String myStr = "";

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isWhitespace(c)){
                
            } else {
                myStr += c;
            }
        }
        System.out.println("No space " + myStr);
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to remove spaces: ");
        String Str = input.nextLine();
        RemoveS(Str);
    }
}