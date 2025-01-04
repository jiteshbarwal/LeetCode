import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        Set<String> palindromes = new HashSet<>();
        
        
        for (char c = 'a'; c <= 'z'; c++) {
            int first = -1, last = -1;
            
            
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == c) {
                    if (first == -1) {
                        first = i;
                    }
                    last = i;
                }
            }
            
        
            if (first != -1 && last != -1 && first < last) {
              
                Set<Character> middleCharacters = new HashSet<>();
                for (int i = first + 1; i < last; i++) {
                    middleCharacters.add(s.charAt(i));
                }
                
                for (char mid : middleCharacters) {
                    palindromes.add("" + c + mid + c);
                }
            }
        }
        
        return palindromes.size();
    }
}
