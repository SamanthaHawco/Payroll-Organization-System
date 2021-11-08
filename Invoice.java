/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Samantha Hawco 20167916S
 */
public class Invoice implements Comparable<Invoice>, Payable {

    private String companyName;
    private double amount;

    public Invoice() {
        companyName = "No Name";
        amount = 0.0;
    }

    public Invoice(String theName, Double theAmount) {
        companyName = theName;
        if (theName == null || theAmount < 0) {
            System.out.println("Fatal Error creating Invoice.");
            System.exit(0);
        }
        companyName = theName;
        amount = theAmount;
    }

    public double amountToPay(){
        return amount;
    }

    public void printPayment(){
        System.out.println("Payment information for an invoice. Company name: " + this.getName() + "; payment " + this.amountToPay() + "." );
    }

    /**
     * Used by Array.sort to sort in ascending amounts
     *
     * @param bill
     * @return int: negative, zero, or positive for this being smaller, same, or
     * larger respectively
     */
    public int compareTo(Invoice bill) {
        if (this.amount == bill.getAmount()) {
            return 0;
        } else if (this.amount < bill.getAmount()) {
            return -1;
        } else {
            return 1;
        }
    }

    public String getName() {
        return companyName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setName(String newName) {
        if (newName == null) {
            System.out.println("Fatal Error setting invoice name.");
            System.exit(0);
        } else {
            companyName = newName;
        }
    }

    public void setAmount(Double newAmount) {
        if (newAmount < 0) {
            System.out.println("Fatal Error setting invoice name.");
            System.exit(0);
        } else {
            amount = newAmount;
        }
    }

    public String toString() {
        return companyName + " is owed " + amount;
    }

}
