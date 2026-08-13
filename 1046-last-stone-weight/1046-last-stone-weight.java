class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> {
               return Integer.compare(b, a);
            });
        

        for (int i = 0; i < stones.length; i++){
            heap.offer(stones[i]);
        }

        while (heap.size() >= 2){

             int x = heap.poll();
             int y = heap.poll();

              if (x != y){
            heap.offer(x- y);
        }
        
        }
        if (heap.size() == 0){
            return 0;
        } else {
            return heap.peek();
        }
      
        
      
    }
}