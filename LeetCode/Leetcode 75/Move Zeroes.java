class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer>result=new ArrayList<>();
        for (int k=0;k<nums.length;k++){
            result.add(nums[k]);
        }
        int nbE=0;
        int i =0;
        while (nbE<nums.length){
            if(result.get(i)==0){
                result.remove(i);
                                                result.add(0);

                nbE++;
            }
            else{nbE++;
            i++;
            }
        }
        for (int j=0;j<nums.length;j++){
            nums[j]=result.get(j);
        }
    }
}