/*
import java.util.Scanner;
// Create a program to calculate installment amount for per month
public class Assignment4 {
  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {
      int phonePrice = 1800; // 1800 euros
      int numberOfInstallment, installmentPerMonth;

      System.out.print("Number of installments? ");
      // get number of installments from user


      // calculate  installment amount for per month


        System.out.println("Monthly installment Amount: "+installmentPerMonth + " euros");
    }

  }
}
 */

import java.util.Scanner;
public class Assignment4 {
    public static void main(String[]args){
        Scanner Input = new Scanner(System.in);
        int phonePrice = 1800;
        int numberOfInstallment,installmentPerMonth;


        System.out.print("Number Of Installment :");
        numberOfInstallment = Input.nextInt();
         installmentPerMonth = numberOfInstallment/phonePrice;

        System.out.println("Monthly Installment Amount : " +installmentPerMonth +" euros ");
    }
}
