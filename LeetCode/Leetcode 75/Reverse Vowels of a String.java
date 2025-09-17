class Solution {
    private boolean est_voyelle(char c){
        String voyelle ="aeuioAEUIO";
        return voyelle.indexOf(c)>-1;
    }
    public String reverseVowels(String s) {
        int right=0,left=s.length()-1;
        StringBuffer result = new StringBuffer(s);
        while (left>right){
            if(!est_voyelle(s.charAt(left))) left--;
            if(!est_voyelle(s.charAt(right))) right++;
            if( est_voyelle(s.charAt(left)) && est_voyelle(s.charAt(right))){
                result.setCharAt(right,s.charAt(left));
                result.setCharAt(left,s.charAt(right));

                left --;
                right ++;
            }
        }
        return result.toString();
    }
}