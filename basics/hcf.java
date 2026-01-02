package basics;
import java.util.*;

public class hcf {

    //brute force approach
    // static int hcfnum(int num1, int num2){
    //     int k = 1;
    //     for(int i = 1; i<=Math.min(num1,num2); i++){
    //         if(num1%i==0 && num2%i==0) {
    //             k = i;
    //         }
    //     }
    //     return k;
    // }

    //better approach
    // static int hcfnum(int num1, int num2){
    //     int k = 1;
    //     for(int i = Math.min(num1,num2); i>0; i--){
    //         if(num1%i==0 && num2%i==0) {
    //             return i;
    //         }
    //     }
    //     return k;
    // }

    //optimal approach - euclidean algorithm
    static int hcfnum(int num1, int num2){
        while( num1>0 && num2>0 ){
            if(num1>num2){
                num1=num1%num2;
            }
            else{
                num2=num2%num1;
            }
        }
        if(num1==0){
            return num2;
        }
        return num1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sol = hcfnum(15, 20);
        System.out.println(sol);
        sc.close();
    }
}
