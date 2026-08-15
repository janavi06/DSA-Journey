class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low = 0;
        int high = mat[0].length - 1;
         int maxRow = 0;

        while (low <= high){
            int mid = low + (high - low)/ 2;

            for (int row = 0; row < mat.length; row++){
                 if (mat[row][mid] > mat[maxRow][mid]){
                    maxRow = row;
                 }
            } 
            int left = 0;
            int right = 0;

             // start of mid
            if (mid == 0){
                left = -1;
            } else {
                left = mat[maxRow][mid - 1];
            }

            // end of mid
            if (mid == mat[0].length - 1){
                right = -1;
            } else {
                right = mat[maxRow][mid + 1];
            }


            if (mat[maxRow][mid] > right && mat[maxRow][mid] > left){
               return new int []{maxRow,mid};
            } else if (mat[maxRow][mid] < left){
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
       return new int[]{-1, -1};
    }
}