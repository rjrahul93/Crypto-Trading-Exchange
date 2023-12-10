package coinlist;

public class BTC extends list{

    private double btcBalance;
   

    public void btc()
    { 
       
        System.out.println("=======================================");
        System.out.println("current price of BTC is :" +this.BTC);
        System.out.println("Your Balance is: " +userBalance);
        System.out.println("Please Choose anyone option :");
        System.out.println("1.Buy  BTC");
        System.out.println("2.Sell BTC");
        System.out.println("3.Send BTC");
      
        System.out.println("=======================================");

        int op =choice.nextInt();

        if(op==1)
        {
           System.out.println("User balance :" +userBalance);
           userBalance= list.BTC-userBalance;
          
           System.out.println("Updated Balance :" +userBalance);
         
        }
       
    }
 // Below Part in use   
    {
        System.out.println("BTC current Price :" +BTC +"$");
        //first way to use static var in non static context such as directly
    
    }
  
    public void buyBTC(){
        System.out.println("=======================================");
        System.out.println("Please enter Amount to Buy BTC :");
        double a=choice.nextDouble();

           if(a<=userBalance)
           {
          
            this.userBalance = this.userBalance-a;
            double b=a/this.BTC; //second way to use static var in non static context with the help of this keyword
            btcBalance=btcBalance+b;
            System.out.println("=======================================");
            System.out.println("You BTC Balance is :" +this.btcBalance);
            System.out.println("Updated Balance :" +userBalance);

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("Your available Balance is :" +userBalance +"$");
            System.out.println("=======================================");
           }
           

    }

    public void sellBTC(){

        System.out.println("=======================================");
        System.out.println("Available btc in your Wallet :" +btcBalance);
        System.out.println("Please enter Amount to sell BTC :");
        double a=choice.nextDouble();

           if(a<=btcBalance)
           {
           // System.out.println("User balance :" +userBalance);
            this.btcBalance = this.btcBalance-a;
            double b=a*list.BTC;  //third way to use static var in non static context with the help of class name
            userBalance=userBalance+b;
            System.out.println("=======================================");
            System.out.println("You BTC Balance is :" +btcBalance);
            System.out.println("Updated Balance :" +userBalance);

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("=======================================");
           }
           

    }

    public void sendBTC(){
        System.out.println("=======================================");
        System.out.println("Available btc in your Wallet :" +btcBalance);
        System.out.println("Please enter BTC Amount you want to send :");
        double a=choice.nextDouble();

           if(a<=btcBalance)
           {
           // System.out.println("User balance :" +userBalance);
            System.out.println("Enter correct BTC wallet address :");
            String wAddress=choice.nextLine(); //incase of taking double input then remove me
            String wAddress1=choice.nextLine();
            this.btcBalance = this.btcBalance-a;
            System.out.println(a + " BTC successfully send to " +wAddress1);
            System.out.println("=======================================");
            System.out.println("You BTC Balance is :" +btcBalance);
            System.out.println("Updated Balance :" +userBalance);

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("=======================================");
           }
           
    }
//setter method method for private  data
    public void setBTC(double btc){
        this.btcBalance=btc;

    }
//getter method for private data
    public double getBTC(){

        return btcBalance;
    }
    
}
