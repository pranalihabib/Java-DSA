package basics;
public class fibonacci {

    //sequence
    static void fibonacciSeq(int n){
        int i = 0;
        System.out.print(i+ " ");
        int j = 1;
        System.out.print(j+ " ");
        int count = 1;
        while(count!=n){
            int sum = i+j;
            System.out.print(sum+ " ");
            i = j;
            j = sum;
            count++;
        }
        System.out.println();
    }
    //number
    static int fibonacciNum(int n){
        int i = 0;
        int j = 1;
        if( n<=1) return n;
        int sum = 0;
        for(int k = 2; k<=n; k++){
            sum = i + j;  //1 2 3 5 8
            i = j;       //i = 1 1 2 3
            j = sum;      //j = 1 2 3 5
        }
        return sum;
    }
    
    //
    public static void main(String[] args) {
        System.out.println(fibonacciNum(3));
    }
}
