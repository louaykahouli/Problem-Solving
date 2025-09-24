class Solution {
    
    public double findMaxAverage(int[] nums, int k) {
        
         if(nums.length==1) return (double) nums[0]/k;
        int max=Integer.MIN_VALUE;
        for (int j=0;j<=nums.length-k;j++){
        int sum=0;
        int i=j;
        while(i<j+k){
            sum+=nums[i];
            i++;
        }
        if(max<sum) max=sum;
        }
        return (double) max/k;
    }
}