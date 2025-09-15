
class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> words = new HashSet<>(Arrays.asList(wordlist));
        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];
              String match = "";
            if (words.contains(q)) {
                match = q;
                
            }
          else{
            for (String w : wordlist) {
                if (w.equalsIgnoreCase(q)) {
                    match = w;
                    break;
                }
            }}
            result[i] = match;
        }
        return result;
    }
}
