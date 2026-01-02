package recursion;
public class recursion5 {
    static int recursiveFact(int n){
        if(n == 1) return 1;
        return n * recursiveFact(n-1);
    }
    public static void main(String[] args) {
        int k = recursiveFact(6);
        System.out.println(k);
    }
}

