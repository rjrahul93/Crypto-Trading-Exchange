package coinlist;
import java.util.Scanner;

//Method overLoading
//Method Recursion
//Widening

public class Matic extends list {

    double maticBalance;

    {
        System.out.println("Matic current Price :" +Matic +"$");

    }

    public double getMatic(){
        return maticBalance;

    }

    public double getbal(){
        return userBalance;
    }
    

 // To achieve method overloading we created more than one method with same name but diff formal argument

     public void buyMatic(float matic, double userBal)
    {
        maticBalance=matic; //widening (converting float datatype into double)
        buyMatic(userBal); //recursive method

    }

    public void buyMatic(double userBal)
    {
        userBalance=userBal;
        buyMatic();
    }

    public void buyMatic(){
        System.out.println("=======================================");
        System.out.println("Please enter Amount to Buy Matic :");
        double a=choice.nextDouble();

           if(a<=userBalance)
           {
           // System.out.println("User balance :" +userBalance);
            userBalance = userBalance-a;
            double b=a/Matic;
            this.maticBalance=this.maticBalance+b;
            System.out.println("=======================================");
            System.out.println("Your Matic Balance is :" +maticBalance);
            System.out.println("Updated Balance :" +userBalance); 
           }
           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("Your available Balance is :" +userBalance +"$");
            System.out.println("=======================================");
           
           }
            
    }
   





 // To achieve method overloading we created more than one method with same name but diff formal argument

    public void sellMatic(float matic, double userBal)
    {
        maticBalance=matic; //widening
        sellMatic(userBal);

    }

    public void sellMatic(double userBal)
    {
        userBalance=userBal;
        sellMatic();
    }

    public void sellMatic(){
        System.out.println("=======================================");
        System.out.println("Available Matic in your Wallet :" +maticBalance);
        System.out.println("Please enter Amount to sell Matic :");
        double a=choice.nextDouble();

           if(a<=maticBalance)
           {
           // System.out.println("User balance :" +userBalance);
            this.maticBalance = this.maticBalance-a;
            double b=a*Matic;
            userBalance=userBalance+b;
            System.out.println("=======================================");
            System.out.println("Your Matic Balance is :" +maticBalance);
            System.out.println("Updated Balance :" +userBalance);

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("=======================================");
           }   
    }




     public void sendMatic(float matic, double userBal)
    {
        maticBalance=matic; //widening
        sendMatic(userBal);

    }

    public void sendMatic(double userBal)
    {
        userBalance=userBal;
        sendMatic();
    }

    public void sendMatic(){

        System.out.println("=======================================");
        System.out.println("Available Matic in your Wallet :" +maticBalance);
        System.out.println("Please enter Matic Amount you want to send :");
        double a=choice.nextDouble();

           if(a<=maticBalance)
           {
           // System.out.println("User balance :" +userBalance);
            System.out.println("Enter correct Matic wallet address :");
            String wAddress=choice.nextLine(); //incase of taking double input then remove me
            String wAddress1=choice.nextLine();
            this.maticBalance = this.maticBalance-a;
            System.out.println(a + " Matic successfully send to " +wAddress1);
            System.out.println("=======================================");
            System.out.println("You Matic Balance is :" +maticBalance);
            System.out.println("Updated Balance :" +userBalance);

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("=======================================");
           }
    }

}

