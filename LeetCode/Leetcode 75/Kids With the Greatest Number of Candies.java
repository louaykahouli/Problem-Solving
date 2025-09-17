class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> result=new ArrayList<>();
        for(int candie:candies){
            if ( candie+ extraCandies >= max) result.add(true);
            
            else result.add(false);
        }
        return result;
    }
}