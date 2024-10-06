package Functions_programs;

import java.util.Scanner;

public class Functions_sum_of_two {

    public static int CalculateSum(int a,int b){
        int sum= a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int a = sc.nextInt();
        System.out.println("enter Second number:");
        int b = sc.nextInt();

        int sum = CalculateSum(a,b);
        System.out.println("the sum of elements is:"+ sum);

    }
}
