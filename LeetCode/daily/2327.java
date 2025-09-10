class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int MOD = 1000000007;
        long[] dp = new long[n + 1]; 
        dp[1] = 1; 
        
        for (int day = 2; day <= n; day++) {
            for (int j = Math.max(1, day - forget + 1); j <= day - delay; j++) {
                dp[day] = (dp[day] + dp[j]) % MOD;
            }
        }
        
        long total = 0;
        for (int i = n - forget + 1; i <= n; i++) {
            if (i >= 1) total = (total + dp[i]) % MOD;
        }
        
        return (int) total;
    }
}


//second solution 
class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        final int MOD = 1_000_000_007;
        long[] newPeople = new long[n + 1]; // newPeople[d] = new[d]
        long[] pref = new long[n + 1];      // pref[k] = sum_{t<=k} new[t]
        
        newPeople[1] = 1;
        pref[1] = 1;

        for (int d = 2; d <= n; d++) {
            int L = d - forget; // exclus dans la formule du prefixe
            int R = d - delay;  // inclus

            long left = (L >= 1) ? pref[L] : 0;     // P[d-forget]
            long right = (R >= 1) ? pref[R] : 0;    // P[d-delay]

            long nd = (right - left) % MOD;
            if (nd < 0) nd += MOD;

            newPeople[d] = nd;
            pref[d] = (pref[d - 1] + nd) % MOD;
        }

        // Réponse = P[n] - P[n - forget]
        long ans = pref[n] - (n - forget >= 1 ? pref[n - forget] : 0);
        ans %= MOD;
        if (ans < 0) ans += MOD;
        return (int) ans;
    }
}

