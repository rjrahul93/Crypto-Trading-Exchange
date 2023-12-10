package coinlist;

import java.util.Scanner;

//PolyMorphism - method Overriding

public class buyDoge extends list {

     double dogeBalance;
     double userBalance; 
     

    {
        System.out.println("=======================================");
        System.out.println("Doge current Price :" +Doge +"$");
    }

    public double getDoge(){
        return dogeBalance;

    }

     public double getBal(){
        return userBalance;

    }

    public void setDoge(double Doge, double Bal)
    {
        dogeBalance=Doge;
        userBalance=Bal;

    }
   

    public void doge(){
        
        System.out.println("Doge buy method executed");
        System.out.println("Your available Balance is :" +userBalance +"$");
        System.out.println("Please enter Amount to Buy Doge :");
        double a=choice.nextDouble();

           if(a<=userBalance)
           {
           // System.out.println("User balance :" +userBalance);
            userBalance = userBalance-a;
            double b=a/Doge;
            this.dogeBalance=this.dogeBalance+b;
            System.out.println("=======================================");
            System.out.println("Your Doge Balance is :" +dogeBalance);
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


