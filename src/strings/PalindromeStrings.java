package strings;

public class PalindromeStrings {
    public static boolean chkPalindrom(String str){
        char[] arr = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
            if(arr[left] != arr[right]){
                return false;
        }
            left++;
            right--;
            return true;
    }

    public static void main(String[] args) {
        String str = "malayalam";
        System.out.println("The given String is Palindrom:"+chkPalindrom(str));
    }
}
