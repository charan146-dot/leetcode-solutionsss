class Solution {
    public String customSortString(String order, String s) {
    char f[]=new char[26];
    StringBuilder ans=new StringBuilder();

    for(char c:s.toCharArray()){
            f[c-'a']++;

    }

    for(char a:order.toCharArray()){
        while(f[a-'a']>0){
            ans.append(a);
            f[a-'a']--;

        }

    }
    for(int i=0;i<26;i++){
        while(f[i]>0){
            ans.append((char)(i+'a'));
            f[i]--;
        }
    }



     return ans.toString();   
    }
}