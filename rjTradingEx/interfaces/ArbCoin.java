package interfaces;

public interface ArbCoin {

    abstract public double buyARB(double arbBalance,double userBalance);
    abstract public double sellARB(double arbBalance,double userBalance);
    abstract public double sendARB(double arbBalance,double userBalance);
    
}
