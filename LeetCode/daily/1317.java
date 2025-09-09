//easy
class Solution {
    public boolean NoZeroIntegers(int a ){
        while (a/10>0){
            if (a%10==0){
                return false;
            }
            else a/=10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int a =1;
        while (a<n){
            int b = n-a;
            if (!NoZeroIntegers(a) || !NoZeroIntegers(b)){
                a+=1;
            }
            else return new int[]{a,b};
        }
        return null;
    }
}