class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int[] ans={-1,-1};
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i:nums){
            hp.put(i,hp.getOrDefault(i,0)+1);
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(hp.get(nums[i])!=hp.get(nums[j])){
                    ans[0]=nums[i];
                    ans[1]=nums[j];
                     return ans;
                }
            }
        }
        return ans;
        
    }
}