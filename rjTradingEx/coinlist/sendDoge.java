package coinlist;

public class sendDoge extends sellDoge {


     public void doge(){
        System.out.println("=======================================");
        System.out.println("send method executed");
        System.out.println("Available Doge in your Wallet :" +dogeBalance);
        System.out.println("Please enter Doge Amount you want to send :");
       
        double a=choice.nextDouble();

           if(a<=dogeBalance)
           {
           // System.out.println("User balance :" +userBalance);
            System.out.println("Enter correct Doge wallet address :");
            String wAddress=choice.nextLine(); //incase of taking double input then remove me
            String wAddress1=choice.nextLine();
            dogeBalance = dogeBalance-a;
            System.out.println(a + " Doge successfully send to " +wAddress1);
            System.out.println("=======================================");
            System.out.println("You Doge Balance is :" +dogeBalance);
            System.out.println("Updated Balance :" +userBalance +"$");

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("=======================================");
           }
    }

}

