class Solution {

    public boolean isV(char c){
        return c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u';
    }
    public int maxVowels(String s, int k) {
        

        int i=0;
        int r=0;
        int count=0;
        int ans=0;
        while(r<s.length()){
            if(isV(s.charAt(r))){
                count++;

            }
            if(r-i+1==k){
                ans=Math.max(ans,count);
                if(isV(s.charAt(i))){
                    count--;
                    
                }
                i++;

             


            }
            r++;






        }
        return ans;
    }

}