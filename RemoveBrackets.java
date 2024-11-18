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


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = in.nextLine();
        newFunc(str);
    }
    
}