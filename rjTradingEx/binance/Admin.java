import java.util.Scanner;
class Admin {
    
    String Admin;
    int passAdmin;

}

class AdminLogin extends Admin{

    public void adminLogin(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Username :");
        String un= sc.nextLine();
        System.out.println("Enter Pass :");
        int pass=sc.nextInt();

        if(un.equals(Admin) && pass==passAdmin )
        {
            System.out.println("Successfully Login as Admin");
            AdminArea ref=new AdminArea(this.Admin);
            ref.adminHome();

        }
        else{
            System.out.println("Sorry Admin Please enter valid Details");
        }
    }

   AdminLogin(String Admin, int Pass){
       
        this.Admin=Admin;
        this.passAdmin=Pass;
    }
}