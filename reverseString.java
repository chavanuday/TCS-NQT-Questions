import java.util.*;

class reverseString{

    public static void RemoveString(String s){
        String str = "";
       

        for(int i = s.length()-1 ; i >= 0; i--){
            char c = s.charAt(i);
            if(!Character.isWhitespace(c)){
                str += c;

            }
        }
        System.out.println("Enter Reversed order " + str);
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = in.nextLine();
        RemoveString(str);
    }
}