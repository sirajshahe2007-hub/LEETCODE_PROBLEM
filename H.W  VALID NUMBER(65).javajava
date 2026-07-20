class Solution {
    public boolean isNumber(String s) {
        // Trim whitespace if the problem constraints require it
        s = s.trim();
        
        boolean seenDigit = false;
        boolean seenDot = false;
        boolean seenExponent = false;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isDigit(c)) {
                seenDigit = true;
                
            } else if (c == '.') {
                // A dot is invalid if we've already seen a dot or an exponent (e/E)
                if (seenDot || seenExponent) {
                    return false;
                }
                seenDot = true;
                
            } else if (c == 'e' || c == 'E') {
                // An exponent is invalid if we've already seen one, or if no digit preceded it
                if (seenExponent || !seenDigit) {
                    return false;
                }
                seenExponent = true;
                seenDigit = false; // Reset to ensure a digit follows the exponent (e.g., "1e" is invalid)
                
            } else if (c == '+' || c == '-') {
                // A sign is only valid at the very beginning or immediately following an exponent 'e/E'
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
                
            } else {
                // Any other character (letters, symbols, etc.) makes it invalid
                return false;
            }
        }
        
        // The string is valid only if we successfully ended with a digit
        return seenDigit;
    }
}
