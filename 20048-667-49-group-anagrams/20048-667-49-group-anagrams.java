import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Step 1: Create a HashMap to store sorted strings as keys and original strings as values
        HashMap<String, List<String>> map = new HashMap<>();

        // Step 2: Iterate over each string
        for (String s : strs) {
            char[] charArray = s.toCharArray(); // Convert string to char array
            Arrays.sort(charArray); // Sort the char array
            String sortedString = new String(charArray); // Convert sorted char array back to string

            // Step 3: Store in HashMap
            map.putIfAbsent(sortedString, new ArrayList<>()); // If key doesn't exist, create a new list
            map.get(sortedString).add(s); // Add original string to the corresponding key
        }

        // Step 4: Convert HashMap values to List<List<String>>
        return new ArrayList<>(map.values());
    }
}
