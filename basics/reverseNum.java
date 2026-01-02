package basics;
import java.util.*;

public class reverseNum {

    static int reverseDig(int n){
        int num = 0;
        int rem = 0;
        while(n!=0){
            rem = n%10;
            num = num*10 + rem;
            n = n/10;
        }
        return num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reverse = reverseDig(num);
        System.out.println("The reverse of the number: " + reverse);
        sc.close();
    }
}
