package Strings;
import java.util.*;

class charNotAlpha{

    public static void RemoveCharNotAlphabet(String s){
        String cr = "";

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isAlphabetic(c)){
                cr += c;
            }else{

            }
        }
        System.out.println("Removed unecessary character :" + cr);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String, for Alphabets: ");
        String result = in.nextLine();
        RemoveCharNotAlphabet(result);
    }

}