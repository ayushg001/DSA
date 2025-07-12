public class convert_first_letter_to_uppercase {
    
    public static String conversion(String str){
        StringBuilder sb = new StringBuilder("");
        char ch1 = Character.toUpperCase(str.charAt(0));
        sb.append(ch1);

        for( int i = 1 ; i< str.length() ; i ++){
            if(str.charAt(i)==' '){
                sb.append(str.charAt(i));
                i++;
                ch1 = Character.toUpperCase(str.charAt(i));
                sb.append(ch1);
            } else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        
        String str = "hello world";
        System.out.println(conversion(str));
    }
}
