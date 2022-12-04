package strings;

public class Duplicate {
    public static void printDuplicates(String s){
        char[] word = s.toCharArray();
        int count = 0;
        for( int i = 0; i < word.length; i++){
            for (int j = i+1; j < word.length;j++){
                if (word[i] == word[j]){
                    System.out.print(word[i]+" ");
                    count++;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        printDuplicates("bcgavccaaabd");
    }
}
