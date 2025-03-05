//Cantor's Diagonalization Argument, a famous mathematical proof used in set theory and logic.
//The diagonalization technique guarantees that the newly generated binary string will always be
//different from every string in the input list.


class Solution {

    public String findDifferentBinaryString(String[] nums) {
      
        StringBuilder result = new StringBuilder();
        
       
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].charAt(i) == '0') {
                result.append('1');
            } else {
                result.append('0');
            }
        }
        
        return result.toString();
    }
}
