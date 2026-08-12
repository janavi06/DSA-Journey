class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

    PriorityQueue<int[]> heap = new PriorityQueue<>(
        (a,b) -> {
            if (a[1] != b[1]){
             return  b[1] - a[1];
            } else {
                return b[0] - a[0];
            }
        }
        
    );
    

        for (int i = 0; i < arr.length; i++){
            int value = arr[i];
            int distance = Math.abs(value - x);

            int[] candidate = {value, distance};

            heap.offer(candidate);

            if (heap.size() > k){
                heap.poll();
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < k; i++){
            int[] candidate = heap.poll();
            result.add(candidate[0]);
        }
                Collections.sort(result);


    
        return result;

    }
}