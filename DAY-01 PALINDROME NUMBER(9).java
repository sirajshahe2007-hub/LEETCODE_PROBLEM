class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x != 0 && x % 10 == 0) return false; // Numbers ending in 0 can't be palindromes
        
        int reversedHalf = 0;
        
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }
        
        // Even length: x == reversedHalf
        // Odd length: x == reversedHalf / 10 (middle digit ignored)
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
