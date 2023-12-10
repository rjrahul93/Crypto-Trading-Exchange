
import java.util.Scanner;

public class SingUp {

   double balance;
   static int Password;
   static boolean setPass=false;
     
    public static void singUp(){
         
        Scanner input = new Scanner(System.in);
        SingUp sing=new SingUp();
        
        System.out.println("=======================================");
        System.out.println("Welcome To Singup Page :)");
        System.out.println("=======================================");
        System.out.println();
        System.out.print("Please Enter Your User Name :");
        String Username = input.nextLine();

        System.out.print("Please enter Password only Digit (0-9):");
        
        while(!setPass) {
            
        try {
         Password = Integer.parseInt(input.nextLine());
         String passString = Integer.toString(Password);
         int passLen =passString.length();
         
         if(passLen>=5)
         {
            setPass=true;

         }
         else{
         System.out.println("Please enter minimum 5 digit password");
         }

        }
        catch(NumberFormatException e)
        {
            System.out.println("Please enter Password only Digit (0-9):");
        }
    }
        
        System.out.println("=======================================");
        System.out.println("Want to Add Fund in Your Wallet ?");
        System.out.println("1.Yes");
        System.out.println("2.No");

        int addChoice=input.nextInt();

        if(addChoice==1)
        {
            addFund add= new addFund();
           // sing.balance=add.getBal();
           sing.balance=add.addFund();
        
        }
//Deposit Later

        else{
            System.out.println("=======================================");
            System.out.println("No problem, You can deposit Later");
            System.out.println("=======================================");
        }

        //U1.userLoginDetails(Username, Password);
        System.out.println("Singup completed, Now you can Login");
        System.out.println("=======================================");
        Login U1 = new Login(Username, Password,  sing.balance);
        System.out.println("Username :" +Username +", Password :" +U1.getPassword());
        
        U1.login();

    }

}
