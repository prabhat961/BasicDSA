package basicProgram;

public class NearestPalindrome {

    public static boolean isPalindrome( String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void closestPalindrome(int num){
        int RPNum = num - 1;
        while (isPalindrome(Integer.toString(RPNum)) == false) {
            RPNum--;
        }
        int SPNum = num + 1;
        while (isPalindrome(Integer.toString(SPNum)) == false) {
            SPNum++;
        }
        if (Math.abs(num - SPNum) < Math.abs(num - RPNum)) {
            System.out.println(SPNum);
        }
        else
            System.out.println(RPNum);
    }

    public static void main(String[] args) {
        int n = 123;
        closestPalindrome(n);
    }
}
