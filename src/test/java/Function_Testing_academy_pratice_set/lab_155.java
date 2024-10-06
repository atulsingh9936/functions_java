package Function_Testing_academy_pratice_set;

import org.w3c.dom.ls.LSOutput;

public class lab_155 {
    public static void main(String[] args) {

        //1 Friend- money
        // 1 beg -money
        System.out.println("start of the program");
      int money= giveMoneyToFriend(100);

        System.out.println(money);

      giveMoneytoBeggar();

        System.out.println("end of the program");
    }


   static void giveMoneytoBeggar() {
       System.out.println("blessing");
    }

    static int giveMoneyToFriend(int i) {
        i=i+8;
        // after 6 month
         return i;


    }
}
