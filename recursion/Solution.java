package recursion;
class Solution {
    static void printName(String name, int count, int n){
        if(count == n) return;
        System.out.println(name);
        printName(name, count+1, n);
    }
    public static void main(String[] args) {
        printName("Java", 0, 20);
    }
}

