public class QuickSort {

    public static void quickSort(int[]arr, int low, int high) {
        
        // Base case: if low >= high, then the array is sorted
        
        if (low < high) {
            int pivot = partition(arr, low, high); // pivot is the index of the pivot element
            quickSort(arr, low, pivot - 1);        // sort the left side of the pivot
            quickSort(arr, pivot + 1, high);       // sort the right side of the pivot
        }
    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];              // pivot element (last element)
        int i = low - 1;                    // index of the smaller element
        for (int j = low; j < high; j++) {  // iterate through the array
            if (arr[j] < pivot) {           // if the current element is smaller than the pivot
                i++;                        // increment the index of the smaller element
                int temp = arr[i];          // set the element at i to a temp variable
                arr[i] = arr[j];            // set the element at i to the element at j
                arr[j] = temp;              // set the element at j to the temp variable
            }
        }

        // swap the pivot element with the element at i + 1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }


    public static void main(String[] args) {
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}