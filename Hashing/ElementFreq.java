package Hashing;

import java.util.HashMap;
import java.util.Map;

public class ElementFreq {

    // Brute Force Approach
    // static void ElementFrequency(int[] arr){
    //     int n = arr.length;
    //     boolean[] visited = new boolean[n];
    //     for( int i = 0; i < n; i++){
    //         int count = 1;
    //         if(visited[i]) continue;
    //         for( int j = i+1; j < n; j++){
    //             if(arr[i] == arr[j]){
    //                 count++;
    //                 visited[j] = true;
    //             }
    //         }
    //         System.out.println("count of "+ arr[i]+ " : "+ count);
    //         visited[i] = true;
    //     }
    //     for (boolean b : visited) {
    //         System.out.print(b + " ");
    //     }
    // }

    //Optimal Approach - using Hashmap
    static void ElementFrequency(int[] arr){
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }
    }

    public static void main(String[] args){
        int[] arr = {7,8,95,35,7,7,35,8,8};

        ElementFrequency(arr);
    }
}
