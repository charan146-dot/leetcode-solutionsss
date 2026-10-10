lass Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> s=new Stack<>();

       for(String i:operations){
        if(i.equals("C")){
            s.pop();
            
        }
        else if(i.equals("D")){
            s.push(2*(s.peek()));
        }
        else if(i.equals("+")){
          int curr=s.pop();
          int prev=s.peek();
          s.push(curr);
          s.push(curr+prev);

        }
        else{
            s.push(Integer.parseInt(i));
        }
       }
       int sum=0;

       while(!s.isEmpty()){
        sum+=s.pop();
               }

        

      return sum;  
        
    }
}
