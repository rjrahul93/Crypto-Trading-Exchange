/* This Project created by Rahul Jaiswar.
 * Linkedin: https://www.linkedin.com/in/rjrahul93
 * GitHub: https://github.com/rjrahul93
 * EMail: rjrahul9322@gmail.com
 */

import java.util.Scanner;
import collection.arrayLists;
public class UserDetails {

    String Username;
    private  int Password;
    int n=4;

    double Balance;
    double portfolio;
    double totalBalance;
    double addFH; //add Fund History

    addFund refFund= new addFund();
    arrayLists fundH= new arrayLists();
    

// User coin Balance    

    double btcBal,  ethBal, bnbBal, dotBal, maticBal, adaBal, solBal, xrpBal, dogeBal, ltcBal, dashBal, aptosBal, arbBal, opBal, linkBal;

// Coin current price

static double BTC=26987;
static double ETH=1650;
static double BNB=232;
static double DOT=4.23;
static double Matic=0.58;
static double Ada=0.32;
static double Sol=21;
static double XRP=0.51;
static double Doge=0.06;
static double LTC=63;
static double DASH=28;
static double Aptos=5.43;
static double ARB=0.92;
static double OP=1.34;
static double Link=5.6;



//End coin Balance    

    Scanner input = new Scanner(System.in);
    

    //getter Method used to get private data in diffrent class, or we can't access private data outside of class without getter nethod
    public int getPassword(){
        
        return Password;
    }

    //setter method used to set value in private data type variable, directly we can't modifie private data
    // so here we create setter method which taking input and assing that value in private data type var

    public void setPassword(int pass){
        
        this.Password=pass;
    }
    
  public void userLoginDetails(String Un, int pass)
    {
        Username=Un;
        Password=pass;
    }
    public  String getBalance(){
        return Username;

    }
   
}
