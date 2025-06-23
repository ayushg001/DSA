public class PrintSubArrays {

public static void fun(   int numbers[]){
    int max_sum = Integer.MIN_VALUE;
        for(  int i =0 ; i < numbers.length ; i++ ){         //0
                int start = i;
              

                for(  int j = i ; j < numbers.length ; j++ ) {   //0
                    int end = j;
                    int sum=0;
                        for ( int k = start ; k<=end ; k++ ){    //0

                            sum = sum + numbers[k];
                            System.out.print(  numbers[k]  + " "  );  // 8 8 3 9 9 2
                        }
                        if(sum> max_sum){
                            max_sum = sum;
                        }
                     System.out.println( "sum is " + sum);
                        
                    }
                    System.out.println();
        }
            System.out.println("Max sum is" + max_sum);
}

    public static void main(String[] args) {  
        int numbers[] = {2,4,6,8,10};

        fun(numbers);



    }


}
