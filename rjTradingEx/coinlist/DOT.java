
// Multi Level inheritance

package coinlist;

 class buyDOT extends list{

    double dotBalance;

    public void buyDOT(){
        System.out.println("=======================================");
        System.out.println("Your available Balance is :" +userBalance +"$");
        System.out.println("Please enter Amount to Buy DOT :");
        double a=choice.nextDouble();

           if(a<=userBalance)
           {
           // System.out.println("User balance :" +userBalance);
            this.userBalance = this.userBalance-a;
            double b=a/DOT;
            dotBalance=dotBalance+b;
            System.out.println("=======================================");
            System.out.println("Your DOT Balance is :" +dotBalance);
            System.out.println("Updated Balance :" +userBalance +"$");

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("Your available Balance is :" +userBalance +"$");
            System.out.println("=======================================");
           }
           
    }

    
}

class sellDot extends buyDOT {

    public void sellDOT(){

        System.out.println("=======================================");
        System.out.println("Available DOT in your Wallet :" +dotBalance);
        System.out.println("Please enter Amount to sell DOT :");
        double a=choice.nextDouble();

           if(a<=dotBalance)
           {
           // System.out.println("User balance :" +userBalance);
            this.dotBalance = this.dotBalance-a;
            double b=a*DOT;
            userBalance=userBalance+b;
            System.out.println("=======================================");
            System.out.println("Your DOT Balance is :" +dotBalance);
            System.out.println("Updated Balance :" +userBalance +"$");

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("=======================================");
           }
    }


}

public class DOT extends sellDot {

    public void sendDOT(){
        System.out.println("=======================================");
        System.out.println("Available DOT in your Wallet :" +dotBalance);
        System.out.println("Please enter DOT Amount you want to send :");
        double a=choice.nextDouble();

           if(a<=dotBalance)
           {
           // System.out.println("User balance :" +userBalance);
            System.out.println("Enter correct DOT wallet address :");
            String wAddress=choice.nextLine(); //incase of taking double input then remove me
            String wAddress1=choice.nextLine();
            this.dotBalance = this.dotBalance-a;
            System.out.println(a + " DOT successfully send to " +wAddress1);
            System.out.println("=======================================");
            System.out.println("You DOT Balance is :" +dotBalance);
            System.out.println("Updated Balance :" +userBalance +"$");

           }

           else{
            System.out.println("=======================================");
            System.out.println("Sorryy, Please enter less than available Amount in your Wallet");
            System.out.println("=======================================");
           }
    }

// method to get and set as well as return data 

    public void getDOT(double dot){

        this.dotBalance=dot;
    }

    public double getbal(){

        return dotBalance;
    }

}


