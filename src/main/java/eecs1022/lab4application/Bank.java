package eecs1022.lab4application;

/**
 * Created by davidampofo on 2018-02-22.
 */

public class Bank {

    //                               A  T  T  R  I  B  U  T  E  S

    Client c1;
    Client c2;
    Client c3;

    //                         C   O   N   S   T   R   U   C   T   O   R

    Bank()
    {

    }

    // Takes input from Spinners and Amount and triggers the appropriate response
    void serve(String service, String from, String to, double amount)
    {
        //                         D   E   P   O   S   I   T

        if(service.equals("Deposit")       && to.equals("Client 1"))
        {
            c1.deposit(amount);
        }
        else if (service.equals("Deposit") && to.equals("Client 2"))
        {
            c2.deposit(amount);
        }
        else if (service.equals("Deposit") && to.equals("Client 3"))
        {
            c3.deposit(amount);
        }

        //                      W   I   T   H   D   R   A   W

        else if (service.equals("Withdraw") && from.equals("Client 1"))
        {
            c1.withdraw(amount);
        }
        else if (service.equals("Withdraw") && from.equals("Client 2"))
        {
            c2.withdraw(amount);
        }
        else if (service.equals("Withdraw") && from.equals("Client 3"))
        {
            c3.withdraw(amount);
        }

        //                     T   R   A   N   S   F   E   R

        // From CLIENT 1
        else if (service.equals("Transfer") && from.equals("Client 1") && to.equals("Client 2"))
        {
            c1.withdraw(amount);
            c2.deposit(amount);
        }
        else if (service.equals("Transfer") && from.equals("Client 1") && to.equals("Client 3"))
        {
            c1.withdraw(amount);
            c3.deposit(amount);
        }

        // From CLIENT 2:
        else if (service.equals("Transfer") && from.equals("Client 2") && to.equals("Client 1"))
        {
            c2.withdraw(amount);
            c1.deposit(amount);
        }
        else if (service.equals("Transfer") && from.equals("Client 2") && to.equals("Client 3"))
        {
            c2.withdraw(amount);
            c3.deposit(amount);
        }

        // From CLIENT 3:
        else if (service.equals("Transfer") && from.equals("Client 3") && to.equals("Client 1"))
        {
            c3.withdraw(amount);
            c1.deposit(amount);
        }
        else if (service.equals("Transfer") && from.equals("Client 3") && to.equals("Client 2"))
        {
            c3.withdraw(amount);
            c2.deposit(amount);
        }
    }

    // How do you connect the Bank to the Client???:
    void setC1(Client c)
    {
        this.c1 = c;
    }

    void setC2(Client c)
    {
        this.c2 = c;
    }

    void setC3(Client c)
    {
        this.c3 = c;
    }

    @Override
    public String toString()
    {
        // Use this to print out the balances of every account
        String s = "";

        if(this.c1 == null)
        {
            s += "c1: null";
        }
        else if (this.c2 == null)
        {
            s+= "c2: null";
        }
        else if (this.c3 == null)
        {
            s+= "c3: null";
        }
        else {
            s += this.c1 + "\n" + this.c2 + "\n" + this.c3;
        }

        return s;
    }
}
