class Solution {
    public int countAsterisks(String s) {
        int as=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                as++;
            }

            else if(s.charAt(i)=='|'){
                i++;
                while(s.charAt(i)!='|'){
                    i++;
                }
            }
        }
        
        return as;
    }
}