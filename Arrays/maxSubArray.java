package Arrays;
public class maxSubArray {

    public static void maxSubArray(int arr[]) {
        int max = Integer.MIN_VALUE;
        int maxStIdx = 0;
        int maxEndIdx = 0;
        for (int st = 0; st < arr.length; st++) {                //defining start
            for (int end = st; end < arr.length; end++) {        //defining end
                int sum = 0;
                for (int i = st; i <= end; i++) {                //traversing whole array   
                    System.out.print(arr[i] + " ");
                    sum += arr[i];
                }
                if (sum > max) {
                    max = sum;
                    maxStIdx = st;
                    maxEndIdx = end;
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.print("Max Subarray is : ");
        for(int i = maxStIdx; i<=maxEndIdx; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 6};
        maxSubArray(arr);
    }
}