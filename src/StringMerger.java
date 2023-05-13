public class StringMerger {
    public static void main(String[] args) {
        String word1  = "ab";
        String word2 =   "pqrs";
        String merger = stringMerger(word1, word2);
        System.out.println(merger);
    }

    public static String stringMerger(String word1, String word2){
        StringBuilder merged = new StringBuilder();
        int i = 0;
        int j = 0;
        while(i < word1.length() || j < word2.length()){
           if(i < word1.length()){
               merged.append(word1.charAt(i));
               i++;
           }
           if (j < word2.length()){
               merged.append(word2.charAt(j));
               j++;
           }
        }
        return merged.toString();
    }
}


//Input: word1 = "ab", word2 = "pqrs"
//        Output: "apbqrs"
//        Explanation: Notice that as word2 is longer, "rs" is appended to the end.
//        word1:  a   b
//        word2:    p   q   r   s
//        merged: a p b q   r   s