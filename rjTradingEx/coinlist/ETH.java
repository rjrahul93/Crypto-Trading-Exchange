package coinlist;

public class ETH extends list{

   private double ethBalance;

    {
        System.out.println("ETH current Price :" +ETH +"$");
    
    }

       public void buyETH(){
        System.out.println("=======================================");
        System.out.println("Please enter Amount to Buy ETH :");
        double a=choice.nextDouble();

           if(a<=userBalance)
           {
           // System.out.println("User balance :" +userBalance);
            this.userBalance = this.userBalance-a;
            double b=a/ETH;
            ethBalance=ethBalance+b;
             System.out.println("=======================================");
            System.out.println("Your ETH Balance is :" +ethBalance);
            System.out.println("Updated Balance :" +userBalance);

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("Your available Balance is :" +userBalance +"$");
            System.out.println("=======================================");
           }
           

    }

    public void sellETH(){

        System.out.println("=======================================");
        System.out.println("Available eth in your Wallet :" +ethBalance);
        System.out.println("Please enter Amount to sell ETH :");
        double a=choice.nextDouble();

           if(a<=ethBalance)
           {
           // System.out.println("User balance :" +userBalance);
            this.ethBalance = this.ethBalance-a;
            double b=a*ETH;
            userBalance=userBalance+b;
             System.out.println("=======================================");
            System.out.println("Your ETH Balance is :" +ethBalance);
            System.out.println("Updated Balance :" +userBalance);

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("=======================================");
           }
           

    }

    public void sendETH(){
        System.out.println("=======================================");
        System.out.println("Available ETH in your Wallet :" +ethBalance);
        System.out.println("Please enter ETH Amount you want to send :");
        double a=choice.nextDouble();

           if(a<=ethBalance)
           {
           // System.out.println("User balance :" +userBalance);
            System.out.println("Enter correct ETH wallet address :");
            String wAddress=choice.nextLine(); //incase of taking double input then remove me
            String wAddress1=choice.nextLine();
            this.ethBalance = this.ethBalance-a;
            System.out.println(a + " ETH successfully send to " +wAddress1);
             System.out.println("=======================================");
            System.out.println("You ETH Balance is :" +ethBalance);
            System.out.println("Updated Balance :" +userBalance);

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("=======================================");
           }
           
    }

//setterMethod 
    public void setETH(double eth){
        this.ethBalance=eth;

    }

// getterMethod
    public double getETH(){
        return ethBalance;
    }
    
}
