package coinlist;

import java.util.Scanner;

public class sendXRP extends sellXRP {


     public static void XRP(){
        System.out.println("=======================================");
        System.out.println("send method executed");
        System.out.println("Available XRP in your Wallet :" +xrpBalance);
        System.out.println("Please enter XRP Amount you want to send :");
        Scanner choice = new Scanner(System.in);
        double a=choice.nextDouble();

           if(a<=xrpBalance)
           {
           // System.out.println("User balance :" +userBalance);
            System.out.println("Enter correct XRP wallet address :");
            String wAddress=choice.nextLine(); //incase of taking double input then remove me
            String wAddress1=choice.nextLine();
            xrpBalance = xrpBalance-a;
            System.out.println(a + " XRP successfully send to " +wAddress1);
            System.out.println("=======================================");
            System.out.println("You XRP Balance is :" +xrpBalance);
            System.out.println("Updated Balance :" +userBalance +"$");

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("=======================================");
           }
    }

}

