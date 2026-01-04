package leetcode;

// import java.util.HashMap;

public class NRepeated {

    //unoptimal and unnecessary
    // static int repeatedNtimes(int[] arr){
    //     HashMap <Integer, Integer> map = new HashMap<>();
    //     for(int x : arr){
    //         map.put(x, map.getOrDefault(x, 0)+1);
    //         if(map.get(x) == arr.length / 2) return x;
    //     }
    //     return -1;
    // }

    // optimal
    // Array size = 2n
    // Exactly one element repeats n times
    // All other elements appear once
    // This guarantee is the reason this trick works.
    static int repeatedNTimes(int[] A) {
        for (int i = 0; i < A.length - 2; i++)
            if (A[i] == A[i + 1] || A[i] == A[i + 2])
                return A[i];
        return A[A.length - 1];
    }

    public static void main(String[] args) {
        // int[] arr1 = {1, 2, 3, 3};
        // int[] arr2 = {2,1,2,5,3,2};
        int[] arr3 = {5,1,5,2,5,3,5,4};
        // int[] arr4 = {1,2,3,4,5,5,5,5};
        System.out.println(repeatedNTimes(arr3));
    }
}


// cd "/Users/pranalihabib/Desktop/java "
// javac leetcode/NRepeated.java 
// java leetcode.NRepeated