public class reverse_the_given_number {
    public static void main(String[] args) {
        int n=123 ;
        int last_digit = 0;
        int reverse = 0; // Initialize reverse to 0
        // last digit = num%10
        // remove last digit = num/10
        while( n>0){
            last_digit = n%10;
            reverse = (reverse*10) + last_digit;
           
            n=n/10;
        }
        System.out.println(reverse);
    }
    
}
