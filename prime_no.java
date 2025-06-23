import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num= sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i<num;i++){
            if( num % i == 0 ){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("n is prime");
        }else{
            System.out.println("not prime");
        }
    }
}
