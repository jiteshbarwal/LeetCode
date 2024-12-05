class Solution {
    public boolean backspaceCompare(String s, String t) {
         StringBuilder snew = new StringBuilder();
        StringBuilder tnew = new StringBuilder();
        
       for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (snew.length() > 0) {
                    snew.deleteCharAt(snew.length() - 1); 
                }
            } else {
                snew.append(s.charAt(i));
            }
        }
        
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (tnew.length() > 0) {
                    tnew.deleteCharAt(tnew.length() - 1);
                }
            } else {
                tnew.append(t.charAt(i));
            }
        }
        
        return snew.toString().equals(tnew.toString());
        
    }
}