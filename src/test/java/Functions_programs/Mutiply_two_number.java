package Functions_programs;

import java.util.Scanner;

public class Mutiply_two_number {

    public static int calculateProduct(int a , int b){
        return  a*b;

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your first number");
    int a = sc.nextInt();
    System.out.println("enter your second number");
        int b = sc.nextInt();
        System.out.println("product of two number is:"+ calculateProduct(a,b));
    }
}
