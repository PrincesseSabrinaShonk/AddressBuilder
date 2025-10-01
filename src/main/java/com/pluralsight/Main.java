package com.pluralsight;

import java.util.Scanner;
 public class Main {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         // let's define the variable
         System.out.println("Please provide the following information:");

         // collect customer full name
         System.out.print(" Enter Full name: ");
         String fullName = scanner.nextLine();

         // collect billing address information
         System.out.print("Billing Street: ");
         String billingStreet = scanner.nextLine();

         System.out.print("Billing City: ");
         String billingCity = scanner.nextLine();

         System.out.print("Billing State: ");
         String billingState = scanner.nextLine();

         System.out.print("Billing Zip: ");
         String billingZip = scanner.nextLine();

         // collect shipping address information
         System.out.print("Shipping Street: ");
         String shippingStreet = scanner.nextLine();

         System.out.print("Shipping City: ");
         String shippingCity = scanner.nextLine();

         System.out.print("Shipping State: ");
         String shippingState = scanner.nextLine();

         System.out.print("Shipping Zip: ");
         String shippingZip = scanner.nextLine();


         StringBuilder info = new StringBuilder();

         info.append("\n").append(fullName).append("\n");
         info.append("Billing Address:\n");
         info.append(billingStreet).append("\n");
         info.append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n");
         info.append("Shipping Address:\n");
         info.append(shippingStreet).append("\n");
         info.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip);

         // Print the formatted addresses
         System.out.println(info.toString());

     }
}





