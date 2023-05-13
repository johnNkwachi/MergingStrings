public class Solution {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        String mergeStrings = mergeString(word1, word2);

        System.out.print(mergeStrings);

    }


    public static String mergeString(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i < word1.length() && j < word2.length()) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(j));
            i++;
            j++;
        }

        merged.append(word1.substring(i));
        merged.append(word2.substring(j));

        return merged.toString();

    }
}
