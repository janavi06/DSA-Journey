class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>(
            (a, b) -> {
        int distanceA = a[0] * a[0] + a[1] * a[1];
        int distanceB = b[0] * b[0] + b[1] * b[1];

        return distanceB - distanceA;
    });

        for (int i = 0; i < points.length; i++){

            heap.offer(points[i]);
            if (heap.size() > k ) {
                heap.poll();   //REMOVE the farthest
            }
        }
        int[][] result = new int[k][2];
        for(int i = 0; i < k; i++){
            result[i] = heap.poll();   //TAKE a remaining point for answer
        }
        return result;
    }
}