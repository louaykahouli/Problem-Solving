class Solution {
    public int compress(char[] chars) {
        List<Character> liste = new ArrayList<>();
        for (char c : chars) liste.add(c);

        int i = 0;
        while (i < liste.size()) {
            char current = liste.get(i);
            int count = 1;
            int j = i + 1;

            while (j < liste.size() && liste.get(j) == current) {
                count++;
                liste.remove(j);
            }

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    liste.add(i + 1, c);
                    i++;
                }
            }

            i++;
        }

        for (int k = 0; k < liste.size(); k++) {
            chars[k] = liste.get(k);
        }

        return liste.size();
    }
}
