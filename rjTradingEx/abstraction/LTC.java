package abstraction;
import java.util.Scanner;

// 1. abstraction
// 2. ArrayList
// 3. hashCode overriding
// 4. Upcasting and downcasting


public class LTC extends LTCcoin {

    double ltcBalance;
    double userBalance; 
    double LTC=63;
    double txn;
    Scanner choice = new Scanner(System.in);

    public void buyLTC(){
      
        System.out.println("Your available Balance is :" +userBalance +"$");
        System.out.println("Please enter Amount to Buy LTC :");
        double a=choice.nextDouble();

           if(a<=userBalance)
           {
           // System.out.println("User balance :" +userBalance);
            this.userBalance = this.userBalance-a;
            double b=a/LTC;
            ltcBalance=ltcBalance+b;
            txn=b;
            System.out.println("=======================================");
            System.out.println("Your LTC Balance is :" +ltcBalance);
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
public void sellLTC(){

    
    System.out.println("Available DOT in your Wallet :" +ltcBalance);
    System.out.println("Please enter Amount to sell LTC :");
    double a=choice.nextDouble();

       if(a<=ltcBalance)
       {
       // System.out.println("User balance :" +userBalance);
        this.ltcBalance = this.ltcBalance-a;
        double b=a*LTC;
        userBalance=userBalance+b;
        txn=a;
        System.out.println("=======================================");
        System.out.println("Your LTC Balance is :" +ltcBalance);
        System.out.println("Updated Balance :" +userBalance +"$");

       }

       else{
        System.out.println("=======================================");
        System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
        System.out.println("=======================================");
       }
}


//send Method

public void sendLTC(){
   
    System.out.println("Available LTC in your Wallet :" +ltcBalance);
    System.out.println("Please enter LTC Amount you want to send :");
    double a=choice.nextDouble();

       if(a<=ltcBalance)
       {
       // System.out.println("User balance :" +userBalance);
        System.out.println("Enter correct LTC wallet address :");
        String wAddress=choice.nextLine(); //incase of taking double input then remove me
        String wAddress1=choice.nextLine();
        this.ltcBalance = this.ltcBalance-a;
        txn=a; //history
        System.out.println(a + " LTC successfully send to " +wAddress1);
        System.out.println("=======================================");
        System.out.println("You LTC Balance is :" +ltcBalance);
        System.out.println("Updated Balance :" +userBalance +"$");

       }

       else{
        System.out.println("=======================================");
        System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
        System.out.println("=======================================");
       }
}


//abc 

    public double getLTC(){
        return ltcBalance;

    }

     public double getBal(){
        return userBalance;

    }

    public void setLTC(double LTC, double Bal)
    {
        ltcBalance=LTC;
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
        System.out.println("LTC current Price :" +LTC +"$");
        return "";
    
    }
    
}
