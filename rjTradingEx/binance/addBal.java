public class addBal extends UserDetails {

    public double add(double Bal)
    {
                System.out.println("Previous Balance :" +Bal);
                addFH=refFund.addFund();
                Bal = addFH + Bal;
                System.out.println("Total Available Balance :" +Bal);
               // fundH.addFundHistory(addFH);
               // System.out.println("Deposit History :" +fundH.getTxn());
                return Bal;

    }
    
}
