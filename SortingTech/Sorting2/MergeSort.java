package SortingTech.Sorting2;

import java.util.ArrayList;

public class MergeSort {

    static int[] merge(int[] arr, int low, int mid, int high){
        ArrayList <Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while( left <= mid && right <= high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }
        }
        while( left <= mid ){
            temp.add(arr[left]);
            left++;
        }
        while( right <= high){
            temp.add(arr[right]);
            right++;
        }
        for( int i = low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
        return arr;
    }

    static void mergeSort(int[] arr, int low, int high){
        if( low >= high ) return;
        int mid = ( high + low ) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
    public static void main(String[] args){
        int[] arr = {5,9,1,6,2,8,4,3,7};
        mergeSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}


// cd "/Users/pranalihabib/Desktop/java "
// javac SortingTech/Sorting2/MergeSort.java 
// java SortingTech.Sorting2.MergeSort