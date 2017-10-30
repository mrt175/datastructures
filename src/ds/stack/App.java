package ds.stack;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String word = null;

        System.out.print("Enter word: ");
        word = s.nextLine();
        System.out.println("The word is now: " + reverseString(word));

    }

    public static String reverseString(String st){
        Stack theStack = new Stack(st);

        char[] charArray = new char[st.length()];

        for(int i = 0; i < st.length(); i++){
            theStack.push(st.charAt(i));
        }

        for(int i = 0; i < charArray.length; i++){
            charArray[i] = theStack.pop();
        }

        st = String.copyValueOf(charArray);

        return st;
    }
}
