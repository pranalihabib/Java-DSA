package recursion;
public class recursion3 {
    //forward recursion
    static void printNum(int current, int num){
        if(num > current) return;
        System.out.print(current + " ");
        printNum(current - 1, num);
    }

    //backtracking
    // static void printNum(int current, int num){
    //     if(num > current) return;
    //     printNum(current - 1, num);
    //     System.out.print(current + " ");
    // }
    public static void main(String[] args) {
        printNum(10, 1);
    }
}
