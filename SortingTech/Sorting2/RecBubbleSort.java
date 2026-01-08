package SortingTech.Sorting2;

public class RecBubbleSort {

    //brute force
    // static void bubbleSort(int[] arr, int n){
    //     if(n==1) return;
    //     for( int i = 0; i<n-1; i++){
    //         if(arr[i] > arr[i+1]){
    //             int temp = arr[i+1];
    //             arr[i+1] = arr[i];
    //             arr[i] = temp;
    //         }
    //     }
    //     bubbleSort(arr, n-1);  
    // }

    //optimal 
    static void bubbleSort(int[] arr, int n){
        if(n==1) return;
        boolean swap = false;
        for( int i = 0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
                swap = true;
            }
        }
        if(!swap) return;
        bubbleSort(arr, n-1);  
    }

    public static void main(String[] args) {
        // int[] arr1 = {5,9,1,6,2,8,4,3,7};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9 };
        bubbleSort(arr2, arr2.length);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}

// cd "/Users/pranalihabib/Desktop/java "
// javac SortingTech/Sorting2/RecBubbleSort.java 
// java SortingTech.Sorting2.RecBubbleSort
