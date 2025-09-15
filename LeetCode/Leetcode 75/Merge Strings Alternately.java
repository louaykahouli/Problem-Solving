class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result=new StringBuilder();
        int i =0,j=0;
        while(i<word1.length()&& j <word2.length()){
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));

        }
        if(j==word2.length()){
            String copie = word1.substring(i);
            result.append(copie);
        }
        if(i==word1.length()){
            String copie = word2.substring(j);
            result.append(copie);

        }
        return result.toString();
        }
}
