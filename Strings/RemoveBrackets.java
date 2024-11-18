package Strings;
import java.util.*;

class RemoveBrackets {

    public static void newFunc(String s){
        String str = "";
        for(int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            if(c == '(' || c == ')'){
                continue;

            }else{
                str += c;

            }
        }
        System.out.println("This is without expression: " + str);
    }


    // WITH USING STRINGBUILDER

    // public static void newFunc(String s){
    //     StringBuilder res = new StringBuilder();
    //     for(int i = 0; i < s.length(); i ++){
    //         char c = s.charAt(i);
    //         if(c == '(' || c == ')'){
    //             continue;

    //         }else{
    //             res.append(c);

    //         }
    //     }
    //     System.out.println("This is without expression: " + res);
    // }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = in.nextLine();
        newFunc(str);
    }
    
}