
import java.util.*;

class Solution {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int startRow = 0;
        int startColumn = 0;
        int endRow = matrix.length - 1;
        int endColumn = matrix[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {

            // top row
            for (int j = startColumn; j <= endColumn; j++) {
                result.add(matrix[startRow][j]);
            }

            // right column
            for (int i = startRow + 1; i <= endRow; i++) {
                result.add(matrix[i][endColumn]);
            }

            // bottom row
            if (startRow < endRow) {    
                for (int j = endColumn - 1; j >= startColumn; j--) {
                    result.add(matrix[endRow][j]);
                }
            }

            // left column
            if (startColumn < endColumn) {
                for (int i = endRow - 1; i > startRow; i--) {
                    result.add(matrix[i][startColumn]);
                }
            }

            // move to inner layer
            startRow++;
            endRow--;
            startColumn++;
            endColumn--;
        }

        return result;
    }

       

    public static void main(String[] args) {
        
        int matrix[][] = { { 1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                           {13,14,15,16}   };

                          System.err.println(spiralOrder(matrix)); 
    }
}
