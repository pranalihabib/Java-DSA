package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HighLowFreq {
    // hashmap approach - optimal
    static void frequency(int[] arr){
        HashMap <Integer, Integer> map = new HashMap<>();
        int minEle = 0, maxEle = 0;
        int minFreq = Integer.MAX_VALUE, maxFreq = 0;
        for(int i = 0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(value>maxFreq){
                maxFreq = value;
                maxEle = key;
            }
            if(value<minFreq){
                minFreq = value;
                minEle = key;
            }
        }
        System.out.println(maxEle + " : "+ maxFreq);
        System.out.println(minEle + " : "+ minFreq);
    }
    public static void main(String[] args) {
        int[] arr = {7,8,95,35,7,7,35,8,8, 8};
        frequency(arr);
    } 
}



// cd "/Users/pranalihabib/Desktop/java "
// javac Hashing/HighLowFreq.java
// java Hashing.HighLowFreq

// cd "/Users/pranalihabib/Desktop/java "
// javac basics/onePlus.java
// java basics.onePlus