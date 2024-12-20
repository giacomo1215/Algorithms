class BinarySearch {
    /*
    > Binary Search
    > Halves the array and looks if value searched is more or less than the middle value of the new array.
    */
    public static int binSearch(int[] arr, int low, int high, int val) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == val) return mid;

            if (arr[mid] < val) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    // Utilities
    public static int[] generateArray(int size) {
        int[] arr = new int[size];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i;
        }

        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = generateArray(11);
        printArray(array);
        System.out.println(binSearch(array, 0, array.length, 9));
    }
}