package interfaces;

public class OpCoin extends OP implements buyOP, sellOP, sendOP {

    public double buyOP(double opBalance,double userBalance)
    {
        System.out.println("Your available Balance is :" +userBalance +"$");
        System.out.println("Please enter Amount to Buy OP :");
        double a=choice.nextDouble();

           if(a<=userBalance)
           {
           // System.out.println("User balance :" +userBalance);
            this.userBal = userBalance-a;
            double b=a/Op;
            opBal=opBalance+b;
            txn=b;
            System.out.println("=======================================");
            System.out.println("Your OP Balance is :" +opBal);
            System.out.println("Updated Balance :" +userBal +"$");
            return userBal;

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("Your available Balance is :" +userBalance +"$");
            System.out.println("=======================================");
            this.opBal = opBalance;
            userBal=userBalance;
             return userBal;
           }
        

    }

    public double sellOP(double opBalance, double userBalance)
    {
        
    System.out.println("Available OP in your Wallet :" +opBalance);
    System.out.println("Please enter Amount to sell OP :");
    double a=choice.nextDouble();

       if(a<=opBalance)
       {
       // System.out.println("User balance :" +userBalance);
        this.opBal = opBalance-a;
        double b=a*Op;
        userBal=userBalance+b;
        txn=a;
        System.out.println("=======================================");
        System.out.println("Your OP Balance is :" +opBal);
        System.out.println("Updated Balance :" +userBal +"$");
        return opBal;

       }

       else{
        System.out.println("=======================================");
        System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
        System.out.println("=======================================");
        this.opBal = opBalance;
        userBal=userBalance;
        return opBal;
       }

    }

    public void sendOP(double opBalance,double userBalance)
    {
        System.out.println("Available OP in your Wallet :" +opBalance);
        System.out.println("Please enter OP Amount you want to send :");
        double a=choice.nextDouble();
    
           if(a<=opBalance)
           {
           // System.out.println("User balance :" +userBalance);
            System.out.println("Enter correct OP wallet address :");
            String wAddress=choice.nextLine(); //incase of taking double input then remove me
            String wAddress1=choice.nextLine();
            this.opBal = opBalance-a;
            userBal=userBalance;
            txn=a; //history
            System.out.println(a + " OP successfully send to " +wAddress1);
            System.out.println("=======================================");
            System.out.println("You OP Balance is :" +opBal);
            System.out.println("Updated Balance :" +userBal +"$");
            
           }
    
           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("=======================================");
            this.opBal = opBalance;
            userBal=userBalance;
           
           }

    }

}
