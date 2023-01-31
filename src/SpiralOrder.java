package src;

/**
 * @author chenhuigu
 */
public class SpiralOrder {
    public int[] spiralOrder(int[][] matrix) {
        // 边界条件
        if (matrix.length == 0) {
            return new int[0];
        }
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length-1, x = 0;
        int[] res = new int[matrix.length * matrix[0].length];
        while (true){
            // left to right
            for (int i = left; i <= right; i++) res[x++] = matrix[top][i];
            if(++top > bottom) break;
            //top to bottom
            for (int i = top; i <= bottom; i++) res[x++] = matrix[i][right];
            if(--right < left) break;
            //right to left
            for(int i =right;i>=left;i--) res[x++] = matrix[bottom][i];
            if(--bottom < top) break;
            // bottom to top
            for (int i = bottom; i >= top ; i--) res[x++] = matrix[i][left];
            if(++left > right) break;
        }
        return res;
    }
}
