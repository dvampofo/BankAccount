package eecs1022.lab4application;

/**
 * Created by davidampofo on 2018-02-22.
 */

public class ClientTester {


    public static void main (String[] args)
    {

        //            DEPOSIT
        Client c1 = new Client("joe", 20);
        c1.deposit(15);
        System.out.println( c1.toString());

        Client c2 = new Client("Mark", 90);
        c2.deposit(15);
        System.out.println( c2.toString());

        //           WITHDRAW
        Client c3 = new Client("Emilia", 70);
        c3.withdraw(15);
        System.out.println( c3.toString());



    }
}
