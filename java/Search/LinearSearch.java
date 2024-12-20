class LinearSearch {
    /*
    > Linear Search
    > Run through entire array, if value is found search is terminated and returns True, else returns False.
    */
    public static boolean search(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {  // Cycle through the entire array
            if (val == arr[i]) {                // If the current array element matches the search item
                return true;                    // Return true
            }
        }
        return false;                           // Item not present in array
    }

    // Utilities
    public static int[] generateArray(int size) {
        int[] arr = new int[size];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
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
        int[] array = generateArray(10);
        printArray(array);
        System.out.println(search(array, 5));
    }
}