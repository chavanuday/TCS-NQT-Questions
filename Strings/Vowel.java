package Strings;
import java.util.*;

class Vowel {

    public static void findVowels(String s){

    String vowelName = "";
    String noVowel = "";

    for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        if( c == 'a' || c == 'e' ||  c == 'i' ||  c == 'o' ||  c == 'u' ){
            vowelName += c;
        } else {
            noVowel += c;
        }
    }

    System.out.println("vowel in string " + noVowel);

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
           System.out.println("Enter a Vowel input ");
            String result = input.nextLine();
            findVowels(result);
        }
    }