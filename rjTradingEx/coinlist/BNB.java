package coinlist;

public class BNB extends list{

     double bnbBalance;

     @Override
     public String toString() //overriding toString method of object class
    {
        System.out.println("BNB current Price :" +BNB +"$");
        return "";
    
    }

       public void buyBNB(){
        System.out.println("=======================================");
        System.out.println("Please enter Amount to Buy BNB :");
        double a=choice.nextDouble();

           if(a<=userBalance)
           {
           // System.out.println("User balance :" +userBalance);
            this.userBalance = this.userBalance-a;
            double b=a/BNB;
            bnbBalance=bnbBalance+b;
            System.out.println("=======================================");
            System.out.println("Your BNB Balance is :" +bnbBalance);
            System.out.println("Updated Balance :" +userBalance);

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("Your available Balance is :" +userBalance +"$");
            System.out.println("=======================================");
           }
           
    }

    public void sellBNB(){

        System.out.println("=======================================");
        System.out.println("Available BNB in your Wallet :" +bnbBalance);
        System.out.println("Please enter Amount to sell BNB :");
        double a=choice.nextDouble();

           if(a<=bnbBalance)
           {
           // System.out.println("User balance :" +userBalance);
            this.bnbBalance = this.bnbBalance-a;
            double b=a*BNB;
            userBalance=userBalance+b;
            System.out.println("=======================================");
            System.out.println("Your BNB Balance is :" +bnbBalance);
            System.out.println("Updated Balance :" +userBalance);

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("=======================================");
           }
    }

    public void sendBNB(){
        System.out.println("=======================================");
        System.out.println("Available BNB in your Wallet :" +bnbBalance);
        System.out.println("Please enter BNB Amount you want to send :");
        double a=choice.nextDouble();

           if(a<=bnbBalance)
           {
           // System.out.println("User balance :" +userBalance);
            System.out.println("Enter correct BNB wallet address :");
            String wAddress=choice.nextLine(); //incase of taking double input then remove me
            String wAddress1=choice.nextLine();
            this.bnbBalance = this.bnbBalance-a;
            System.out.println(a + " BNB successfully send to " +wAddress1);
            System.out.println("=======================================");
            System.out.println("You BNB Balance is :" +bnbBalance);
            System.out.println("Updated Balance :" +userBalance);

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("=======================================");
           }
           
    }

//Constructor overloading    
    public BNB(double Balance)
    {
        userBalance=Balance;
     
    } 

    public BNB(String userName){
       
     UserName=userName;

    }
   
 
    public void getBNB(double bnb){

        this.bnbBalance=bnb;

    }
    
    public double getbal(){
        return bnbBalance;
    }
    
}
