package recursion;
public class recursion6 {

    //Approach 1 - Iterative
    // static boolean isPalindrome(String str) {
    //     str =str.toLowerCase(); 
    //     str=str.replaceAll("[^a-z0-9]","");
    //     str = str.toLowerCase();
    //     for(int i = 0; i<=str.length()/2; i++){
    //         if(str.charAt(i) == str.charAt(str.length() -1 -i)) continue;
    //         else return false;
    //     }
    //     return true;
    // }
    //Approach 2 - Recursive
    // static boolean isPalindrome(String str, int idx) {
    //     str = str.toLowerCase();
    //     if(idx>=str.length()/2) return true;
    //     if(str.charAt(idx) != str.charAt(str.length() -1 -idx)) return false;
    //     return isPalindrome(str, idx+1);
    // }

    //Optimal Approach
    static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            char cl = s.charAt(l);
            char cr = s.charAt(r);

            if (!Character.isLetterOrDigit(cl)) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(cr)) {
                r--;
                continue;
            }

            if (Character.toLowerCase(cl) != Character.toLowerCase(cr))
                return false;

            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome("madam"));
    }
}
