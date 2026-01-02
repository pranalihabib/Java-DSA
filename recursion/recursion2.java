package recursion;
public class recursion2 {

    //forward recursion
    static void printNum(int current, int n){
        if(current > n) return;
        System.out.print(current+ " ");
        printNum(current+1, n);
    }

    // backtracking recursion
    // static void printNum(int current, int n){
    //     if(current > n) return;
    //     printNum(current+1, n);
    //     System.out.print(current+ " ");
    // }
    public static void main(String[] args) {
        printNum(6, 10);
    }
}
