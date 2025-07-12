public class shortest_path {

public static float path(String str){
    int x = 0  , y = 0;
    for(int i = 0 ; i < str.length() ;  i++){
        char dir = str.charAt(i);
        if( dir == 'w'){
            x--;
        } else if( dir == 'n'){
            y++;
        } else if( dir == 's'){
            y--;
        }else{
            x++;
        }
    }
    int x2 = x*x ,
    y2 = y*y;
    return (float)(Math.sqrt(x2 + y2));
}
    public static void main(String[] args) {
        String str = "WNEENESENNN";
         System.out.println(path(str));   
    }
}
