

import java.util.*;

public class Hii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        System.out.println(mergeAlternately(word1, word2));
        scanner.close();
    }

    public static String mergeAlternately(String word1, String word2) {
        // Write your code here...
        StringBuilder sb = new StringBuilder();
        int j=0;
        for(int i=0; i<word1.length(); i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();
    }
}