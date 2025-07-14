import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";
         
        //covert to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
                //convert to char-array
                char[] strC1 = str1.toCharArray();
                char[] strC2 = str2.toCharArray();

                //sort
                Arrays.sort(strC1);
                Arrays.sort(strC2);
                
                boolean result = Arrays.equals(strC1, strC2);
                if(result){
                    System.out.println(str1 +" && "+ str2 +" are Anagram");
                }else{
                    System.out.println(str1 +" && "+ str2 +" are not Anagram");
                }
        } else{
            System.out.println("Strings are not of same length");
        }
       
    }
}
