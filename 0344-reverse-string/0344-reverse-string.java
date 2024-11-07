class Solution {
    public void reverseString(char[] array) {
       StringBuilder sb = new StringBuilder(new String(array));
       sb.reverse();
       char[] reversedArray = sb.toString().toCharArray();
       for (int i = 0; i < array.length; i++) {
            array[i] = reversedArray[i];
        }
}
    }