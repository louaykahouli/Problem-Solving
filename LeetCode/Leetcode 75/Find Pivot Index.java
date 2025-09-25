class Solution {
    public int pivotIndex(int[] nums) {
        int rightSum=0;
        int leftSum=0;
        int totalSum=0;
        for(int i =0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        leftSum=totalSum;
        for(int i =0;i<nums.length;i++){
            if(i>0) rightSum+=nums[i-1];
            leftSum-=nums[i];
            if(rightSum==leftSum) return i;

        }
        return -1;
    }
    }
