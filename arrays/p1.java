public class p1 {
    

        public static void fun(int arr[] ){
            int max_sum = Integer.MIN_VALUE , min_sum = Integer.MAX_VALUE, sum;
            for( int i =0 ; i<arr.length-1 ; i++){

                for( int j= i ; j<arr.length ; j++){
                    sum=0;
                    for( int k = i ; k<=j ; k++){

                        //   System.out.print("(" + arr[i] + "," + arr[j] + ")" );
                          System.out.print(  arr[k] + " " );
                          sum =sum + arr[k];

                   } 
                   if(sum> max_sum){
                    max_sum=sum;
                   }
                   if(sum<min_sum){
                    min_sum=sum;
                   }
                   System.out.print(" Sum is : " +sum);
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println("Maxi sum is : " + max_sum);
             System.out.println("Minimum sum is : " + min_sum);
       
        }
        
        public static void main(String [] args) {
            int arr[] = {1,-2,6,-1,3};  
           fun(arr);
            //    for(int j =0 ; j<arr.length ; j++){
            //      System.out.print(arr[j] + " ");
            // }
        }
}
