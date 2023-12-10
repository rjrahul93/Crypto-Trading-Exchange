package coinlist;


public class sellDoge extends buyDoge{

    public void doge(){

        System.out.println("=======================================");
        System.out.println("Doge sell method executed");
        System.out.println("Available Doge in your Wallet :" +dogeBalance);
        System.out.println("Please enter Amount to sell Doge :");
      
        double a=choice.nextDouble();

           if(a<=dogeBalance)
           {
         
            dogeBalance = dogeBalance-a;
            double b=a*Doge;
            userBalance=userBalance+b;
            System.out.println("=======================================");
            System.out.println("Your Doge Balance is :" +dogeBalance);
            System.out.println("Updated Balance :" +userBalance +"$");

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("=======================================");
           }
    }

}
