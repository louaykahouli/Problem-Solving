
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1;
        int nbZero=0;
        for (int i =0;i<nums.length;i++){
            if (nums[i]!=0) p*=nums[i];
            else nbZero++;
        }
        int []result=new int[nums.length];
        for (int i =0 ;i<nums.length;i++){
            if(nbZero==1 && nums[i]==0) result[i]=p;
            else if(nbZero==1 && nums[i]!=0) result[i]=0;
            else if(nbZero>1) result[i]=0;
            else result[i]=p/nums[i];
        }   
        return result;
    }
}