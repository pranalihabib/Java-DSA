package SortingTech.Sorting1;

public class InsertionSort {
    static int[] insertion(int[] arr){  
        for( int i = 1; i<arr.length; i++){   
            int temp = arr[i];   
            int j = i-1;    
            while( j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;  
            }
            arr[j+1] = temp;
        }
            return arr;
    }
    public static void main(String[] args) {
        // int[] arr1 = {38, 52, 9, 18, 6, 62, 13};
        int[] arr2 = {5,9,1,6,2,8,4,3,7};
        insertion(arr2);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}

// cd "/Users/pranalihabib/Desktop/java "
// javac SortingTech/Sorting1/InsertionSort.java 
// java SortingTech.Sorting1.InsertionSort