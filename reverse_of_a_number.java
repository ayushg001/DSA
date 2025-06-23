public class reverse_of_a_number {
    public static void main(String[] args) {
        int n=10899;
        int last_digit =0;
        // last digit = num%10
        // remove last digit = num/10
        while( n>0){
            last_digit = n%10;
            System.out.print(last_digit);
            n=n/10;
        }
    }
}
