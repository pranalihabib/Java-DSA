package basics;
import java.util.Scanner;

// //Optimal Approach
public class countDigits {

    static int countDig(int n){
        int count = (int)(Math.log10(n) + 1);
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int x = countDig(num);
        System.out.println("The number contains: "+ x + " digits");
        sc.close();
    }
}

//Brute Force Approach
// public class countDigits{
//     static int countDig(int n){
//         int count=0;
//         while(n!=0){
//             count++;
//             n/=10;
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         int x = countDig(num);
//         System.out.println("The number contains: "+ x + " digits");
//         sc.close();
//     }
// }