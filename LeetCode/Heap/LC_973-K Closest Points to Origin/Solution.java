class Solution {
    public int[][] kClosest(int[][] points, int k) {
         PriorityQueue<int[]> heap = new PriorityQueue<>((a,b)->(Integer.compare(dist(b),dist(a))));
       

       for(int [] point: points){
        heap.offer(point);
        if(heap.size()>k){
            heap.poll();
        }
       }

      int [][] p = new int[heap.size()][2];
      int counter =0;
       while(!heap.isEmpty()){
        p[counter++]=heap.poll();
       }



        return p;
    }

    int dist(int [] p){
        return p[0]*p[0] + p[1]*p[1];
    }
}