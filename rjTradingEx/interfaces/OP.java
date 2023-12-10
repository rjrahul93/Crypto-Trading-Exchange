package interfaces;

import java.util.Scanner;

public class OP {

    double opBal, userBal, txn;
    double Op=1.35;
    Scanner choice = new Scanner(System.in);


    public double getOp(){
        return opBal;

    }

     public double getBal(){
        return userBal;

    }

    @Override
    public int hashCode()
    {
        return  (int) txn;
    }

    @Override
     public String toString() //overriding toString method of object class
    {
        System.out.println("OP current Price :" +Op +"$");
        return "";
    
    }
    
}
