class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int p=0;
        for( String i:words){
            boolean validity=true;
            for(char c:i.toCharArray()){
                if(allowed.indexOf(c)==-1){
                    validity =false;
                    break;
                }
            }
            if(validity){
                p++;
            }

        }

        return p;
        
    }
}
