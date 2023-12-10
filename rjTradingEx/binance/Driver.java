/* This Project created by Rahul Jaiswar.
 * Linkedin: https://www.linkedin.com/in/rjrahul93
 * GitHub: https://github.com/rjrahul93
 * EMail: rjrahul9322@gmail.com
 */

import java.util.Scanner;
public class Driver {

    // Welcome Message using Static Block
   static{
    System.out.println();
    System.out.println("*         *  * * * * *  *            * * * * *    * * *    *               *  * * * * * ");
    System.out.println("*         *  *          *          *            *       *  * *           * *  *         ");
    System.out.println("*   * *   *  * * * * *  *          *            *       *  *  *         *  *  * * * * * ");
    System.out.println("*  *   *  *  *          *          *            *       *  *    *     *    *  *         ");
    System.out.println("* *     * *  * * * * *  * * * * *    * * * * *    * * *    *      * *      *  * * * * * ");
    System.out.println(); 
   }

    static {
    System.out.println();    
    System.out.println("* * * * * *      * * * * *     * * * * *    * * * * *  ");
    System.out.println("*           *  *          *  *            *            ");
    System.out.println("*           *  *          *  *            *            ");
    System.out.println("* * * * * *    *          *  * * * * * *  * * * * * *  "); 
    System.out.println("*           *  *          *            *            *  ");  
    System.out.println("*           *  *          *            *            *  "); 
    System.out.println("* * * * * *      * * * * *   * * * * *    * * * * *    ");
    System.out.println();
      
    }

    public static void main(String[]args)
    {
        // creating scanner class so we can take input from user

        Scanner ref = new Scanner(System.in);
        
        System.out.println("=======================================");
        System.out.println("Who are You :");
        System.out.println("=======================================");
        System.out.println("1.User");
        System.out.println("2.Admin");
        int a= ref.nextInt(); 
        
        // DMS

        if(a==1)
        {
            System.out.println("=======================================");
            System.out.println("Welcome as User");
            System.out.println("=======================================");
            System.out.println("what you want to do");
            System.out.println("1.Login");
            System.out.println("2.SingUp");
            int b= ref.nextInt();

            if(b==1)
            {
                Login login = new Login("Rahul", 12345, 10000); 
                // creating object for Login class so we can store all non static members inside of this object
                // we created constructor in Login class with 2 formal argument so using that we can initialize var during oubject creation
                login.login();
                //calling Non static method using object refrence variable

            }

            else if(b==2)
            {

            SingUp.singUp();
            //singUp is static method inside of SingUp class so here we don't need to create object
            //we can call static method using className

        
            }
            else {
                System.out.println("choosen option is wrong, Please Run again to start");
            }

        }
        else if(a==2)
        {
             AdminLogin ref1=new AdminLogin("Rahul Jaiswar", 12345);
             ref1.adminLogin();

        }
        else
        {
            System.out.println("Please choose 1 or 2");
        }
}
}
