package Function_Testing_academy_pratice_set;

public class sum_of_two_with_parameter {
    public static void main(String[] args) {
      int r1=  sum_of_two_number(4,5);
        System.out.println(r1);
      int r2=  sum_of_two_number(6,8);
        System.out.println(r2);
        String r3 =sum_of_two_number("pramod",5);
        System.out.println(r3);


    }

    static int sum_of_two_number(int a, int b){
        return a+b;
    }
    static String sum_of_two_number(String a, int b){
        return a+b;
    }
}
