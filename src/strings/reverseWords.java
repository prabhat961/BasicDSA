package strings;

public class reverseWords {
    public static void WordRevrese(String str) {
        String rev = "";
        String[] split = str.split("");
        for( int i = str.length() - 1; i >= 0; i--) {
            rev = rev + split[i];
        }
        System.out.println(rev.trim());
    }

    public static void main(String[] args) {
        String str = "My Name is Prabhat";
        WordRevrese(str);
    }
}
