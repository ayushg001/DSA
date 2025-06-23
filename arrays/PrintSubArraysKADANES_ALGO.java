public class PrintSubArraysKADANES_ALGO {

    public static void kandanes(int numbers[]){

        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for( int i =0 ; i< numbers.length ;  i++ ){

            curr_sum = curr_sum + numbers[i];
            if (curr_sum< 0 ) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
            // if (curr_sum> max_sum) {
            //     max_sum = curr_sum  ;
            // }
           
        }
        System.out.println("max sum : " + max_sum);

    }

    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kandanes(numbers);
    }
    
}
