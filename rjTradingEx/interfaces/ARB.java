package interfaces;
import java.util.Scanner;

public class ARB implements ArbCoin {
    double arbBal, userBal;
    double txn=0;
    double Arb=0.95;
    Scanner choice = new Scanner(System.in);

    public double buyARB(double arbBalance,double userBalance)
    {
        System.out.println("Your available Balance is :" +userBalance +"$");
        System.out.println("Please enter Amount to Buy ARB :");
        double a=choice.nextDouble();

           if(a<=userBalance)
           {
           // System.out.println("User balance :" +userBalance);
            this.userBal = userBalance-a;
            double b=a/Arb;
            arbBal=arbBalance+b;
            txn=b;
            System.out.println("=======================================");
            System.out.println("Your ARB Balance is :" +arbBal);
            System.out.println("Updated Balance :" +userBal +"$");
            return userBal;

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("Your available Balance is :" +userBalance +"$");
            System.out.println("=======================================");
            txn=0;
             return userBal;
           }
        

    }

    public double sellARB(double arbBalance,double userBalance)
    {
        
    System.out.println("Available ARb in your Wallet :" +arbBalance);
    System.out.println("Please enter Amount to sell ARB :");
    double a=choice.nextDouble();

       if(a<=arbBalance)
       {
       // System.out.println("User balance :" +userBalance);
        this.arbBal = arbBalance-a;
        double b=a*Arb;
        userBal=userBalance+b;
        txn=a;
        System.out.println("=======================================");
        System.out.println("Your ARB Balance is :" +arbBal);
        System.out.println("Updated Balance :" +userBal +"$");
        return arbBal;

       }

       else{
        System.out.println("=======================================");
        System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
        System.out.println("=======================================");
        txn=0;
        return arbBal;
       }

    }
    public double sendARB(double arbBalance,double userBalance)
    {
        System.out.println("Available ARB in your Wallet :" +arbBalance);
        System.out.println("Please enter ARB Amount you want to send :");
        double a=choice.nextDouble();
    
           if(a<=arbBalance)
           {
           // System.out.println("User balance :" +userBalance);
            System.out.println("Enter correct ARB wallet address :");
            String wAddress=choice.nextLine(); //incase of taking double input then remove me
            String wAddress1=choice.nextLine();
            this.arbBal = arbBalance-a;
            txn=a; //history
            System.out.println(a + " ARB successfully send to " +wAddress1);
            System.out.println("=======================================");
            System.out.println("You ARB Balance is :" +arbBal);
            System.out.println("Updated Balance :" +userBal +"$");
            return arbBal;
    
           }
    
           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("=======================================");
            txn=0;
            return arbBal;
           }

    }

    public double getArb(){
        return arbBal;

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
        System.out.println("ARB current Price :" +Arb +"$");
        return "";
    
    }
    
}
