package eecs1022.lab4application;

/**
 * Created by davidampofo on 2018-02-22.
 */

public class Client {

    //                               A  T  T  R  I  B  U  T  E  S

    //  Client name
    String name;

    // Clients balance
    double balance  = 0;

    //                         C   O   N   S   T   R   U   C   T   O   R
    public Client(String clientName, double clientBalance)
    {
        this.name   = clientName;
        this.balance = clientBalance;
    }

    //                                S   E   R   V   I   C   E

    // DEPOSIT
    void deposit(double units)
    {
        this.balance += units;
    }
    // WITHDRAW
    void withdraw(double units)
    {
        this.balance -= units;
    }

    void transfer(double units)
    {
        /*
            Empty because transfer is simply:
            c#.withdraw     and
            c#.deposit
        */
    }

    @Override
    public String toString() {

        String stringConvert = String.format("%.2f", this.balance);

        String s = "";

        s+= "Client " + this.name + " has balance of $" + stringConvert;

        return s;
    }
}
