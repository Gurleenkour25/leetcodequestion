class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        int r = matrix.length;
        

      for(int i = 0 ;i < r ; i++)
      {
        int low = 0 ;
        int high = r-1;
        while (low < high) {
            int temp = matrix[i][low];
            matrix[i][low] = matrix[i][high];
            matrix[i][high] = temp;

            low++;
            high--;
        }
      }


    }

    public void transpose(int[][] matrix)
    {
        int r = matrix.length;

        for(int i = 0 ;i<r ;i++) {
            for(int j =i+1 ; j<r ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}