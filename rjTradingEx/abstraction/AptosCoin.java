package abstraction;

public abstract class AptosCoin
{
    abstract public double buyAptos(double ltcBalance,double userBalance);
    abstract public double sellAptos(double ltcBalance,double userBalance);
    abstract public double sendAptos(double ltcBalance,double userBalance);

}