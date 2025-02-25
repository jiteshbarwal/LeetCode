class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 1; i < sb.length() - 1; i++) {  
        if (sb.charAt(i) == sb.charAt(i - 1) && sb.charAt(i) == sb.charAt(i + 1)) {
            sb.deleteCharAt(i); 
            i--; 
        }
    }
    
    return sb.toString();
    }
}