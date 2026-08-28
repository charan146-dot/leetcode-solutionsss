Code
Java
class Solution {
    public int smallestEvenMultiple(int n) {
       
     
       return rec(n,1);
    }
    int rec(int n,int i){
           if((n*i)%2==0){
               return n*i;
           }
           return rec(n,i+1);
          
       }
}
