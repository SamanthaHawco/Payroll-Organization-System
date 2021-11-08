package lab4;

import java.util.Arrays;

/**
 *
 * @author Samantha Hawco 20167916
 */
public class Lab4 {

    public static void main(String[] args) {
        // Part 1
        HourlyEmployee[] staff = new HourlyEmployee[5];
        Date theDate = new Date(1, 1, 1995);
        for (int i = 0; i < 5; i++) {
            theDate.setYear(1995 + i);
            staff[i] = new HourlyEmployee("Alice", theDate.clone(), 15.0, 10 + i * 4.0);
        }

        for (HourlyEmployee temp : staff) {
            System.out.println(temp.toString());
        }

        Arrays.sort(staff);
        System.out.println("-------------------------");

        for (HourlyEmployee temp : staff) {
            System.out.println(temp.toString());
        }

        HourlyEmployee clonedEmployee = (HourlyEmployee) staff[0].clone();
        System.out.println(clonedEmployee);

        
        // Part 2
        System.out.println("\n");
        Invoice[] bills = new Invoice[5];
        for(int i = 0; i < 5; i++){
        	bills[i] = new Invoice("Company" + (5-i), 300.0 - 50.0*i); 
        }
        
        for(Invoice temp : bills){
        	System.out.println(temp.toString());
        }
        
        Arrays.sort(bills);
        System.out.println("-------------------------------");
        
        for(Invoice temp : bills){
        	System.out.println(temp.toString());
        }
        
        System.out.println("\n");
        // Part 3
        for(Payable temp : (Payable[])bills){
        	temp.printPayment();
        }
        
        // Part 4
        Payable[] pending = new Payable[10];
        
        for(int i = 0; i < 5; i++){
        	pending[i] = (Payable)bills[i];
        }
        
        for(int i = 0; i < 5; i++){
        	pending[i+5] = (Payable)staff[i];
        }
        
        for(Payable temp : pending){
        	temp.printPayment();
        }
         
    }
}
