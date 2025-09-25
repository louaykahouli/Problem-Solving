class Solution {
    private boolean contains(int[] t ,int n){
        for(int i=0;i<t.length;i++){
            if(t[i]==n) return true;
        }
        return false;
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> diff1=new ArrayList<>();
        List<Integer> diff2=new ArrayList<>();
        for (int i =0;i<nums1.length;i++){
            if(!contains(nums2,nums1[i])&& diff1.indexOf(nums1[i])==-1) diff1.add(nums1[i]);
        }
        for (int i =0;i<nums2.length;i++){
            if(!contains(nums1,nums2[i])&& diff2.indexOf(nums2[i])==-1) diff2.add(nums2[i]);
        }
        List<List<Integer>> results= new ArrayList<>();
        results.add(diff1);
        results.add(diff2);
        return results;

    }
}