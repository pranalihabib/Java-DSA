package recursion;
public class recursion4 {
    static int recursiveSum(int n){
        if(n == 1) return 1;
        return n + recursiveSum(n-1);
    }
    public static void main(String[] args) {
        int k = recursiveSum(6);
        System.out.println(k);
    }
}
