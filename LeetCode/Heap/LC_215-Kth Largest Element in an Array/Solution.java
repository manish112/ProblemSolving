class Solution {
    public int findKthLargest(int[] nums, int k) {
              PriorityQueue <Integer> heap = new PriorityQueue<>();

       if(nums.length==0){
        return -1;
       }

       for (int i=0;i<nums.length;i++){

        if(i<k){
            heap.offer(nums[i]);
        }else{
            if(heap.peek()<nums[i]){
                heap.poll();
                heap.offer(nums[i]);
            }
        }

       }

       return heap.peek();
    }
}