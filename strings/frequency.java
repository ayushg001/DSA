import java.util.Arrays;

public class frequency {
    public static void main(String[] args) {
        
        String str = "i love football because love sports";
        String arr[] = str.split(" ");
        int i , c = 1;
        Arrays.sort(arr);
        for( i =0 ; i< arr.length-1 ; i++){
             if(arr[i].equals(arr[i+1])){
                c++;
             }
             if(!arr[i].equals(arr[i+1])){
                System.out.println(arr[i] + " :  " + c);
                c=1;
             }
        }
        System.out.println(arr[i] + " " + c);
    }
}
