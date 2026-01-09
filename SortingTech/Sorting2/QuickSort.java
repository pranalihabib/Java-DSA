package SortingTech.Sorting2;

public class QuickSort {

    //Hoare Partition
    static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;
        while(true){
            do {
                i++;
            }while( arr[i] < pivot);
            do{
                j--;
            }while(arr[j] > pivot);

            if (i >= j) {
                return j;
            }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }
    }
    static int[] quickSort(int[] arr, int low, int high){
        if(low < high){
            int j = partition(arr, low, high);
            quickSort(arr, low, j);
            quickSort(arr, j+1, high);
        }
        return arr;
    }

    //Lomuto Partition
    // static void swap(int[] arr, int i, int j) {
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }

    // static int partition(int[] arr, int low, int high) {
    //     int pivot = arr[high];
    //     int i = low - 1;

    //     for (int j = low; j < high; j++) {
    //         if (arr[j] <= pivot) {
    //             i++;
    //             swap(arr, i, j);
    //         }
    //     }
    //     swap(arr, i + 1, high);
    //     return i + 1;
    // }

    // static void quickSort(int[] arr, int low, int high) {
    //     if (low < high) {
    //         int pi = partition(arr, low, high);
    //         quickSort(arr, low, pi - 1);
    //         quickSort(arr, pi + 1, high);
    //     }
    // }

    public static void main(String[] args){
        // int[] arr1 = {5,9,1,6,2,8,4,3,7};
        int[] arr2 = {5, 3, 5, 5, 2, 5, 1}; //loops infinite
        quickSort(arr2, 0, arr2.length-1);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}


// cd "/Users/pranalihabib/Desktop/java "
// javac SortingTech/Sorting2/QuickSort.java 
// java SortingTech.Sorting2.QuickSort