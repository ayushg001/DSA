public class count_the_vowels {
    
public static int count(String str){

    int c = 0;
    for(int i = 0 ; i < str.length() ; i ++){
         if( str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
            c++;
         }
         
    }
    return c;
}
    public static void main(String[] args) {
        
        String str = "aeiou";
        System.out.println("Number of vowels are : " + count(str));

    }
}
