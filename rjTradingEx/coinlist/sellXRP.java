package coinlist;

import java.util.Scanner;

public class sellXRP extends buyXRP{

    public static void XRP(){

        System.out.println("=======================================");
        System.out.println("XRP sell method executed");
        System.out.println("Available XRP in your Wallet :" +xrpBalance);
        System.out.println("Please enter Amount to sell XRP :");
        Scanner choice = new Scanner(System.in);
        double a=choice.nextDouble();

           if(a<=xrpBalance)
           {
         
            xrpBalance = xrpBalance-a;
            double b=a*XRP;
            userBalance=userBalance+b;
            System.out.println("=======================================");
            System.out.println("Your XRP Balance is :" +xrpBalance);
            System.out.println("Updated Balance :" +userBalance +"$");

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("=======================================");
           }
    }

}
