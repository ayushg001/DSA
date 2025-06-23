public class linear_search{
    
    public static int ls( int arr[] , int key ){
            for( int i =0 ; i< arr.length ; i++){
                if(arr[i]==key){
                   return i; 
                }
            }
            return -1;
    }
    public static void main(String []args) {

        int arr[] ={2,3,4,5,6};
        int key = 0;
        int index = ls(arr , key);
        if(index==-1){ 
            System.out.println("NOT FOUND");
        } else {
            System.out.println("Key is at Index : " + index);
        }
        
    }
}

