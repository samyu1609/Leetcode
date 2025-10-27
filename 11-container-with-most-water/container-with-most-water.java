class Solution {
    public int maxArea(int[] h) {
        int n=h.length;
        int ans=Integer.MIN_VALUE;
        int left=0;
        int right=n-1;
        while(left<right){
            int curr= Math.min(h[left],h[right]) *(right-left);

            ans=Math.max(curr,ans);

            if(h[left]<h[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
}