package coinlist;

import java.util.Scanner;

//constructor overloading
//constructor chainning

class buyAda {

    static double adaBalance;
    static double userBalance;
    static double Ada=0.32;

    Scanner choice = new Scanner(System.in);

    public buyAda()
    {
        System.out.println("ADA current Price :" +Ada +"$"); //first way to use static var in non static context such as directly
       
    }

    public buyAda(double userBal)
    {
        this();
        buyAda.userBalance=userBal; //second way to use static var in non static context with the help of class name
       
    }

   public buyAda(double ada, double userBal){

        this(userBal); //constructor chainning
        this.adaBalance=ada;  //third way to use static var in non static context with the help of this keyword
        System.out.println("=======================================");
        System.out.println("Please enter Amount to Buy ADA :");
        double a=choice.nextDouble();

           if(a<=userBalance)
           {
           // System.out.println("User balance :" +userBalance);
            userBalance = userBalance-a;
            double b=a/Ada;
            adaBalance=adaBalance+b;
            System.out.println("=======================================");
            System.out.println("Your ADA Balance is :" +adaBalance);
            System.out.println("Updated Balance :" +userBalance); 
           }
           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("Your available Balance is :" +userBalance +"$");
            System.out.println("=======================================");
           
           }
    
}
        public void buyAda(double ada, double userBal)
        {
          buyAda ref= new buyAda(ada, userBal);
        }

}

class sellAda extends buyAda
{

    public sellAda()
    {
        System.out.println("Available ADA Balance: "+this.adaBalance);
       
    }

    public sellAda(double userBal)
    {
        this();
        sellAda.userBalance=userBal;
       
    }

   public sellAda(double ada, double userBal){

        this(userBal); //constructor chainning
        adaBalance=ada;
        System.out.println("=======================================");
        System.out.println("Available Matic in your Wallet :" +adaBalance);
        System.out.println("Please enter Amount to sell ADA :");
        double a=choice.nextDouble();

           if(a<=adaBalance)
           {
            adaBalance = adaBalance-a;
            double b=a*Ada;
            userBalance=userBalance+b;
            System.out.println("=======================================");
            System.out.println("Your ADA Balance is :" +adaBalance);
            System.out.println("Updated Balance :" +userBalance); 
           }
           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("Your available Balance is :" +adaBalance);
            System.out.println("=======================================");
           
           }
    
}
        public void sellAda(double ada, double userBal)
        {
          sellAda ref= new sellAda(ada, userBal); //upcasting
        }

}




class sendAda extends sellAda
{
    
    public sendAda()
    {
        System.out.print("Available Balance: ");
       
    }

    public sendAda(double userBal)
    {
        this();
        userBalance=userBal;
       
    }

   public sendAda(double ada, double userBal){

        this(userBal); //constructor chainning
        adaBalance=ada;
        System.out.println(userBal);
        System.out.println("=======================================");
        //System.out.println("Available ADA in your Wallet :" +adaBalance);
        System.out.println("Please enter Amount to send ADA :");
        double a=choice.nextDouble();

           if(a<=adaBalance)
           {
            System.out.println("Enter correct ADA wallet address :");
            String wAddress=choice.nextLine(); //incase of taking double input then remove me
            String wAddress1=choice.nextLine();
            adaBalance = adaBalance-a;
            System.out.println(a + " ADA successfully send to " +wAddress1);
            System.out.println("=======================================");
            System.out.println("You ADA Balance is :" +adaBalance);
            System.out.println("Updated Balance :" +userBalance);
           }
           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("Your available Balance is :" +adaBalance);
            System.out.println("=======================================");
           
           }
    
}
        public void sendAda(double ada, double userBal)
        {
          sellAda ref= new sendAda(ada, userBal); //upcasting
        }

}


public class Ada extends sendAda {

   
    public double getAda(){
        return adaBalance;

    }

    public double getbal(){
        return userBalance;
    }
}


