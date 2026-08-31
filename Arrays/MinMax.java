class Solution {
    public int minimumDeletions(int[] nums) {
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       int minin=-1;
       int maxin=-1;

       for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            max=nums[i];
            maxin=i+1;
        }
       }

      for(int i=0;i<nums.length;i++){
        if(nums[i]<min){
            min=nums[i];
            minin=i+1;
        }
       }
       int ans=Integer.MAX_VALUE;
       int pans=Math.max(minin,maxin);
        int sans=Math.max(nums.length-maxin+1,nums.length-minin+1);
        if(pans<sans){
            ans=pans;
        }
        else{
            ans=sans;
        }
          
       if(!(minin<nums.length-minin+1)){
          minin=nums.length-minin+1;

                 }
       if(!(maxin<nums.length-maxin+1)){
          maxin=nums.length-maxin+1;
          
                 }


     return Math.min(ans,minin+maxin);   
    }
}
