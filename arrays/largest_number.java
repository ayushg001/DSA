public class largest_number {

    public static int fun(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for( int i = 0 ; i<numbers.length ; i++ ){
            if( numbers[i]>largest   ){
                largest = numbers[i];
            }
            if( smallest>numbers[i] ){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,-1,20};
        int largest_number =  fun(numbers);
        System.out.println("largest number is " + largest_number);
    }
}
