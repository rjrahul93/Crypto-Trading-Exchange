/* This Project created by Rahul Jaiswar.
 * Linkedin: https://www.linkedin.com/in/rjrahul93
 * GitHub: https://github.com/rjrahul93
 * EMail: rjrahul9322@gmail.com
 */

package AtoZ;
import java.util.Scanner;

public class allCoins {

    String coinName;
    double userBal;
    double coinBal;
    double coinPrice;

    boolean sub=false;
    int n=4;
    Scanner input=new Scanner(System.in);

    public allCoins(String coinName, double userBal, double coinBal, double coinPrice) {
        this.coinName = coinName;
        this.userBal = userBal;
        this.coinBal = coinBal;
        this.coinPrice = coinPrice;
    }

    public double menu()
    {
        sub=false;
        System.out.println("Your account Balance is :" +userBal);
        System.out.println("Your " +coinName +" Balance is " +coinBal);

        while(!sub){

            System.out.println("=======================================");
             System.out.println("Please Choose anyone option :");
             System.out.println("1.Buy " +coinName);
             System.out.println("2.Sell " +coinName);
             System.out.println("3.Send " +coinName);

            if(userBal<100)
            {
                System.out.println(n +".Add Fund");
                n++;
            }
            System.out.println(n+".Back");
            n=4;
             
             System.out.println("=======================================");
             int a = input.nextInt();

             if(a==1)
             {
                buyCoin();

             }

             else if(a==2)
             {
                sellCoin();

             }
             else if(a==3)
             {
                sendCoin();

             }
             else if(userBal==100)
             {
                if(a==4)
                {
                    System.out.println("In maintenance, sorry for inconvenience");

                }
                else if (a==5)
                {
                    sub=true;
                    System.out.println("Coming to Home Page");

                }
                else
                {
                    System.out.println("Please choose valid Option");

                }
             }
             else if(a==4)
             {
                sub=true;
                System.out.println("Coming to Home Page");
        

             }
             else
             {
                System.out.println("Please choose valid Option");
             }

        }
        return userBal;
        

    }

    public void buyCoin()
    {

        System.out.println("=======================================");
        System.out.println("Please enter Amount to Buy " +coinName +" :");
        double a=input.nextDouble();

           if(a<=userBal)
           {
            this.userBal = this.userBal-a;
            double b=a/coinPrice; //second way to use static var in non static context with the help of this keyword
            coinBal=coinBal+b;
            System.out.println("=======================================");
            System.out.println("Your " +coinName + " Balance is :" +this.coinBal);
            System.out.println("Updated Balance :" +userBal);

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("Your available Balance is :" +userBal +"$");
            System.out.println("=======================================");
           }
           
    }

    public void sellCoin()
    {
        System.out.println("=======================================");
        System.out.println("Available " +coinName +" in your Wallet :" +coinBal);
        System.out.println("Please enter Amount to Buy " +coinName +" :");
        double a=input.nextDouble();

           if(a<=coinBal)
           {
           // System.out.println("User balance :" +userBalance);
            this.coinBal = this.coinBal-a;
            double b=a*coinPrice;  //third way to use static var in non static context with the help of class name
            userBal=userBal+b;
            System.out.println("=======================================");
            System.out.println("Your " +coinName + " Balance is :" +this.coinBal);
            System.out.println("Updated Balance :" +userBal);

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("=======================================");
           }
           


    }

    public void sendCoin()
    {
        System.out.println("=======================================");
        System.out.println("Available " +coinName +" in your Wallet :" +coinBal);
        System.out.println("Please enter " +coinName +" Amount you want to send :");
        double a=input.nextDouble();

           if(a<=coinBal)
           {
           // System.out.println("User balance :" +userBalance);
            System.out.println("Enter correct "+coinName + " wallet address :");
            String wAddress=input.nextLine(); //incase of taking double input then remove me
            String wAddress1=input.nextLine();
            this.coinBal = this.coinBal-a;
            System.out.println(a + coinName + " successfully send to " +wAddress1);
            System.out.println("=======================================");
            System.out.println("Your " +coinName + " Balance is :" +this.coinBal);
            System.out.println("Updated Balance :" +userBal);

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("=======================================");
           }
        

    }

    public void addFund()
    {

    }

    public double getCoinBal()
    {
        return coinBal;
    }
    
}
