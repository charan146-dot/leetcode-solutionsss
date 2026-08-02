class Solution {
    public int divisorSubstrings(int num, int k) {

        int l=0;
        int r=0;
        int county=0;
        String s=String.valueOf(num);
            StringBuilder ans=new StringBuilder();
        while(r<s.length()){
            

            ans.append(s.charAt(r));

            if(r-l+1==k){
                int val=Integer.parseInt(ans.toString());
                if(val!=0 && num%val==0){
                county++;
                    

                }
                ans.deleteCharAt(0);
                l++;


            }
        r++;
        





        }
        return county;
        
    }
}
