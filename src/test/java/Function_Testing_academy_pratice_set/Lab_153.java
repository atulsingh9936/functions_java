package Function_Testing_academy_pratice_set;

public class Lab_153 {
    public static void main(String[] args) {
        // Non return with no parameter
        saySomethingPlease();
        // non return with parameter
        SayHelloToyou("pramod");
        // return with no parameter
        sumOfTwoBad();

        // return with parameter
      int sum=  sumOfTwoGood(3,4);
        System.out.println();
    }

    static int sumOfTwoGood(int a, int b) {
        return a+b;
    }

    static int sumOfTwoBad() {
        int sum;
         System.out.println( sum=3+4);
         return sum;
    }

    static void SayHelloToyou(String name) {
        System.out.println("Hello, "+ name);
    }

    static void saySomethingPlease() {
         System.out.println("Non return with no parameter");
    }
}
