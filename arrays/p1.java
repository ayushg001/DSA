public class p1 {
    

        public static void fun(int arr[] ){
            int  , sum;
            for( int i =0 ; i<arr.length-1 ; i++){

                for( int j= i ; j<arr.length ; j++){
                    sum=0;
                   for( int k = i ; k<=j ; k++){

                        //   System.out.print("(" + arr[i] + "," + arr[j] + ")" );
                          System.out.print(  arr[k] + "" );
                          sum =sum + arr[k];

                   } 
                   System.out.print(" Sum is : " +sum);
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println("Number of pairs : " + tp);
       
        }
        
        public static void main(String [] args) {
            int arr[] = {2,4,6,8,10};  
           fun(arr);
            //    for(int j =0 ; j<arr.length ; j++){
            //      System.out.print(arr[j] + " ");
            // }
        }
}
