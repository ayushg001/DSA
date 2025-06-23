public class binary_search {

    public static  int br( int arr[] , int key ){
         int start = 0 ;
         int end = arr.length-1;
         while(start<=end){
            int mid = (start + end)/2;
            if( arr[mid]==key ){
                return mid;
            }  if(arr[mid] > key){  //left
                end = mid-1;
            }   else {          //right
                start = mid+1;
            }

         }
         return -1;
    }

    public static void main (String [] args){

        int arr[] = {2,4,6,8,10,12,14};
        int key = 10;
        int index = br(arr, key);
        if(index == -1){
                System.out.println("Key Not Found" ); 
        } else{
            System.out.println("Found at " + br(arr, key));
        }
        
    }

    
}