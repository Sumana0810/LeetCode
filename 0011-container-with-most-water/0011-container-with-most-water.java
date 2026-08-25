class Solution {
    public int maxArea(int[] height) {
       int maxWater=0;
       int lp=0, rp=height.length-1;
       while(lp<rp){
        int width=rp-lp;
        int ht=Math.min(height[lp],height[rp]);
        int currentWater=width*ht;
        maxWater=Math.max(maxWater,currentWater);
        if(height[lp]<height[rp]){
            lp++;
        }else{
            rp--;
        }
       } 
       return maxWater;
    }
}