public class string_compression {
    
        public static String compression(String str){
            StringBuilder sb =  new StringBuilder("");
            // String newstr = "";

            for( int  i = 0 ; i < str.length() ; i++ ){
                Integer count = 1;
                while( i<str.length()-1 && str.charAt(i) == str.charAt(i+1) ){
                    count++;
                    i++;
                }
                // newstr = newstr + str.charAt(i);
                sb.append(str.charAt(i));             //  a
                if(count>1){
                    // newstr = newstr + count.toString();
                     sb.append(count.toString());    //   3
                }  
            }
            return sb.toString();
        }

    public static void main(String[] args) {
        
        String str = "aaabbcccdd";
        System.out.println(compression(str));
    }
}
