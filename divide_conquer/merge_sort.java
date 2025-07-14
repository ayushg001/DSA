package divide_conquer;

public class merge_sort {

        public static void printArr( int arr[]){
            for( int i = 0 ; i<arr.length ; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }


    public static void mergeSort(int arr[] , int si , int ei){
        //base case for recursion
        if(si >= ei){
            return;
        }
        //kaam
        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);  //left
        mergeSort(arr, mid+1, ei);  //right
        merge(arr, si , mid , ei); //merger now
    }

    public static void merge(int arr[] , int si ,  int mid , int ei){
        //left(0,3) = 4 ele  , right(4,6) = 3 ele  ,  = 6-0  +1  = 7    
        int temp[] = new int[ei-si+1];
        int i = si;  // idx for first sorted part
        int j = mid+1; // idx for 2nd sorted part
        int k = 0;    // idx for temp array

        while( i<=mid && j <=ei ){
            if(arr[i] < arr[j]){
                temp[k]=arr[i];
                i++;
            } else{
                temp[k] =arr[j];
                j++;
            }
            k++;
        }
        while( i <=mid){
            temp[k] = arr[i];
            i++;
            k++;
        } while (j<= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(k = 0, i = si ;  k < temp.length ; k++ , i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,-2,0,5,2,8};
        mergeSort(arr , 0 , arr.length-1);
        printArr(arr);
    }
}
