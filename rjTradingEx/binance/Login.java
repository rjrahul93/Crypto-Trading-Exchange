/* This Project created by Rahul Jaiswar.
 * Linkedin: https://www.linkedin.com/in/rjrahul93
 * GitHub: https://github.com/rjrahul93
 * EMail: rjrahul9322@gmail.com
 */

import java.util.InputMismatchException;
import java.util.Scanner;

class Login extends UserDetails{

    static boolean login=false;
    int pass;

    Login(String Un, int pass, double bal){
        Username=Un;
        setPassword(pass);
        Balance=bal;  
    }

    //UserLoginDetails U1 = new UserLoginDetails();

    public  void login(){
        
        System.out.println();
        System.out.println("=======================================");
        System.out.println("Welcome To Login Page :)");
        System.out.println("=======================================");

        while(!login){

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Your UserName :");
        String un = input.nextLine();

        try {
        System.out.print("Please enter Your Password only Digit (0-9):");
         pass = input.nextInt();
        }
        catch(InputMismatchException ia)
        {

        }

        if(getPassword()==pass && un.equals(Username)) 
        {
         
          System.out.println("=======================================");
          System.out.println("Login Success, Redirecting to Home page shortly");
          System.out.println("=======================================");
          login=true;

          Home ref = new Home(this.Username, this.getPassword(),this.Balance);
          ref.home();
        }
       
        else{
            System.out.println("=======================================");
            System.out.println("Wrong credentials, Please try again");
            System.out.println("=======================================");
            
           
        }
    }

    }
    
}