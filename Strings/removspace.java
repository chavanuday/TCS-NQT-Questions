package Strings;
import java.util.*;

class removespace{

    public static void SpaceFunc(String s){
        // String space = "";
        int noSpace = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isWhitespace(c)){
                // noSpace += c;
                noSpace++;
                
            }
        }

        System.out.println("This is space: " + noSpace);

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string with space: ");
        String result = input.nextLine();
        SpaceFunc(result);

    }
}