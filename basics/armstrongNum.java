package basics;
public class armstrongNum {
    static boolean isArmstrong(int num){
        int len = String.valueOf(num).length();
        int cnum = num;
        int rem =0, armstrong = 0;
        while(num!=0){
            rem = num%10;
            armstrong = armstrong + (int)Math.pow(rem, len);
            num = num/10;
        }
        if(cnum == armstrong) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(62));
    }
}
