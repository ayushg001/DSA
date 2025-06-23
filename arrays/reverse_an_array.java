public class reverse_an_array {
    
public static void fun( int  numbers[]){
        int first = 0, last = numbers.length-1;
         while (first < last) {      // no need to use "=" 
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
         }
}

    public static void main(String[] args) {
        int numbers[] = {2,3,4,6,8,10};
        fun(numbers);
        for ( int i =0; i<numbers.length ; i++ ){
            System.out.println(numbers[i]);
        }
    }
}
