package leetcode;

public class FourDivisors {

    static int divisors(int[] arr) {
    int sum;
        int count = 0;
        int outersum = 0;
        for(int i = 0; i<arr.length; i++){      
            sum = 0;  
            count = 0;         
            for(int j = 1; j*j<=arr[i]; j++){       
                if( arr[i]%j==0 ){   
                    count++;  
                    sum = sum + j;  
                    
                    if(j*j!=arr[i]){
                        count++;
                        sum = sum + (arr[i]/j);
                    }
                }
                if(count>4) break;
            }
            if(count == 4){
                outersum = outersum + sum;
            }
        }
        return outersum;
    }

    public static void main(String[] args) {
        int[] arr = {21, 21};
        System.out.println(divisors(arr));
    }
}


// cd "/Users/pranalihabib/Desktop/java "
// javac leetcode/FourDivisors.java 
// java leetcode.FourDivisors