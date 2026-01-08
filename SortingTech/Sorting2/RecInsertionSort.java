package SortingTech.Sorting2;

public class RecInsertionSort {
    static void insertionSort(int arr[], int i, int n){
        if(n == i ) return;
        int temp = arr[i];   
            int j = i-1;    
            while( j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;  
            }
            arr[j+1] = temp;
        insertionSort(arr, i+1, n);
    }

    public static void main(String[] args) {
        int[] arr1 = {5,9,1,6,2,8,4,3,7};
        insertionSort(arr1,0, arr1.length);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}

// cd "/Users/pranalihabib/Desktop/java "
// javac SortingTech/Sorting2/RecInsertionSort.java 
// java SortingTech.Sorting2.RecInsertionSort