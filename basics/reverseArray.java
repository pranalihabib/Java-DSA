package basics;
public class reverseArray {

    static int[] revArray(int[] arr){
        int p1 = 0;
        int p2 = arr.length -1;
        while(p1<p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        revArray(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
