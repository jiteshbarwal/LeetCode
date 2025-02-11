class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sd = new StringBuilder(s);

        while (sd.indexOf(part) != -1) { 
            int index = sd.indexOf(part);
            sd.delete(index, index + part.length()); 
        }

        return sd.toString();
    }
}
