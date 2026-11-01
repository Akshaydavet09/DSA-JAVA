public class Arrays {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int largestArr(int arr[]) {
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int binarySearch1(int arr[], int key) {
        int middleElement = arr[arr.length / 2];
        if (middleElement > key) {
            System.out.println("in 1st half");
            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[i] == key) {
                    return i;
                }
            }
        } else {
            System.out.println("in 2nd half");
            for (int i = arr.length / 2; i < arr.length; i++) {
                if (arr[i] == key) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void reverseArray(int arr[]) {
        for (int i = 0; i < (arr.length) / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = temp;
        }

    }

    public static void pairsInArray(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("( " + arr[i] + " , " + arr[j] + " )");
            }
            System.out.println();
        }
    }

    public static void subArrays(int arr[]) {
        int start = 0;
        while (start != arr.length) {
            int end = start;
            while (end != arr.length) {
                for(int i=start; i<=end; i++){
                    System.out.print(arr[i]+" ");
                }
                end++;
                System.out.println();
            }
            start++;
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int[] arr = { 2, 4, 6, 8, 10 };
        // System.out.println(binarySearch(arr, 30));
        // System.out.println(largestArr(arr));
        // System.out.println(binarySearch(arr, 1));
        // System.out.println(0 / 2);
        // System.out.println(binarySearch(arr, 80));
        // reverseArray(arr);
        // for(int i=0; i<arr.length; i++){
        // System.out.print(arr[i] + " ");
        // }
        // pairsInArray();
        subArrays(arr);
    }
}