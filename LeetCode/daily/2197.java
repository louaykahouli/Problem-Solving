import java.util.*;

class Solution {

    private Long pgcd(Long a, Long b) {
        while (b != 0) {
            Long tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    private boolean nonCoprime(Long a, Long b) {
        return pgcd(a, b) !=1; 
    }

    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Long> result = new ArrayList<>();
        for (int n : nums) result.add((long) n);

        int i = 0;
        while (i < result.size() - 1) {
            if (nonCoprime(result.get(i), result.get(i + 1))) {
                Long a = result.get(i);
                Long b = result.get(i + 1);
                Long lcm = a * b / pgcd(a, b);
                result.set(i, lcm);      
                result.remove(i + 1);
                if(i>0){
                    i--;
                }    

            } else {
                i++; 
            }
        }

        List<Integer> finalResult = new ArrayList<>();
        for (long x : result) finalResult.add((int)x);
        return finalResult;
    }
}
