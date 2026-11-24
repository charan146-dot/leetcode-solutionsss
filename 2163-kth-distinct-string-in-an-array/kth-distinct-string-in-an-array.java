class Solution {
    public String kthDistinct(String[] arr, int k) {
        
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    c++;
                   
                }
            }
             if(c==1){
                        ans.add(arr[i]);
                    }
        }
        if(ans.size()<k){
            return "";
        }
      return ans.get(k-1);
    }
}