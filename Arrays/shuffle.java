class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ansy=new char[s.length()];

        for(int i=0;i<s.length();i++){

            ansy[indices[i]]=s.charAt(i);
        }
        return new String (ansy);
        
    }
}
