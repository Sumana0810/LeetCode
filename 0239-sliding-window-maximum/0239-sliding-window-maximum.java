class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       int n=nums.length;
       int[] result=new int[n-k+1];
       Deque<Integer> deque=new ArrayDeque<>();
       int left=0;
       int right=0;
       int index=0;
       while(right<n){
        while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[right]){
            deque.pollLast();
        }
        deque.addLast(right);
        if(deque.peekFirst()<left){
            deque.pollFirst();
        }
        if(right-left+1==k){
            result[index]=nums[deque.peekFirst()];
            index++;
            left++;
        }
        right++;
       } 
       return result;
    }
}