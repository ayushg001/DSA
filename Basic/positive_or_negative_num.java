import java.util.Scanner;

public class positive_or_negative_num {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();
        if( num>0) {
            System.out.println("positive number");
        } else if( num<0){
            System.out.println("negative number");
        } else {
            System.out.println("zero");
        }
    }
}
