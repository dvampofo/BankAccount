package eecs1022.lab4application;

/**
 * Created by davidampofo on 2018-02-22.
 */

public class BankTester {

    public static void main(String[] args)
    {
        Bank b = new Bank();

        Client c1 = new Client("John", 40);
        Client c2 = new Client("Jane", 70);
        Client c3 = new Client("Sophia", 85.5);

        // Bridging Bank and Client
        b.setC1(c1);
        b.setC2(c2);
        b.setC3(c3);


        //          DEPOSIT
//        b.serve("Deposit", " ", "Client 1", 50);
//        b.serve("Deposit", " ", "Client 2", 65);
//        b.serve("Deposit", " ", "Client 3", 45.50);

        //          WITHDRAW
//        b.serve("Withdraw", " ", "Client 1", 15);
//        b.serve("Withdraw", " ", "Client 2", 25.4);
//        b.serve("Withdraw", " ", "Client 3", 20);

        //          TRANSFER
//        b.serve("Transfer", "Client 1", "Client 2", 20);
//        b.serve("Transfer", "Client 1", "Client 3", 20);

//        b.serve("Transfer", "Client 2", "Client 1", 20);
//        b.serve("Transfer", "Client 2", "Client 3", 20);

//        b.serve("Transfer", "Client 3", "Client 1", 20);
        b.serve("Transfer", "Client 3", "Client 2", 20);


        System.out.println(b.toString());

    }

}
