
/* This Project created by Rahul Jaiswar.
 * Linkedin: https://www.linkedin.com/in/rjrahul93
 * GitHub: https://github.com/rjrahul93
 * EMail: rjrahul9322@gmail.com
 */

import coinlist.*;
import interfaces.*;
import java.util.ArrayList;
import AtoZ.allCoins;
import abstraction.*;

public class Home extends UserDetails {

   String user;
   int passw;

   addBal addBal=new addBal();
   
   boolean menu=false;
   boolean sub=false;

    Home (String un, int pass, double Bal){

        this.user=un;
        this.passw=pass;
        this.Balance=Bal;
        fundH.addFundHistory(Bal);
    }
   
public void home(){

    //String user=un;

    while(!menu){

    if(Login.login==true)
    {
        sub=false;
        System.out.println("=======================================");
        System.out.println("Welcome in Binance Dear " +user);
        System.out.println("=======================================");
        System.out.println("Your Wallet Balance: " +Balance +"$");
        System.out.println("=======================================");
        System.out.println("Please Choose any one option (1-16)");
        System.out.println("=======================================");
        System.out.println("1.  BTC");
        System.out.println("2.  ETH");
        System.out.println("3.  BNB");
        System.out.println("4.  Dot");
        System.out.println("5.  Matic");
        System.out.println("6.  ADA");
        System.out.println("7.  SOL");
        System.out.println("8.  XRP");
        System.out.println("9.  Doge");
        System.out.println("10. LTC");
        System.out.println("11 .Dash");
        System.out.println("12. Aptos");
        System.out.println("13. ARB");
        System.out.println("14. OP");
        System.out.println("15. Link");
        System.out.println("16. Portfolio");
        System.out.println("17. Add Fund");
        System.out.println("18. LogOut");
        System.out.println("=======================================");

        int a=input.nextInt();
        
// BTC area
      if(a==1){
       

       System.out.println("=======================================");
       BTC refBTC=new BTC();
       System.out.println("Available BTC Balance: " +btcBal);
       System.out.println("Availabel Balance: " +Balance +"$");
       refBTC.setUserBalance(Balance, user);
       sub=false;
        
       while(!sub){
        System.out.println("=======================================");
        System.out.println("Please Choose anyone option :");
        System.out.println("1.Buy  BTC");
        System.out.println("2.Sell BTC");
        System.out.println("3.Send BTC");
        if(Balance<100)
        {
            System.out.println(n +".Add Fund");
            n++;
        }

        System.out.println(n+".Back");
        n=4;
        System.out.println("=======================================");
        int b=input.nextInt();

        if(b==1)
        {
            refBTC.setBTC(btcBal);
            refBTC.buyBTC();
            this.Balance=refBTC.getBalance();
            this.btcBal=refBTC.getBTC();
        }
        else if(b==2)
        {
             refBTC.setBTC(btcBal);
             refBTC.sellBTC();
             this.Balance=refBTC.getBalance();
             this.btcBal=refBTC.getBTC();

        }
        else if(b==3)
        {
             refBTC.setBTC(btcBal);
             refBTC.sendBTC();
             this.Balance=refBTC.getBalance();
             this.btcBal=refBTC.getBTC();

        }
        else if (Balance<100) {
            if(b==4)
            {
                System.out.println("Add fund method");
                Balance=addBal.add(Balance);
                fundH.addFundHistory(addBal.addFH);
                System.out.println("Deposit History :" +fundH.getTxn());

            }
            else if(b==5)
            {
               System.out.println("Taking Back");
               sub=true;

            }
            else{
            System.out.println("wrong");
            }

        }
        else if(b==4)
        {
            System.out.println("Taking Back");
            System.out.println(Balance);
            sub=true;
        }
        else{
            System.out.println("wrong");
        }
       }
          
    }

 // ETH area   
        else if (a==2)
        {
            
            System.out.println("=======================================");
            ETH refETH=new ETH();
            refETH.setUserBalance(Balance, user);
            System.out.println("Available ETH Balance: " +ethBal);
            System.out.println("Availabel Balance: " +Balance +"$");
            sub=false;
             
            while(!sub){
             System.out.println("=======================================");
             System.out.println("Please Choose anyone option :");
             System.out.println("1.Buy  ETH");
             System.out.println("2.Sell ETH");
             System.out.println("3.Send ETH");
            if(Balance<100)
            {
                System.out.println(n +".Add Fund");
                n++;
            }
            System.out.println(n+".Back");
            n=4;
             
             System.out.println("=======================================");
             int b=input.nextInt();
     
             if(b==1)
             {
                 refETH.setETH(ethBal);
                 refETH.buyETH();
                 this.Balance=refETH.getBalance();
                 this.ethBal=refETH.getETH();
             }
             else if(b==2)
             {
                 refETH.setETH(ethBal);
                 refETH.sellETH();
                 this.Balance=refETH.getBalance();
                 this.ethBal=refETH.getETH();
     
             }
             else if(b==3)
             {
                 refETH.setETH(ethBal);
                 refETH.sendETH();
                 this.Balance=refETH.getBalance();
                 this.ethBal=refETH.getETH();
     
             }

             else if (Balance<100) {
            if(b==4)
            {
                System.out.println("Add fund method");
                Balance=addBal.add(Balance);
                fundH.addFundHistory(addBal.addFH);
                System.out.println("Deposit History :" +fundH.getTxn());

            }
            else if(b==5)
            {
               System.out.println("Taking Back");
               sub=true;

            }
            else{
            System.out.println("wrong");
            }

        }
        
             else if(b==4)
             {
                 System.out.println("Taking Back");
                 System.out.println(Balance);
                 sub=true;
             }
             else{
                 System.out.println("wrong");
             }
     
     
            }
               
         }   
// BNB area
        
       else if(a==3){

       System.out.println("=======================================");
       BNB refBNB=new BNB(Balance);
       BNB refBNB1=new BNB(user); //creating 2nd object for constructor overloading
       System.out.print(refBNB1); //toString Overriding
       System.out.println("Availabel Balance: " +Balance);
       System.out.println("Available BNB Balance: " +bnbBal);
       
       sub=false;
        
       while(!sub){
        System.out.println("=======================================");
        System.out.println("Please Choose anyone option :");
        System.out.println("1.Buy  BNB");
        System.out.println("2.Sell BNB");
        System.out.println("3.Send BNB");

        if(Balance<100)
        {
            System.out.println(n +".Add Fund");
            n++;
        }

        System.out.println(n+".Back");
        n=4;

        System.out.println("=======================================");
        int b=input.nextInt();

        if(b==1)
        {
            refBNB.getBNB(bnbBal);
            refBNB.buyBNB();
            this.Balance=refBNB.getBalance();
            this.bnbBal=refBNB.getbal();
        }
        else if(b==2)
        {
            refBNB.getBNB(bnbBal);
            refBNB.sellBNB();
            this.Balance=refBNB.getBalance();
            this.bnbBal=refBNB.getbal();

        }
        else if(b==3)
        {
            refBNB.getBNB(bnbBal);
            refBNB.sendBNB();
            this.Balance=refBNB.getBalance();
            this.bnbBal=refBNB.getbal();

        }

        else if (Balance<100) {
            if(b==4)
            {
                System.out.println("Add fund method");
                Balance=addBal.add(Balance);

            }
            else if(b==5)
            {
               System.out.println("Taking Back");
               sub=true;

            }
            else{
            System.out.println("wrong");
            }

        }

        else if(b==4)
        {
            System.out.println("Taking Back");
            System.out.println(Balance);
            sub=true;
        }
        else{
            System.out.println("wrong");
        }


       }
          
    }

//Dot Coin area

else if(a==4){

    System.out.println("=======================================");
    DOT refDOT=new DOT();
    System.out.println("Availabel Balance :" +Balance);
    refDOT.setUserBalance(Balance, user);
    sub=false;
     
    while(!sub){
     System.out.println("=======================================");
     System.out.println("Please Choose anyone option :");
     System.out.println("1.Buy  DOT");
     System.out.println("2.Sell DOT");
     System.out.println("3.Send DOT");

    if(Balance<100)
    {
            System.out.println(n +".Add Fund");
            n++;
    }

    System.out.println(n+".Back");
    n=4;
     
     System.out.println("=======================================");
     int b=input.nextInt();

     if (Balance<100) {
        if(b==4)
        {
            System.out.println("Add fund method");
            Balance=addBal.add(Balance);

        }
        else if(b==5)
        {
           System.out.println("Taking Back");
           sub=true;

        }
        else{
        System.out.println("wrong");
        }

    }

 switch (b) {

     case 1:

         refDOT.getDOT(dotBal);
         refDOT.buyDOT();
         this.Balance=refDOT.getBalance();
         this.dotBal=refDOT.getbal();
         break;

     case 2:
             
         refDOT.getDOT(dotBal);
         refDOT.sellDOT();
         this.Balance=refDOT.getBalance();
         this.dotBal=refDOT.getbal();
         break;
             
     case 3:
             
         refDOT.getDOT(dotBal);
         refDOT.sendDOT();
         this.Balance=refDOT.getBalance();
         this.dotBal=refDOT.getbal();
         break;

    
     case 4:

         System.out.println("Taking Back");
         System.out.println(Balance);
         sub=true;
         break;
     
     default:

         System.out.println("wrong option, please choose between 1-4");
         break;
     }

    }
       
 }

// Matic area
        
else if(a==5){

    System.out.println("=======================================");
    Matic refMatic=new Matic();
    System.out.println("Availabel Balance :" +Balance);
    System.out.println("Available Matic Balance: " +maticBal);
    float matic=(float) maticBal; //Narrowing (primitive type casting)
    sub=false;
     
    while(!sub){
     System.out.println("=======================================");
     System.out.println("Please Choose anyone option :");
     System.out.println("1.Buy  Matic");
     System.out.println("2.Sell Matic");
     System.out.println("3.Send Matic");
    
     if(Balance<100)
    {
        System.out.println(n +".Add Fund");
        n++;
    }
     System.out.println(n+".Back");
     n=4;

     System.out.println("=======================================");
     int b=input.nextInt();

     if (Balance<100) {
        if(b==4)
        {
            System.out.println("Add fund method");
            Balance=addBal.add(Balance);

        }
        else if(b==5)
        {
           System.out.println("Taking Back");
           sub=true;

        }
        else{
        System.out.println("wrong");
        }

    }


 switch (b) {

     case 1:
        
         refMatic.buyMatic(matic, Balance);
         this.Balance=refMatic.getbal();
         this.maticBal=refMatic.getMatic();
         matic=(float) refMatic.getMatic();
         break;

     case 2:
         
         refMatic.sellMatic(matic, Balance);    
         this.Balance=refMatic.getbal();
         this.maticBal=refMatic.getMatic();
         matic=(float) refMatic.getMatic();
         break;
             
     case 3:
         
         refMatic.sendMatic(matic, Balance);
         this.Balance=refMatic.getbal();
         this.maticBal=refMatic.getMatic();
         matic=(float) refMatic.getMatic();
         break;
             
     case 4:

         System.out.println("Taking Back");
         System.out.println(Balance);
         sub=true;
         break;
     
     default:

         System.out.println("wrong option, please choose between 1-4");
         break;
     }

    }
       
 }
 
 /* This Project created by Rahul Jaiswar.
 * Linkedin: https://www.linkedin.com/in/rjrahul93
 * GitHub: https://github.com/rjrahul93
 * EMail: rjrahul9322@gmail.com
 */

 // ADA coin area

else if(a==6){

    System.out.println("=======================================");
    Ada refADA=new Ada();
    System.out.println(Balance +"$");
   
    
   // float matic=(float) maticBal; //Narrowing (primitive type casting)
    sub=false;
     
    while(!sub){
     System.out.println("=======================================");
     System.out.println("Please Choose anyone option :");
     System.out.println("1.Buy  ADA");
     System.out.println("2.Sell ADA");
     System.out.println("3.Send ADA");

     if(Balance<100)
    {
        System.out.println(n +".Add Fund");
        n++;
    }
     System.out.println(n+".Back");
     n=4;

     System.out.println("=======================================");
     int b=input.nextInt();

     if (Balance<100) {
        if(b==4)
        {
            System.out.println("Add fund method");
            Balance=addBal.add(Balance);

        }
        else if(b==5)
        {
           System.out.println("Taking Back");
           sub=true;

        }
        else{
        System.out.println("wrong");
        }

    }


 switch (b) {

     case 1:

         refADA.buyAda(adaBal, Balance);
         this.Balance=refADA.getbal();
         this.adaBal=refADA.getAda();
         break;

     case 2:
         
         refADA.sellAda(adaBal, Balance);    
         this.Balance=refADA.getbal();
         this.maticBal=refADA.getAda();
         break;
             
     case 3:
         
         refADA.sendAda(adaBal, Balance);
         this.Balance=refADA.getbal();
         this.maticBal=refADA.getAda();
         break;
             
     case 4:

         System.out.println("Taking Back");
         System.out.println(Balance);
         sub=true;
         break;
     
     default:

         System.out.println("wrong option, please choose between 1-4");
         break;
     }

    }
       
 }

 //Sol coin area

       else if(a==7){

        System.out.println("=======================================");
        Sol refSol=new Sol();
        System.out.println(Balance +"$");
       
       sub=false;
        
       while(!sub){
        System.out.println("=======================================");
        System.out.println("Please Choose anyone option :");
        System.out.println("1.Buy  Sol");
        System.out.println("2.Sell Sol");
        System.out.println("3.Send Sol");

     if(Balance<100)
    {
        System.out.println(n +".Add Fund");
        n++;
    }
     System.out.println(n+".Back");
     n=4;

        System.out.println("=======================================");
        int b=input.nextInt();

     if (Balance<100) {
        if(b==4)
        {
            System.out.println("Add fund method");
            Balance=addBal.add(Balance);

        }
        else if(b==5)
        {
           System.out.println("Taking Back");
           sub=true;

        }
        else{
        System.out.println("wrong");
        }

    }



        if(b==1)
        {

         refSol.buySol(solBal, Balance);
         this.Balance=refSol.getbal();
         this.solBal=refSol.getSol();

        }
        else if(b==2)
        {

         refSol.sellSol(solBal, Balance);    
         this.Balance=refSol.getbal();
         this.solBal=refSol.getSol();

        }
        else if(b==3)
        {

         refSol.sendSol(solBal, Balance);
         this.Balance=refSol.getbal();
         this.solBal=refSol.getSol();

        }
        else if(b==4)
        {
            System.out.println("Taking Back");
            System.out.println(Balance);
            sub=true;
        }
        else{
            System.out.println("wrong option, please choose between 1-4");
        }


       }
          
    }

// XRP coind Area
        
 // Base on method shadowing example of CRT polymorphism     

       else if(a==8){

       System.out.println("=======================================");
       //list refXrp=new list();
       
       System.out.println("Availabel Balance: " +Balance);
       System.out.println("Available XRP Balance: " +bnbBal);
       
       sub=false;
        
       while(!sub){
        System.out.println("=======================================");
        System.out.println("Please Choose anyone option :");
        System.out.println("1.Buy  XRP");
        System.out.println("2.Sell XRP");
        System.out.println("3.Send XRP");
     if(Balance<100)
    {
        System.out.println(n +".Add Fund");
        n++;
    }
     System.out.println(n+".Back");
     n=4;

        System.out.println("=======================================");
        int b=input.nextInt();        

        if(b==1)
        {
            buyXRP refXRP =new sellXRP();  //upcasting
            refXRP.setXRP(xrpBal,Balance);
            refXRP.XRP();
            this.Balance=refXRP.getBal();
            this.xrpBal=refXRP.getXRP();
        }
        
        else if(b==2)
        {
            sellXRP refXRP =new sendXRP(); //upcasting
            refXRP.setXRP(xrpBal,Balance);
            refXRP.XRP();
            this.Balance=refXRP.getBal();
            this.xrpBal=refXRP.getXRP();
        }
        else if(b==3)
        {
           
            sendXRP refXRP =new sendXRP();
            refXRP.setXRP(xrpBal,Balance);
            refXRP.XRP();
            this.Balance=refXRP.getBal();
            this.xrpBal=refXRP.getXRP();

        }

    else if (Balance<100) {
        if(b==4)
        {
            System.out.println("Add fund method");
            Balance=addBal.add(Balance);

        }
        else if(b==5)
        {
           System.out.println("Taking Back");
           sub=true;

        }
        else{
        System.out.println("wrong");
        }

    }
        
        else if(b==4)
        {
            System.out.println("Taking Back");
            System.out.println(Balance);
            sub=true;
        }
        else{
            System.out.println("wrong");
        }

       }
          
    }

 // Doge coind Area
        
 // Base on method Overriding example of RTB polymorphism     

       else if(a==9){

       System.out.println("=======================================");
       //list refXrp=new list();
       
       System.out.println("Availabel Balance: " +Balance);
       System.out.println("Available Doge Balance: " +dogeBal);
       
       sub=false;
        
       while(!sub){
        System.out.println("=======================================");
        System.out.println("Please Choose anyone option :");
        System.out.println("1.Buy  Doge");
        System.out.println("2.Sell Doge");
        System.out.println("3.Send Doge");
     if(Balance<100)
    {
        System.out.println(n +".Add Fund");
        n++;
    }
     System.out.println(n+".Back");
     n=4;

        System.out.println("=======================================");
        int b=input.nextInt();

        if(b==1)
        {
            buyDoge refDoge =new buyDoge();
            refDoge.setDoge(xrpBal,Balance);
            refDoge.doge();
            this.Balance=refDoge.getBal();
            this.dogeBal=refDoge.getDoge();
        }
        
        else if(b==2)
        {
            buyDoge refDoge =new sellDoge();  //upcasting
            refDoge.setDoge(dogeBal,Balance);
            refDoge.doge(); //it will override superclass method with sub class method
            this.Balance=refDoge.getBal();
            this.dogeBal=refDoge.getDoge();
        }
        else if(b==3)
        {
           
            sellDoge refDoge =new sendDoge(); //upcasting
            refDoge.setDoge(dogeBal,Balance);
            refDoge.doge(); //it will override superclass method with sub class method
            this.Balance=refDoge.getBal();
            this.dogeBal=refDoge.getDoge();
        }
     if (Balance<100) {
        if(b==4)
        {
            System.out.println("Add fund method");
            Balance=addBal.add(Balance);

        }
        else if(b==5)
        {
           System.out.println("Taking Back");
           sub=true;

        }
        else{
        System.out.println("wrong");
        }

    }
    
        else if(b==4)
        {
            System.out.println("Taking Back");
            System.out.println(Balance);
            sub=true;
        }
        else{
            System.out.println("wrong");
        }

       }
          
    }

//LTC coin area

// 1. abstraction
// 2. ArrayList
// 3. hashCode overriding
// 4. Upcasting and downcasting

else if(a==10){

    ArrayList buyH= new ArrayList();
    ArrayList sellH= new ArrayList();
    ArrayList sendH= new ArrayList();

    System.out.println("=======================================");
    System.out.println("Availabel Balance :" +Balance);
    System.out.println("Your LTC Balance is :" +ltcBal);
    sub=false;
     
    while(!sub){
     System.out.println("=======================================");
     System.out.println("Please Choose anyone option :");
     System.out.println("1.Buy  LTC");
     System.out.println("2.Sell LTC");
     System.out.println("3.Send LTC");
     if(Balance<100)
    {
        System.out.println(n +".Add Fund");
        n++;
    }
     System.out.println(n+".Back");
     n=4;

     System.out.println("=======================================");
     int b=input.nextInt();

     if (Balance<100) {
        if(b==4)
        {
            System.out.println("Add fund method");
            Balance=addBal.add(Balance);

        }
        else if(b==5)
        {
           System.out.println("Taking Back");
           sub=true;

        }
        else{
        System.out.println("wrong");
        }

    }


 switch (b) {

     case 1:

         LTCcoin refLTC1 = new LTC(); //Upcasting
         LTC buy=(LTC)refLTC1;  //DownCasting
         buy.setLTC(ltcBal,Balance);
         System.out.println("=======================================");
         System.out.print(refLTC1); //toString Overriding
         refLTC1.buyLTC();
         this.Balance=buy.getBal();
         this.ltcBal=buy.getLTC();
         
         buyH.add(buy.hashCode());
         System.out.println("LTC Buy History :" +buyH);
         break;

     case 2:
             
         LTCcoin refLTC2 = new LTC(); //Upcasting
         LTC sell=(LTC)refLTC2;  //DownCasting
         sell.setLTC(ltcBal,Balance);
         System.out.println("=======================================");
         System.out.print(refLTC2); //toString Overriding
         refLTC2.sellLTC();
         this.Balance=sell.getBal();
         this.ltcBal=sell.getLTC();
         sellH.add(sell.hashCode());
         System.out.println("LTC sell History :" +sellH);
         break;
             
     case 3:
             
         LTCcoin refLTC3 = new LTC(); //Upcasting
         LTC send=(LTC)refLTC3;  //DownCasting
         send.setLTC(ltcBal,Balance);
         System.out.println("=======================================");
         System.out.print(refLTC3); //toString Overriding
         refLTC3.sendLTC();
         this.Balance=send.getBal();
         this.ltcBal=send.getLTC();
         sendH.add(send.hashCode());
         System.out.println("LTC send History :" +sendH);
         break;
             
     case 4:

         System.out.println("Taking Back");
         System.out.println(Balance);
         sub=true;
         break;
     
     default:

         System.out.println("wrong option, please choose between 1-4");
         break;
     }

    }
       
 }
    
//Dash coin
 
    else if(a==11){

    ArrayList buyH= new ArrayList();
    ArrayList sellH= new ArrayList();
    ArrayList sendH= new ArrayList();

    System.out.println("=======================================");
    System.out.println("Availabel Balance :" +Balance);
    System.out.println("Your Dash Balance is :" +dashBal);
    sub=false;
     
    while(!sub){
     System.out.println("=======================================");
     System.out.println("Please Choose anyone option :");
     System.out.println("1.Buy  Dash");
     System.out.println("2.Sell Dash");
     System.out.println("3.Send Dash");

     if(Balance<100)
    {
        System.out.println(n +".Add Fund");
        n++;
    }
     System.out.println(n+".Back");
     n=4;

     System.out.println("=======================================");
     int b=input.nextInt();

     if (Balance<100) {
        if(b==4)
        {
            System.out.println("Add fund method");
            Balance=addBal.add(Balance);

        }
        else if(b==5)
        {
           System.out.println("Taking Back");
           sub=true;

        }
        else{
        System.out.println("wrong");
        }

    }


 switch (b) {

     case 1:

         buyDash refDash1 = new Dash(); //Upcasting
         Dash buy=(Dash)refDash1;  //DownCasting
         buy.setDash(dashBal,Balance);
         System.out.println("=======================================");
         System.out.print(refDash1); //toString Overriding
         buy.buyDash();
         this.Balance=buy.getBal();
         this.dashBal=buy.getDash();
         
         buyH.add(buy.hashCode());
         System.out.println("Dash Buy History :" +buyH);
         break;

     case 2:
             
         sellDash refDash2 = new Dash(); //Upcasting
         Dash sell=(Dash)refDash2;  //DownCasting
         sell.setDash(dashBal,Balance);
         System.out.println("=======================================");
         System.out.print(refDash2); //toString Overriding
         sell.sellDash();
         this.Balance=sell.getBal();
         this.dashBal=sell.getDash();
         sellH.add(sell.hashCode());
         System.out.println("Dash sell History :" +sellH);
         break;
             
     case 3:
             
         sendDash refDash3 = new Dash(); //Upcasting
         Dash send=(Dash)refDash3;  //DownCasting
         send.setDash(dashBal,Balance);
         System.out.println("=======================================");
         System.out.print(refDash3); //toString Overriding
         send.sendDash();
         this.Balance=send.getBal();
         this.dashBal=send.getDash();
         sendH.add(send.hashCode());
         System.out.println("Dash send History :" +sendH);
         break;
             
     case 4:

         System.out.println("Taking Back");
         System.out.println(Balance);
         sub=true;
         break;
     
     default:

         System.out.println("wrong option, please choose between 1-4");
         break;
     }

    }
       
 }

 //Aptos coin

    else if(a==12){

    ArrayList buyH= new ArrayList();
    ArrayList sellH= new ArrayList();
    ArrayList sendH= new ArrayList();

    System.out.println("=======================================");
    AptosCoin refAptos = new Aptos(); //Upcasting
     Aptos aCoin=(Aptos)refAptos;  //DownCasting
    System.out.println("Availabel Balance :" +Balance);
    System.out.println("Your Aptos Balance is :" +aptosBal);
    sub=false;
     
    while(!sub){
     System.out.println("=======================================");
     System.out.println("Please Choose anyone option :");
     System.out.println("1.Buy  Aptos");
     System.out.println("2.Sell Aptos");
     System.out.println("3.Send Aptos");
     System.out.println(n+".Txn History");
     n++;

     if(Balance<100)
    {
        System.out.println(n +".Add Fund");
        n++;
    }
     System.out.println(n+".Back");
     n=4;

     System.out.println("=======================================");
     int b=input.nextInt();

     if (Balance<100) {
        if(b==5)
        {
            System.out.println("Add fund method");
            Balance=addBal.add(Balance);

        }
        else if(b==6)
        {
           System.out.println("Taking Back");
           sub=true;

        }
        else{
        System.out.println("wrong");
        }

    }


 switch (b) {

     case 1:

         System.out.println("=======================================");
         System.out.print(aCoin); //toString Overriding
         this.Balance=refAptos.buyAptos(aptosBal, Balance);
         this.aptosBal=aCoin.getAptos();
         buyH.add(aCoin.hashCode());
         System.out.println("Aptos Buy History :" +buyH);
         break;

     case 2:
             
         System.out.println("=======================================");
         System.out.print(aCoin); //toString Overriding
         this.aptosBal=refAptos.sellAptos(aptosBal, Balance);
         this.Balance=aCoin.getBal();
         sellH.add(aCoin.hashCode());
         System.out.println("Aptos Sell History :" +sellH);
         break;
             
     case 3:
             
         System.out.println("=======================================");
         System.out.print(aCoin); //toString Overriding
         this.aptosBal=refAptos.sendAptos(aptosBal, Balance);
         this.Balance=aCoin.getBal();
         sendH.add(aCoin.hashCode());
         System.out.println("Aptos send History :" +sendH);
         break;

     case 4 :

         txn history= new txn();

         ArrayList buyHistory= new ArrayList();
         ArrayList sellHistory = new ArrayList();
         ArrayList sendHistory= new ArrayList();
         
         buyHistory.addAll(history.txnHistory(buyH));
         buyH.clear();
         buyH.addAll(buyHistory);

         sellHistory.addAll(history.txnHistory(sellH));
         sellH.clear();
         sellH.addAll(sellHistory);
        

         sendHistory.addAll(history.txnHistory(sendH));
         sendH.clear();
         sendH.addAll(sendHistory);

         System.out.println("=======================================");
         System.out.println("Buy History of Aptos" +buyHistory);
         System.out.println("Sell History of Aptos" +sellHistory);
         System.out.println("Send History of Aptos" +sendHistory);
         System.out.println("=======================================");
         break;
      
     case 5:

         System.out.println("Taking Back");
         System.out.println(Balance);
         sub=true;
         break;
     
     default:

         System.out.println("wrong option, please choose between 1-4");
         break;
     }

    }
       
 }

 //ARB coin area
else if(a==13){

    ArrayList buyH= new ArrayList();
    ArrayList sellH= new ArrayList();
    ArrayList sendH= new ArrayList();

    System.out.println("=======================================");
    ArbCoin refArb = new ARB(); //Upcasting
    ARB aCoin=(ARB)refArb;  //DownCasting
    System.out.println("Availabel Balance :" +Balance);
    System.out.println("Your ARB Balance is :" +arbBal);
    sub=false;
     
    while(!sub){
     System.out.println("=======================================");
     System.out.println("Please Choose anyone option :");
     System.out.println("1.Buy  ARB");
     System.out.println("2.Sell ARB");
     System.out.println("3.Send ARB");
     System.out.println(n+".Txn History");
     n++;
     if(Balance<100)
    {
        System.out.println(n +".Add Fund");
        n++;
    }
     System.out.println(n+".Back");
     n=4;

     System.out.println("=======================================");
     int b=input.nextInt();

     if (Balance<100) {
        if(b==5)
        {
            System.out.println("Add fund method");
            Balance=addBal.add(Balance);

        }
        else if(b==6)
        {
           System.out.println("Taking Back");
           sub=true;

        }
        else{
        System.out.println("wrong");
        }

    }


 switch (b) {

     case 1:

         System.out.println("=======================================");
         System.out.print(aCoin); //toString Overriding
         this.Balance=refArb.buyARB(arbBal, Balance);
         this.arbBal=aCoin.getArb();
         buyH.add(aCoin.hashCode());
         System.out.println("ARB Buy History :" +buyH);
         break;

     case 2:
             
         System.out.println("=======================================");
         System.out.print(aCoin); //toString Overriding
         this.arbBal=refArb.sellARB(arbBal, Balance);
         this.Balance=aCoin.getBal();
         sellH.add(aCoin.hashCode());
         System.out.println("ARB Sell History :" +sellH);
         break;
             
     case 3:
             
         System.out.println("=======================================");
         System.out.print(aCoin); //toString Overriding
         this.arbBal=refArb.sendARB(arbBal, Balance);
         this.Balance=aCoin.getBal();
         sendH.add(aCoin.hashCode());
         System.out.println("ARB send History :" +sendH);
         break;

     case 4 :

         txn history= new txn();

         ArrayList buyHistory= new ArrayList();
         ArrayList sellHistory = new ArrayList();
         ArrayList sendHistory= new ArrayList();
         
         buyHistory.addAll(history.txnHistory(buyH));
         buyH.clear();
         buyH.addAll(buyHistory);

         sellHistory.addAll(history.txnHistory(sellH));
         sellH.clear();
         sellH.addAll(sellHistory);
        

         sendHistory.addAll(history.txnHistory(sendH));
         sendH.clear();
         sendH.addAll(sendHistory);

         System.out.println("=======================================");
         System.out.println("Buy History of ARB" +buyHistory);
         System.out.println("Sell History of ARB" +sellHistory);
         System.out.println("Send History of ARB" +sendHistory);
         System.out.println("=======================================");
         break;
    
             
     case 5:
     
         System.out.println("Taking Back");
         System.out.println(Balance);
         sub=true;
         break;
     
     default:

         System.out.println("wrong option, please choose between 1-4");
         break;
     }

    }
       
 }

 //OP coin area

 else if(a==14){

    ArrayList buyH= new ArrayList();
    ArrayList sellH= new ArrayList();
    ArrayList sendH= new ArrayList();

    System.out.println("=======================================");
    System.out.println("Availabel Balance :" +Balance);
    System.out.println("Your OP Balance is :" +opBal);
    sub=false;
     
    while(!sub){
     System.out.println("=======================================");
     System.out.println("Please Choose anyone option :");
     System.out.println("1.Buy  OP");
     System.out.println("2.Sell OP");
     System.out.println("3.Send OP");
     System.out.println(n+".Txn History");
     n++;
     if(Balance<100)
    {
        System.out.println(n +".Add Fund");
        n++;
    }
     System.out.println(n+".Back");
     n=4;

     System.out.println("=======================================");
     int b=input.nextInt();

     if (Balance<100) {
        if(b==5)
        {
            System.out.println("Add fund method");
            Balance=addBal.add(Balance);

        }
        else if(b==6)
        {
           System.out.println("Taking Back");
           sub=true;

        }
        else{
        System.out.println("wrong");
        }

    }


 switch (b) {

     case 1:

         buyOP refOP1 = new OpCoin(); //Upcasting
         OpCoin buy=(OpCoin)refOP1;  //DownCasting
         System.out.println("=======================================");
         System.out.print(refOP1); //toString Overriding
         this.Balance=buy.buyOP(opBal,Balance);
         this.opBal=buy.getOp();

         buyH.add(buy.hashCode());
         System.out.println("OP Buy History :" +buyH);
         break;

     case 2:
             
         sellOP refOP2 = new OpCoin(); //Upcasting
         OpCoin sell=(OpCoin)refOP2;  //DownCasting
         System.out.println("=======================================");
         System.out.print(refOP2); //toString Overriding
         this.opBal=sell.sellOP(opBal, Balance);
         this.Balance=sell.getBal();
        
         sellH.add(sell.hashCode());
         System.out.println("OP sell History :" +sellH);
         break;
         
     case 3:
             
         sendOP refOP3 = new OpCoin(); //Upcasting
         OpCoin send=(OpCoin)refOP3;  //DownCasting
         System.out.println("=======================================");
         System.out.print(refOP3); //toString Overriding
         send.sendOP(opBal,Balance);
         this.Balance=send.getBal();
         this.opBal=send.getOp();
         sendH.add(send.hashCode());
         System.out.println("OP send History :" +sendH);
         break;

     case 4 :

         txn history= new txn();

         ArrayList buyHistory= new ArrayList();
         ArrayList sellHistory = new ArrayList();
         ArrayList sendHistory= new ArrayList();
         
         buyHistory.addAll(history.txnHistory(buyH));
         buyH.clear();
         buyH.addAll(buyHistory);

         sellHistory.addAll(history.txnHistory(sellH));
         sellH.clear();
         sellH.addAll(sellHistory);
        

         sendHistory.addAll(history.txnHistory(sendH));
         sendH.clear();
         sendH.addAll(sendHistory);

         System.out.println("=======================================");
         System.out.println("Buy History of OP :" +buyHistory);
         System.out.println("Sell History of OP :" +sellHistory);
         System.out.println("Send History of OP :" +sendHistory);
         System.out.println("=======================================");
         break;
      
     case 5:

         System.out.println("Taking Back");
         System.out.println(Balance);
         sub=true;
         break;
     
     default:

         System.out.println("wrong option, please choose between 1-4");
         break;
     }

    }
       
 }

 // after creating allCoins class, now we don't need to create individual and logic/method for each coins.

 //Link Coin
 
 else if (a == 15) {
     allCoins link = new allCoins("Link", Balance, linkBal, Link);
     Balance = link.menu();
     linkBal = link.getCoinBal();
 }

 //Portfolio
 
   else if(a==16)
   {

    System.out.println("=======================================");
    System.out.println("------ Wallet Overview ------");
    System.out.println("=======================================");
    System.out.println("USDT Balance :" +Balance);
    System.out.println("BTC Balance :" +btcBal);
    System.out.println("ETH Balance :" +ethBal);
    System.out.println("BNB Balance :" +bnbBal);
    System.out.println("Dot Balance :" +dotBal);
    System.out.println("Matic Balance :" +maticBal);
    System.out.println("Ada Balance :" +adaBal);
    System.out.println("Sol Balance :" +solBal);
    System.out.println("XRP Balance :" +xrpBal);
    System.out.println("Doge Balance :" +dogeBal);
    System.out.println("LTC Balance :" +ltcBal);
    System.out.println("Aptos Balance :" +aptosBal);
    System.out.println("Arb Balance :" +arbBal);
    System.out.println("OP Balance :" +opBal);
    System.out.println("=======================================");
    System.out.println("Choose any available Option");
    System.out.println("1.Back");
    int b=input.nextInt();

    while(!sub)
    {
      if (b==1)
        {
            sub=true;
        }
        else {
            System.out.println("Please choose 1 for Back");
        }
    }
    
   }

 // AtoZ
 



// Add Fund        
        else if(a==17)
        {
         
        while(!sub){

            System.out.println("Previous Balance :" +Balance);
            double bal=refFund.addFund();
            Balance=Balance+bal;
            fundH.addFundHistory(bal);
           // Balance=refFund.getBal()+Balance;
            System.out.println("=======================================");
            System.out.println("Deposit History" +fundH.getTxn());
            System.out.println("Total Available Balance :" +Balance);
            System.out.println("=======================================");
            System.out.println("Choose available Option");
            System.out.println("1.Add More");
            System.out.println("2.Back");
            System.out.println("=======================================");
            int b=input.nextInt();

                if(b==1)
                {
                    System.out.println("");

                }
                else if(b==2)
                {
                    sub=true;
                }
                else {
                    System.out.println("2.Back");
                }

             }
            
        }
// Exit
        else if(a==18)
       {
        System.out.println("LogOut successful");
        menu=true;
       }

}

    else{

        System.out.println("=======================================");
        System.out.println("Please login First");
        System.out.println("=======================================");

    }
}

//menu 2

}

}