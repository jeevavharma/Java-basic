import java.util.Scanner;

public class program {
    public static void main(String[] args) {
//  Program 1 :     Read and print an integer value

       /* int num;
        System.out.println("Enter a number..");

        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        System.out.println("Entered integer is : " + num);

        */

//        Program 2: Palindrome number
//        palindrome number is that when u reverse a number it should be same the old e.g. 545, 171

      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number...");

        int number = sc.nextInt();

        int org_num = num;

       */



//        How to reverse a number in different ways
        Scanner si = new Scanner(System.in);
        System.out.println("Enter a number...");
        int num = si.nextInt();

//        1. using algorithm

//        int rev =0;
//        while (num !=0){
//           rev = rev*10 + num%10; // step 1: number 1234 is not eqaul to 0 it comes inside the loop
////            rev = 0 so rev = 0*10 + 1234%10 => rev = 4   1234%10 = 4;
//            num = num/10; // the number is 1234 num = 1234/10 => 123   4 will be removed
//
////            step 2: num = 123 ! =0 comes inside the loop rev =4 we know  rev = 4*10 + 123%10 => 40 + 3 =43
////            num = 123/10 => 12  3 will be removed
////            step3 : number =12 ! =0 comes inside the loop rev = 43 rev = 43*10 + 12%10 => 430 + 2 = 432
////            num = 12/10 => 1  2 will be removed
////            step4: number = 1 ! =0 comes inside the loop rev = 432*10 + 1%10 => 4320 + 1=> 4321
//
//
//
//        }
//        2. String buffer class method

//        StringBuffer sb = new StringBuffer(String.valueOf(num)); // string.valueof changing the number into a string
//        StringBuffer rev = sb.reverse();
//       System.out.println("Reverse Number is:" +rev);

//        3. string builder class
        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder rev = sbl.reverse();
        System.out.println("Reverse Number is:" +rev);









    }
}
