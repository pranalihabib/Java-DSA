package SortingTech.Sorting1;

public class BubbleSort {
static int[] bubble(int[] arr){
    for( int i = 0; i<arr.length - 1; i++){
        for( int j = i+1; j<arr.length ; j++){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {38, 52, 9, 18, 6, 62, 13};
        bubble(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}

// cd "/Users/pranalihabib/Desktop/java "
// javac SortingTech/Sorting1/BubbleSort.java 
// java SortingTech.Sorting1.BubbleSort