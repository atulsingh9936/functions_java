package Function_Testing_academy_pratice_set;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("enter num 1");
        int num1 = sc.nextInt();
        System.out.println("enter num 2");
        int num2 = sc.nextInt();

        int r_sum= sum(num1,num2);
        System.out.println("sum is -> "+ r_sum);
        int r_sum2= sum(2,5);
        System.out.println("sum is ->"+r_sum2);
        int r_sub= sub(num1,num2);
        System.out.println("sub is -> "+r_sub);
        int r_mul= mul(num1,num2);
        System.out.println("mul is -> "+ r_mul);
    }

    static int sum( int a, int b){
        return a+b;
    }
    static int sub( int a, int b){
        return a-b;
    }
    static int mul( int a, int b){
        return a*b;
    }
}
