package coinlist;

import java.util.Scanner;

//PolyMorphism

public class buyXRP extends list {

   

     static double xrpBalance;
     static double userBalance; 
     Scanner choice = new Scanner(System.in);

    {
        System.out.println("=======================================");
        System.out.println("XRP current Price :" +XRP +"$");
    }

    public double getXRP(){
        return xrpBalance;

    }

     public double getBal(){
        return userBalance;

    }

    public void setXRP(double xrp, double Bal)
    {
        xrpBalance=xrp;
        userBalance=Bal;

    }

   

    
   

   

    public static void XRP(){
        
        System.out.println("XRP buy method executed");
        System.out.println("Your available Balance is :" +userBalance +"$");
        System.out.println("Please enter Amount to Buy XRP :");
        Scanner choice = new Scanner(System.in);
        double a=choice.nextDouble();

           if(a<=userBalance)
           {
           // System.out.println("User balance :" +userBalance);
            userBalance = userBalance-a;
            double b=a/XRP;
            xrpBalance=xrpBalance+b;
            System.out.println("=======================================");
            System.out.println("Your XRP Balance is :" +xrpBalance);
            System.out.println("Updated Balance :" +userBalance +"$");

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("Your available Balance is :" +userBalance +"$");
            System.out.println("=======================================");
           }
           
    }

}


