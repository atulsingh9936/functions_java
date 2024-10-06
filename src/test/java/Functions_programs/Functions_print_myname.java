package Functions_programs;

import java.util.Scanner;

public class Functions_print_myname {

    public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name =sc.next();
        printMyName(name);

    }
}
