class Solution {
    public String removeStars(String s) {
        Stack<Character> p=new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='*'){
                p.pop();
            }
            else{
                p.push(c);
            }


        }

        StringBuilder ans=new StringBuilder();
        while(!p.isEmpty()){
            ans.append(p.pop());

        }
        return ans.reverse().toString();
        
    }
}