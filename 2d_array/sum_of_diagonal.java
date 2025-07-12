public class sum_of_diagonal {

public static int sum(int matrix[][]){
    int sum = 0;
    // for( int i = 0 ; i<= matrix.length-1 ; i++){           //brute force
    //     for(int j = 0 ; j<= matrix[0].length-1 ; j++){
    //         if( i ==j){
    //             sum = sum + matrix[i][j];
    //         }
    //         else if(i+j==matrix.length-1){
    //             sum = sum + matrix[i][j];
    //         }
    //     }
        
    // }
    for(int i = 0 ; i<= matrix.length-1 ; i++){
        sum = sum + matrix[i][i];
        sum = sum + matrix[i][matrix.length-1-i];
    }
return sum;
}
    public static void main(String[] args) {
         int matrix[][] = { { 1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                           {13,14,15,16}   };
      System.out.println(sum(matrix));
    }
}
