import java.util.Scanner;
// created by rahul Jaiswar
public class addFund extends SingUp {
    
    public double addFund(){

        Scanner input = new Scanner(System.in);
        SingUp sing=new SingUp();

        System.out.println("How much you want to Deposit ?");
        int Amt=input.nextInt();

        System.out.println("=======================================");
        System.out.println("Please Choose Payment Mode :");
        System.out.println("1.UPI");
        System.out.println("2.Net Banking");
        System.out.println("3.Bank Deposit");
        System.out.println("4.I will Deposit Later");
        System.out.println("=======================================");

        int payChoice=input.nextInt();

        if(payChoice==1)
        {
            System.out.println("=======================================");
            System.out.println("Thanks for Choosing UPI");
            System.out.println("=======================================");
            System.out.println("Please enter UPI Id");
            String upi = input.nextLine(); //extra bcs compiler issue
            String upiID = input.nextLine();
            System.out.println("Payment Request has been sent to :" +upiID);
            System.out.println("After approving payment please enter 1");
            System.out.println("For Cancle current tnx enter 2");
            System.out.println("=======================================");

            int a=input.nextInt();

            //UPI
            if(a==1){

                balance=Amt;
                System.out.println("=======================================");
                System.out.println("Thanks for Making Payment");
                System.out.println("Your deposit amt will be credit soon");
                System.out.println("=======================================");
            } 
            else {
                System.out.println("=======================================");
                System.out.println("oops you just cancle payment");
                System.out.println("=======================================");
                balance=0;
            }

        }

        //NetBanking
        else  if(payChoice==2)
        {
            System.out.println("=======================================");
            System.out.println("Thanks for Choosing NetBanking");
            System.out.println("=======================================");

        }
        
        //Bank Deposit
        else if(payChoice==3)
        {
            System.out.println("=======================================");
            System.out.println("Thanks for Choosing Bank Deposit");
            System.out.println("=======================================");

        }
        else {
            System.out.println("=======================================");
            System.out.println("No problem, You can deposit Later");
            System.out.println("=======================================");

        }

        return balance;

    }

    public void setBalance(double bal){

       balance =bal;

    }

    public double getBal()
    {
        return balance;

    }

}
