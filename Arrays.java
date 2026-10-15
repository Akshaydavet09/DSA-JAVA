public class Arrays{
 public static int binarySearch(int arr[], int key){
    for(int i=0; i<arr.length; i++){
        if(arr[i] == key){
            return i;
        }
    }
    return -1;
 }

 public static int largestArr(int arr[]){
    int largest = 0;
    for(int i=0; i<arr.length; i++){
        if(arr[i]>largest){
            largest = arr[i];
        }
    }
    return largest;
 }
    public static void main(String args[]){
        int[] arr = {2, 6, 8, 90, 78, 30};
        System.out.println(binarySearch(arr, 30));
        System.out.println(largestArr(arr));
    }
}