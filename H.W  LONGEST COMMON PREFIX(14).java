class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Edge case: if the array is empty, there is no common prefix
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Start by assuming the entire first string is the common prefix
        String prefix = strs[0];
        
        // Compare the prefix with every other string in the array
        for (int i = 1; i < strs.length; i++) {
            // Shorten the prefix until it matches the beginning of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes empty, there's no common prefix at all
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}
