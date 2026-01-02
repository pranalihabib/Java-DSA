package basics;
import java.util.Scanner;

public class checkPalindrome {
    static boolean isPalindrome(int n){
        int n1 = n;
        int num = 0;
        int rem = 0;
        while(n1 != 0){
            rem = n1%10;
            num = num*10 + rem;
            n1 = n1/10;
        }
        if(num == n) return true;
        else return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPalindrome(num) == true){
            System.out.println("The number is Palindrome");
        }
        else System.out.println("The number is not Palindrome");
        sc.close();
    }
}
