class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        for(int i=0;i<s.length();i++){
            ArrayList<Character> L = new ArrayList<>();
            for(int j=i;j<s.length();j++){
                 char c = s.charAt(j);
                if(!L.contains(c)) L.add(c);
                else{
                    break;
                }
            }
             maxLen = Math.max(maxLen, L.size());
            
        }
        return maxLen;
    }
}