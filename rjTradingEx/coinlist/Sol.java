package coinlist;

import java.util.Scanner;

//constructor overloading
//constructor chainning

class buySol extends list {

    static double solBalance;
    static double userBalance;

    Scanner choice = new Scanner(System.in);

    public buySol()
    {
        System.out.println("Sol current Price :" +Sol ); //first way to use static var in non static context such as directly
       
    }

    public buySol(double userBal)
    {
        this();
        buySol.userBalance=userBal; //second way to use static var in non static context with the help of class name
       
    }

   public buySol(double sol, double userBal){

        this(userBal); //constructor chainning
        this.solBalance=sol;  //third way to use static var in non static context with the help of this keyword
        System.out.println("=======================================");
        System.out.println("Please enter Amount to Buy Sol :");
        double a=choice.nextDouble();

           if(a<=userBalance)
           {
           // System.out.println("User balance :" +userBalance);
            userBalance = userBalance-a;
            double b=a/Sol;
            solBalance=solBalance+b;
            System.out.println("=======================================");
            System.out.println("Your Sol Balance is :" +solBalance);
            System.out.println("Updated Balance :" +userBalance); 
           }
           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("Your available Balance is :" +userBalance +"$");
            System.out.println("=======================================");
           
           }
    
}
        public void buySol(double sol, double userBal)
        {
          buySol ref= new buySol(sol, userBal);
        }

}

class sellSol extends buySol
{

    public sellSol()
    {
        System.out.println("Available ADA Balance: "+this.solBalance);
       
    }

    public sellSol(double userBal)
    {
        this();
        sellSol.userBalance=userBal;
       
    }

   public sellSol(double sol, double userBal){

        this(userBal); //constructor chainning
        solBalance=sol;
        System.out.println("=======================================");
        System.out.println("Available Matic in your Wallet :" +solBalance);
        System.out.println("Please enter Amount to sell ADA :");
        double a=choice.nextDouble();

           if(a<=solBalance)
           {
            solBalance = solBalance-a;
            double b=a*Sol;
            userBalance=userBalance+b;
            System.out.println("=======================================");
            System.out.println("Your ADA Balance is :" +solBalance);
            System.out.println("Updated Balance :" +userBalance); 
           }
           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("Your available Balance is :" +solBalance);
            System.out.println("=======================================");
           
           }
    
}
        public void sellSol(double sol, double userBal)
        {
          buySol ref= new sellSol(sol, userBal); //upcasting
        }

}


class sendSol extends sellSol
{
    
    public sendSol()
    {
        System.out.print("Available Balance: ");
       
    }

    public sendSol(double userBal)
    {
        this();
        userBalance=userBal;
       
    }

   public sendSol(double sol, double userBal){

        this(userBal); //constructor chainning
        solBalance=sol;
        System.out.println(userBal);
        System.out.println("=======================================");
        System.out.println("Please enter Amount to send Sol :");
        double a=choice.nextDouble();

           if(a<=solBalance)
           {
            System.out.println("Enter correct Sol wallet address :");
            String wAddress=choice.nextLine(); //incase of taking double input then remove me
            String wAddress1=choice.nextLine();
            solBalance = solBalance-a;
            System.out.println(a + " Sol successfully send to " +wAddress1);
            System.out.println("=======================================");
            System.out.println("You Sol Balance is :" +solBalance);
            System.out.println("Updated Balance :" +userBalance);
           }
           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("Your available Balance is :" +solBalance);
            System.out.println("=======================================");
           
           }
}
        public void sendSol(double sol, double userBal)
        {
          sellSol ref= new sendSol(sol, userBal); //upcasting
        }

}


public class Sol extends sendSol {

    public double getSol(){
        return solBalance;

    }

    public double getbal(){
        return userBalance;
    }
}


