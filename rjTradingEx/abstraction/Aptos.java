package abstraction;
import java.util.Scanner;

// 1. abstraction
// 2. ArrayList
// 3. hashCode overriding
// 4. Upcasting and downcasting


public class Aptos extends AptosCoin {

    double aptosBal, userBal; 
    double Aptos=5.43;
    double txn=0;
    Scanner choice = new Scanner(System.in);

    public double buyAptos(double AptosBalance,double userBalance){
      
        System.out.println("Your available Balance is :" +userBalance +"$");
        System.out.println("Please enter Amount to Buy Aptos :");
        double a=choice.nextDouble();

           if(a<=userBalance)
           {
           // System.out.println("User balance :" +userBalance);
            this.userBal = userBalance-a;
            double b=a/Aptos;
            aptosBal=AptosBalance+b;
            txn=b;
            System.out.println("=======================================");
            System.out.println("Your Aptos Balance is :" +aptosBal);
            System.out.println("Updated Balance :" +userBal +"$");
            return userBal;

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("Your available Balance is :" +userBalance +"$");
            System.out.println("=======================================");
            txn=0;
            this.aptosBal = AptosBalance;
            userBal=userBalance;
            return userBal;
           }
           
    }

    
//sell method
public double sellAptos( double AptosBalance,double userBalance){

    
    System.out.println("Available DOT in your Wallet :" +AptosBalance);
    System.out.println("Please enter Amount to sell Aptos :");
    double a=choice.nextDouble();

       if(a<=AptosBalance)
       {
       // System.out.println("User balance :" +userBalance);
        this.aptosBal = AptosBalance-a;
        double b=a*Aptos;
        userBal=userBalance+b;
        txn=a;
        System.out.println("=======================================");
        System.out.println("Your Aptos Balance is :" +aptosBal);
        System.out.println("Updated Balance :" +userBal +"$");
        return aptosBal;

       }

       else{
        System.out.println("=======================================");
        System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
        System.out.println("=======================================");
        txn=0;
        aptosBal = AptosBalance;
        userBal=userBalance;
        return aptosBal;
       }
}


//send Method

public double sendAptos(double AptosBalance, double userBalance){
   
    System.out.println("Available Aptos in your Wallet :" +AptosBalance);
    System.out.println("Please enter Aptos Amount you want to send :");
    double a=choice.nextDouble();

       if(a<=AptosBalance)
       {
       //System.out.println("User balance :" +userBalance);
        System.out.println("Enter correct Aptos wallet address :");
        String wAddress=choice.nextLine(); //incase of taking double input then remove me
        String wAddress1=choice.nextLine();
        aptosBal = AptosBalance-a;
        txn=a; //history
        System.out.println(a + " Aptos successfully send to " +wAddress1);
        System.out.println("=======================================");
        System.out.println("You Aptos Balance is :" +aptosBal);
        System.out.println("Updated Balance :" +userBal +"$");
        return aptosBal;

       }

       else{
        System.out.println("=======================================");
        System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
        System.out.println("=======================================");
        txn=0;
        aptosBal = AptosBalance;
        userBal=userBalance;
        return aptosBal;
       }
}


//abc 

    public double getAptos(){
        return aptosBal;

    }

     public double getBal(){
        return userBal;

    }

    @Override
    public int hashCode()
    {
        return  (int) txn;
    }

    @Override
     public String toString() //overriding toString method of object class
    {
        System.out.println("Aptos current Price :" +Aptos +"$");
        return "";
    
    }
    
}
