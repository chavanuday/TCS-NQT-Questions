import java.util.*;

class Main{
    
    public static String NoVowel(String s){
        String Vowel = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if( c != 'a' &&  c != 'e' &&  c != 'i' &&  c != 'o' &&  c != 'u' ){
                Vowel += c;
            }
        }
        return Vowel;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string :");
        String Nv = input.nextLine();
        System.out.println(NoVowel(Nv));       
    }
}