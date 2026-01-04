package SortingTech.Sorting1;

public class SelectionSort {
    static int[] selection(int[] arr){
        int min = 0;
        for(int i = 0; i<arr.length - 1; i++){
            min = i ;
            for( int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {38, 52, 9, 18, 6, 62, 13};
        selection(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}


// cd "/Users/pranalihabib/Desktop/java "
// javac SortingTech/Sorting1/SelectionSort.java 
// java SortingTech.Sorting1.SelectionSort