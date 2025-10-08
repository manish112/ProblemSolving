class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
                PriorityQueue <int []> heap = new PriorityQueue<>((a,b)->(Integer.compare(b[0],a[0])));

        for(int i = 0; i<arr.length;i++){
            
            int distance = Math.abs(x-arr[i]);

          

            

            if(heap.size()>=k){
               if(heap.peek()[0]>distance){
                    heap.poll();
                    heap.offer(new int []{distance,arr[i]});
               }
            }
            else{
                heap.offer(new int []{distance,arr[i]});
            }


        }

        List <Integer> result = new ArrayList();;
        while(!heap.isEmpty()){
            result.add(heap.poll()[1]);
        }
        Collections.sort(result);
        return result;
    }
}