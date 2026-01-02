package basics;
import java.util.ArrayList;
import java.util.List;

public class divisors {
    //brute force approach
    // static List<Integer> arrayDivisors(int num){
    //     List<Integer> arr = new ArrayList<>();
    //     for(int i = 1; i <= num; i++){
    //         if(num%i == 0) arr.add(i);
    //     }
    //     return arr;
    // }

    static List<Integer> arrayDivisors(int num){
        List<Integer> arr = new ArrayList<>();
        for(int i = 1; i*i <= num; i++){
            if(num % i == 0){
                arr.add(i);
                if(i != (num/i)) arr.add(num/i);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(arrayDivisors(40));
    }
}
