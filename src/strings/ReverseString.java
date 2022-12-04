package strings;

public class ReverseString {
    public static String stringReverse(String s){
        String rev = " ";
        for (int i = s.length() - 1;i >= 0;i--){
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        String name = "chitra";
        System.out.println("Reverse of the given string is:"+stringReverse(name));
    }
}
