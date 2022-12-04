package strings;

import java.util.Arrays;

public class stringAnagram {
    public static boolean isAnagram(String str1, String str2){
        char[] word1 = str1.toCharArray();
        char[] word2 = str2.toCharArray();
        int m = word1.length;
        int n = word2.length;
        if (m != n)
            return false;
        Arrays.sort(word1);
        Arrays.sort(word2);

        for (int i = 0; i < m; i++){
            if (word1[i] != word2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if (isAnagram(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }
}
