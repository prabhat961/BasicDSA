package strings;

public class countOccurance {
    public static void occuranceCount(String s){
        for(char ch = 'a'; ch <= 'z'; ch++){
            int count = 0;
            for (int i = 0; i <= s.length() - 1; i++){
                if (s.charAt(i) == ch)
                    count++;
            }
            if (count != 0)
                System.out.println(ch + " "+count);
        }
    }

    public static void main(String[] args) {
        occuranceCount("papa");
    }
}
