package Functions_programs;

import java.util.Scanner;

public class sum_of_two {

    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("the sum of two number is :"+calculateSum(a,b));

    }
}
