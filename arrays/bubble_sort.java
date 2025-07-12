public class bubble_sort {
    

        public static void bubble_Sort(int arr[]){

            for ( int turn = 0 ; turn<arr.length-1 ; turn++ ){
                int swap =0;
                for ( int j = 0 ; j<arr.length -1-turn ; j++)       {
                    if(arr[j]>arr[j+1]){
                        swap++;
                        //swap
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;

                    }
                  
                }
                //   if(swap==0){
                //          System.out.println("already sorted");
                //         break;
                       
                //     }
            }
                
        }
        public static void fun(int arr[]){
            for ( int i = 0 ; i<arr.length ; i++){
                System.out.println(arr[i] + " ");
            }
        }
    public static void main(String[] args) {
        
        int arr[] = {5,4,1,3,2};
        // int arr[] = {1,2,3,4,5};
        bubble_Sort(arr);
        fun(arr);
    }
}
