class SearchRotationArray {
    static int pivotedBinarySearch(int[] arr, int n, int key) {
        int pivot = findPivot(arr, 0, n - 1);
        return 0;
    }

    static int findPivot(int[] arr, int low, int high) {
        if (low > high) {
            return -1;
        }
        if (low == high) {
            return low;
        }
        int mid = (low + high) / 2;

        if (mid < high && arr[mid] > arr[mid+1])
        {
            return mid;
        }
        if(mid > low && arr[mid] < arr[mid-1])
        {
            return mid-1;
        }


           
    }

    public static void main(String args[]) {
        int arr1[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int n = arr1.length;
        int key = 3;
        System.out.println("Index of the element is : " + pivotedBinarySearch(arr1, n, key));

    }
}