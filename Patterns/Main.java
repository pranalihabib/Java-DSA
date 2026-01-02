package Patterns;
// public class Main {

//     public static void main(String[] args){
//         char x = '*';
//         for(int i = 1; i<=5; i++){
//             for(int j = 1; j<=5; j++){
//                 System.out.print(x);
//             }
//             System.out.println();
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args){
//         char x = '*';
//         for(int i = 1; i<=5; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print(x);
//             }
//             System.out.println();
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args){
//         for(int i = 1; i<=5; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args){
//         for(int i = 1; i<=5; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args){
//         char x = '*';
//         for(int i = 1; i<=5; i++){
//             for(int j = i; j<=5; j++){
//                 System.out.print(x);
//             }
//             System.out.println();
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args){
//         for(int i = 5; i>=1; i--){
//             for(int j = 1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


//  *
// ***
//*****
// public class Main {

//     public static void main(String[] args){
//         int n = 5;
//         for(int i = 1; i<=n; i++){         //number of rows
//             for(int j = i; j<n; j++){       //number of spaces
//                 System.out.print("-");
//             }
//             for(int  k= 1; k<=2*i-1; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//*****
// ***
//  *
// public class Main {

//     public static void main(String[] args){
//         int n = 3;
//         for(int i = n; i>=1; i--){         //number of rows
//             for(int j = i; j<n; j++){       //number of spaces
//                 System.out.print(" ");
//             }
//             for(int  k= 1; k<=2*i-1; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//  *
// ***
//*****
//*****
// ***
//  *

// public class Main {

//     public static void main(String[] args){
//         int n = 3;
//         for(int i = 1; i<=n; i++){         //number of rows
//             for(int j = i; j<n; j++){       //number of spaces
//                 System.out.print(" ");
//             }
//             for(int  k= 1; k<=2*i-1; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i = n; i>=1; i--){         //number of rows
//             for(int j = i; j<n; j++){       //number of spaces
//                 System.out.print(" ");
//             }
//             for(int  k= 1; k<=2*i-1; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
// public class Main {

//     public static void main(String[] args){
//         int n = 9;
//         for(int i = 1; i<=n; i++){
//             if(i<=5) {
//                 for(int j=1; j<=i; j++){
//                     System.out.print("*");
//                 }
//             }
//             else{
//                 for(int j=1; j<=n-i+1; j++){
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// 1
// 01
// 101
// 0101
// 10101
// public class Main {

//     public static void main(String[] args){
//         int n = 5;
//         int start = 1;
//         for(int i = 1; i<=n; i++){
//             if(i%2 == 0) start = 0;
//             else start = 1;
//             for(int j = 1; j<=i; j++){
//                 System.out.print(start);
//                 start = 1 - start;   //way to toggle between 0 and 1 - 1 becomes 0 and 0 becomes 1
//             }
//             System.out.println();
//         }
//     }
// }


//1      1
//12    21
//123  321
//12344321
// public class Main{
//     public static void main(String[] args){
//         int n = 4;
//         for(int i = 1; i <= n; i++){     //number of rows 
//             for(int k = 1; k<= i; k++){
//                 System.out.print(k);
//             }
//             for(int j = 0; j<2*(n-i); j++){
//                 System.out.print(" ");
//             }
//             for(int k = i; k>= 1; k--){
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }


// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
// public class Main{
//     public static void main(String[] args){
//         int n = 5;
//         int count = 1;
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(count+ " ");
//                 count++;
//             }
//             System.out.println();
//         }
//     }
// }

//A
//AB
//ABC
//ABCD
//ABCDE
// public class Main{
//     public static void main(String[] args){
//         int n = 5;
//         for(int i = 65; i <n+65; i++){
//             for(int j = 65; j <= i; j++){
//                 char x = (char)j;
//                 System.out.print(x);
//             }
//             System.out.println();
//         }
//     }
// }

//ABCDE
//ABCD
//ABC
//AB
//A
// public class Main{
//     public static void main(String[] args){
//         int n = 5;
//         for(int i = n+65-1; i >=65; i--){
//             for(int j = 65; j <= i; j++){
//                 char x = (char)j;
//                 System.out.print(x);
//             }
//             System.out.println();
//         }
//     }
// }


//A
//BB
//CCC
//DDDD
//EEEEE
// public class Main{
//     public static void main(String[] args){
//         int n = 5;
//         for(int i = 65; i < n+65; i++){
//             for(int j=65; j<=i; j++){
//                 char x = (char)i;
//                 System.out.print(x);
//             }
//             System.out.println();
//         }
//     }
// }


//    1
//   121
//  12321
// 1234321
// public class Main{
//     public static void main(String[] args){
//         int n = 4;
//         for(int i = 1; i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k<=i;k++){
//                 System.out.print(k);
//             }
//             if(i>1){
//                 for(int m=i-1; m>=1;m--){
//                     System.out.print(m);
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



//   A
//  ABA
// ABCBA
//ABCDCBA
// public class Main{
//     public static void main(String[] args){
//         int n = 4;
//         for(int i = 1; i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k = 0; k<i;k++){
//                 System.out.print((char)('A'+k));
//             }
//             if(i>1){
//                 for(int m=i-2; m>=0;m--){
//                     System.out.print((char)('A'+m));
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


//E
//DE
//CDE
//BCDE
//ABCDE

// public class Main{
//     public static void main(String[] args){
//         int n = 7;
//         for (int i = n; i>=1; i--){
//             for(int j = i; j<=n;j++){
//                 System.out.print((char) ('A'+j-1));
//             }
//             System.out.println();
//         }
//     }
// }


//**********
//****  **** -2 spaces
//***    *** -4 spaces
//**      ** -6 spaces
//*        * -8 spaces
//*        *
//**      **
//***    ***
//****  ****
//**********
// public class Main{

//     static void pattern1(int n){
//         for(int i = 1; i<=n; i++){
//             for(int k = i; k<=n;k++){
//                 System.out.print("*");
//             }
//             for(int j =1; j<=2*i-2;j++){
//                 System.out.print(" ");
//             }
//             for(int k = i; k<=n;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     static void pattern2(int n) {
//         for(int i = n; i>=1; i--){
//             for(int k = i; k<=n;k++){
//                 System.out.print("*");
//             }
//             for(int j = 1; j<=2*i-2;j++){
//                 System.out.print(" ");
//             }
//             for(int k = i; k<=n;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         pattern1(5);
//         pattern2(5);
//     }
// }



//*        * -8 spaces
//**      ** -6 spaces
//***    *** -4 spaces
//****  **** -2 spaces
//********** -0 spaces

//****  **** -2 spaces
//***    *** -4 spaces
//**      ** -6 spaces
//*        * -8 spaces
// public class Main{

//     static void pattern1(int n) {
//         for(int i = 1; i<= n; i++){
//             for(int k = 1; k<=i;k++){
//                 System.out.print("*");
//             }
//             for(int j = 1; j<=2*n-2*i; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k<=i;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     static void pattern2(int n){
//         for(int i = 1; i<n; i++){
//             for(int j = i; j<n; j++){
//                 System.out.print("*");
//             }
//             for(int j = 1; j<=2*i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = i; j<n; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         pattern1(n);
//         pattern2(n);
//     }
// }


//***** 
//*   * 
//*   * 
//*   * 
//***** 
// public class Main{
//     public static void main(String[] args) {
//         int n = 9;
//         for(int i = 1; i<=n ;i++){
//             for(int j = 1; j<=n ;j++){
//                 if(i==1 || i==n || j==1 || j==n){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

//4444444
//4333334
//4322234
//4321234
//4322234
//4333334
//4444444


