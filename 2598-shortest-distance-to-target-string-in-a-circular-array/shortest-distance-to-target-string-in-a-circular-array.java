class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
           int  Diff=Math.abs(i-startIndex);
           int Dist=Math.min(Diff,n-Diff);
           min=Math.min(min,Dist);
     }  
        } 
     return min==Integer.MAX_VALUE?-1:min;
    }
}