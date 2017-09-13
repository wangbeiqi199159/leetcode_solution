/**
 * Created by becky on 9/6/17.
 */
public class rotateMatrix {
    public static int[][] rotate(int[][] matrix, int flag){
        int m = matrix.length, n = matrix[0].length;

        int[][] newM = new int[n][m];

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                newM[i][j] = flag == 0 ? matrix[m - 1 - j][i] : matrix[j][n - 1 - i];
            }
        }
        return newM;
    }
}
