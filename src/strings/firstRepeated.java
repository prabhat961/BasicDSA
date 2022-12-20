package strings;

import java.util.HashSet;

public class firstRepeated {
    public static void repeatedFirst(String str){
        char[] input = str.toCharArray();
        HashSet<Character>h = new HashSet<>();
        for (int i = 0; i < input.length; i++){
            char c = input[i];
            if (h.contains(c))
                System.out.println("First repeating character is:"+c);
            else
                h.add(c);
        }
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";;
        repeatedFirst(str);
    }
}
