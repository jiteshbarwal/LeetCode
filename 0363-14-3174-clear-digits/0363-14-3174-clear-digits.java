class Solution {
    public String clearDigits(String s) {
        StringBuilder sd = new StringBuilder(s);

        for (int i = 0; i < sd.length(); i++) {
            if (Character.isDigit(sd.charAt(i))) { 
                sd.deleteCharAt(i); 
                
                if (i > 0) { 
                    sd.deleteCharAt(i - 1);
                    i--;
                }
                i--; 
            }
        }

        return sd.toString();
    }
}
