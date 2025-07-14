public class Ip_address_check {

    static boolean fun(String str){
        String arr[] = str.split("\\.");
        if(arr.length != 4){
            return false;
        }
        for( int i  = 0 ; i < arr.length ; i++) {
            String s = arr[i];
            int num = Integer.parseInt(s);
            if( num < 0 || num> 255){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        String ip = "12.266.45.0";
        if(fun(ip)){
            System.out.println("Correct IP");
        }else{
            System.out.println("Wrong Ip");
        }
    }
}
