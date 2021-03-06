/*
Description:
* Suppose that the cost of printing large photos (24 x 36) is calculated as follows:
- Service charge $3.00
- $7.99 per copy for the first 10 copies
- $7.25 for each addition copy
* Write a program that prompts the user to enter the number of copies to print, then calculates and prints the amount due.
 */

import javax.swing.JOptionPane;

public class PrintingService {
    public static void main(String[] args) {


        //declare variables
        int copies;
        double cost = 0.0;
        String output;

        //define constants
        final double BASE_SERVICE_CHARGE = 3.00;
        final int BASE_COPIES = 10;
        final double BASE_COPY_CHARGE = 7.99;
        final double ADDITIONAL_COPY_CHARGE = 7.25;

        //input
        copies = Integer.parseInt(
                JOptionPane.showInputDialog("Enter the number of copies: ")
        );
        //calculate
        if (copies <= 0) {
            JOptionPane.showMessageDialog(null, "Invalid input.\nCopies must be greater than 0.");
        } else {
            if (copies > BASE_COPIES) {
                cost = BASE_SERVICE_CHARGE + BASE_COPIES * BASE_COPY_CHARGE +
                               (copies - BASE_COPIES) * ADDITIONAL_COPY_CHARGE;
            } else {
                cost = BASE_SERVICE_CHARGE + BASE_COPIES * BASE_COPY_CHARGE;
            }
            //output
            output = "Number of Copies: " + copies + "\n" +
                             "Cost: $" + String.format("%.2f", cost);
            JOptionPane.showMessageDialog(null, output);
        }


    }
}
