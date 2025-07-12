import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "hoart";
         
        //covert to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
             //convert to char-array
            char[] strc1 = str1.toCharArray();
            char[] strc2 = str2.toCharArray();

            //sort
             Arrays.sort(strc1);
             Arrays.sort(strc2);
             
             boolean result = Arrays.equals(strc1, strc2);
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
