import java.awt.*;
import java.util.Date;
public class Hello_World {
    public static void main(String[] args) {
//        Data types
//        1. primitive eg. int, float, boolean
//        2. reference
        int age = 21;
        System.out.println(age);
//        byte range [-128,127] it is used for small value
//        int range [-2B, 2B] B- Billions
//        short range [-32k, 32k]
//        long range [more than 2B] add keyword L or l to denote as long
        byte age1 = 21;
        System.out.println(age1);
//        float (add keyword F or f)
        float mark = 95.5f;
        System.out.println(mark);
//        double for more decimal ponits
        double mark1 = 95.6666666666;
        System.out.println(mark1);
//        boolean
        boolean presence = true;
        System.out.println(presence);
//        char takes 2byte
        char grade = 'A';
        System.out.println(grade);
// Task 1: count how many characters in code io and save in a variable and print the variable
        String str = "Code io";
        int count = str.length();
        System.out.println(count);

//        Reference is that we assign value for p1 & p2 then make it equal p1 = p2 , then change the value of p1
//        it will change p2 also. but in primitive they don't change.
        Date today = new Date();
        System.out.println(today);

        Point p1 = new Point(5, 7);
        Point p2 = p1;

        System.out.println(p2);
        p1.x = 7;

        System.out.println(p1);
        System.out.println(p2);

//      operators
        int a = 5;
        int b = 10;
//        Type casting => converting from one topic another.
//        implicit type casting => automatically changes lower data type to higher data type.
//        explicit type casting => manually changing.
//        to get answer in point change to float or double.
        float f = (float) a / (float) b;

        System.out.println(f);

//        uninary operator
        int c = 5;
//        post increment
        System.out.println(c++);
        System.out.println(c);
//        pre increment
        System.out.println(++c);
        System.out.println(c);

//        relational operators
//        > , < , ==, !=, >=, <=
        int d = 10;
        int e = 10;
        System.out.println(d == e);

//        logical operators
//        ! (not), || (OR), && (and)
//        boolean i = true;
//        boolean j = false;
//        System.out.println(!i);
//        System.out.println(!j);

//        operator precedance
//        */, +-
//       1.Not, 2.And, 3.OR

//        conditional statement
//        char attendance = 'P';
//
//        if (attendance == 'P'){
//            System.out.println("Attended classes");
//        } else if (attendance == 'O') {
//            System.out.println("On-Duty");
//        }
//        else {
//            System.out.println("Not Attended classes");
//        }

//        Nested if, if-else, if-elseif-else

//        Switch case
        char attendance = 'O';
        switch (attendance) {
            case 'P':
                System.out.println("Attended classes");
                break;
            case 'O':
                System.out.println("On-Duty");
                break;
            case 'A':
                System.out.println("Absent");
                break;
            default:
                System.out.println("School leave");
        }

//        iterative statements
//        for loop
//        for (int i = 0; i < 5; i++){
//            System.out.println("jeeva");
//        }

//        sum of n natural numbers program
//        int n = 5;
//        int sum = 0;
//        for (int i = 1; i <= n; i++){
//            sum += i;
//        }
//        System.out.println("Sum of n Numbers:" + sum);
//

//        Task 2: factorial

//        int n = 5;
//        int fac = 1;
//        for (int i = 1; i <= n; i++){
//            fac *= i;
//        }
//        System.out.println("fac of n Numbers:" + fac);


//      while loop
//        entry controlled loop because it check the condition starting itself
      /*  int i =0;
        int sum = 0;
        while (i<=5){
            sum += i;
            i++;
        }
        System.out.println(sum);
       */

//        do-while
//        in do-while we don't verify the condition first
//        exit-controlled loop because it check the condition at last.
        /* int i = 1;
        int sum = 0;
        int n = 5;
        do{
            sum+= i;
            i++;
        } while (i<=n);
        System.out.println(sum);

         */

//        jump statements
//        break, continue (it skips the specify part)
     /*   for (int i = 1; i<=10; i++){
            if(i==5){
                continue;
            }

            System.out.println(i);
        }

      */
//        nested for loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + " " + j);
            }
        }

//        Array
//        to store collection of items.
//        new keyword is used to tell that allocate memory for this rollno.
       /*
       int[] rollno = new int[50];
        for (int i = 0; i < 5; i++) {
            System.out.println(rollno[i]);
        }

        */

//        2D array
//        2 rows 2 column
//        to print like matrix remove ln from (system.out.println) and then add another sout after the loop.
        int[][] matrix = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;
        for (int i = 0; i < 2; i++){
            for (int j = 0; j <2; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        

    }

}
