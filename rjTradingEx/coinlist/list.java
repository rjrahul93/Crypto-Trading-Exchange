
package coinlist;

import java.util.Scanner;


public class list  {
    
    double userBalance;
    double portfolio;
    double totalBalance;
    String UserName;

    boolean stop=false;

    Scanner choice = new Scanner(System.in);
    //coin price

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
    
    
    public void setUserBalance(double Balance, String userName){
     userBalance=Balance;
     UserName=userName;
    }

    public double getBalance(){

        return userBalance;
    }
   
    

   
}
   
    

