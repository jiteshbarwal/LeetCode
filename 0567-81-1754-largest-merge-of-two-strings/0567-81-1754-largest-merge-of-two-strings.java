class Solution {
    public String largestMerge(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int a=0;
        int b=0;

        while (a < word1.length() && b < word2.length()){

            if (word1.charAt(a)>word2.charAt(b)){
               sb.append(word1.charAt(a));
               a++;
            }

           else if (word1.charAt(a)<word2.charAt(b)){
               sb.append(word2.charAt(b));
               b++;
            }
            else {
                if (word1.substring(a).compareTo(word2.substring(b)) > 0) {
                    sb.append(word1.charAt(a));
                    a++;
                } else {
                    sb.append(word2.charAt(b));
                    b++;
                }
            }
        }

        while (a < word1.length()) {
            sb.append(word1.charAt(a));
            a++;
        }

        // Append the remaining characters from word2 (if any)
        while (b < word2.length()) {
            sb.append(word2.charAt(b));
            b++;
        }

        return sb.toString();
    }
}