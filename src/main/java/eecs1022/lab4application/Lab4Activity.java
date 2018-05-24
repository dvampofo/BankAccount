package eecs1022.lab4application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Lab4Activity extends AppCompatActivity {

    Bank b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4);
        b = new Bank();
    }

    //                                    S P I N N E R

    /*
        First helper method. Changes the content of the output TextView
        Will display what the Bank is in the GUI.

        Given the id (set in the View xml file) of a TextView
        we change its contents to 'newContents'
    */
    private void setContentsOfTextView(int id, String newContents)
    {
        View view = findViewById(id);
        TextView textView= (TextView) view;
        textView.setText(newContents);
    }

    /*
        This helper method will allow you to select the option in the
        the spinner.
    */
    private String getItemSelected(int id)
    {
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }

    //                               C O N T R O L L E R

    /*
        Helper method for retrieving contents from GUI.

        Given the id(set in the View xml file) of a TextView,
        we change its contents to "newContents".
    */
    private String getInputOfTextField(int id)
    {
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    // When the button is clicked, it retrieves GUI inputs and sends it to the Bank class
    public void buttonCreateAccount(View view)
    {
        // Get client names and balances from textFields
        String textName1 = getInputOfTextField(R.id.inputClient1);
        String textName2 = getInputOfTextField(R.id.inputClient2);
        String textName3 = getInputOfTextField(R.id.inputClient3);

        String inputBalance1 = getInputOfTextField(R.id.inputClient1Balance);
        String inputBalance2 = getInputOfTextField(R.id.inputClient2Balance);
        String inputBalance3 = getInputOfTextField(R.id.inputClient3Balance);

        // Converting string balance into double balance
        double balance1 = Double.parseDouble(inputBalance1);
        double balance2 = Double.parseDouble(inputBalance2);
        double balance3 = Double.parseDouble(inputBalance3);

        // Creating new Client objects
        Client c1 = new Client(textName1, balance1);
        Client c2 = new Client(textName2, balance2);
        Client c3 = new Client(textName3, balance3);

        // Connecting Bank class to Client class
        b.setC1(c1);
        b.setC2(c2);
        b.setC3(c3);

        // Output shown to GUI
        setContentsOfTextView(R.id.labelOutcome, b.toString());
    }
    // When button is clicked
    public void buttonTransaction(View view)
    {
        // SPINNERS
        String spinnerState1 = getItemSelected(R.id.spinnerService);
        String spinnerState2 = getItemSelected(R.id.spinnerFromAccount);
        String spinnerState3 = getItemSelected(R.id.spinnerToAccount);

        // Amount of money for user to: Deposit, Withdraw or Transfer
        String cashAmount = getInputOfTextField(R.id.inputAmount);
        double amount = Double.parseDouble(cashAmount);

        // Select service and send money to Clients
        b.serve(spinnerState1, spinnerState2, spinnerState3, amount);

        // Output show to GUI
        setContentsOfTextView(R.id.labelOutcome, b.toString());
    }
}
