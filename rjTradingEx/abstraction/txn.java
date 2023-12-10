package abstraction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class txn {

    public ArrayList txnHistory(ArrayList b)
    {
         ArrayList  c = new ArrayList();
         c.addAll(b);
         ListIterator <Integer> i = c.listIterator();

        while(i.hasNext())
        {
                if(i.next()==0)
                {
                    i.remove();

                }
        }
       

        return c;

    }
    
}
