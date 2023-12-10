package interfaces;

import java.util.Scanner;

public class Dash implements buyDash, sellDash, sendDash {

    double dashBalance;
    double userBalance; 
    double Dash=28;
    double txn;
    Scanner choice = new Scanner(System.in);

    public void buyDash(){
        System.out.println("Your available Balance is :" +userBalance +"$");
        System.out.println("Please enter Amount to Buy Dash :");
        double a=choice.nextDouble();

           if(a<=userBalance)
           {
           // System.out.println("User balance :" +userBalance);
            this.userBalance = this.userBalance-a;
            double b=a/Dash;
            dashBalance=dashBalance+b;
            txn=b;
            System.out.println("=======================================");
            System.out.println("Your Dash Balance is :" +dashBalance);
            System.out.println("Updated Balance :" +userBalance +"$");

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("Your available Balance is :" +userBalance +"$");
            System.out.println("=======================================");
           }
           
    }

    
//sell method
public void sellDash(){

   
    System.out.println("Available Dash in your Wallet :" +dashBalance);
    System.out.println("Please enter Amount to sell Dash :");
    double a=choice.nextDouble();

       if(a<=dashBalance)
       {
       // System.out.println("User balance :" +userBalance);
        this.dashBalance = this.dashBalance-a;
        double b=a*Dash;
        userBalance=userBalance+b;
        txn=a;
        System.out.println("=======================================");
        System.out.println("Your Dash Balance is :" +dashBalance);
        System.out.println("Updated Balance :" +userBalance +"$");

       }

       else{
        System.out.println("=======================================");
        System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
        System.out.println("=======================================");
       }
}


//send Method

public void sendDash(){
   
    System.out.println("Available Dash in your Wallet :" +dashBalance);
    System.out.println("Please enter Dash Amount you want to send :");
    double a=choice.nextDouble();

       if(a<=dashBalance)
       {
       // System.out.println("User balance :" +userBalance);
        System.out.println("Enter correct Dash wallet address :");
        String wAddress=choice.nextLine(); //incase of taking double input then remove me
        String wAddress1=choice.nextLine();
        this.dashBalance = this.dashBalance-a;
        txn=a;
        System.out.println(a + " Dash successfully send to " +wAddress1);
        System.out.println("=======================================");
        System.out.println("You Dash Balance is :" +dashBalance);
        System.out.println("Updated Balance :" +userBalance +"$");

       }

       else{
        System.out.println("=======================================");
        System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
        System.out.println("=======================================");
       }
}


//abc 

    public double getDash(){
        return dashBalance;

    }

     public double getBal(){
        return userBalance;

    }

    public void setDash(double Dash, double Bal)
    {
        dashBalance=Dash;
        userBalance=Bal;

    }

    @Override
    public int hashCode()
    {
        return  (int) txn;
    }

    @Override
     public String toString() //overriding toString method of object class
    {
        System.out.println("Dash current Price :" +Dash +"$");
        return "";
    
    }
    
}

