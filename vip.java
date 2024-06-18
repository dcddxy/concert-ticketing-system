//polymorphism
public class vip extends customer
{
    public vip()
    {
        super();
    }
    
    public vip(String cn,String ci, String nt, String a, String ce, String s, int q,boolean c, merchandise[] merch  )
    {
        super(cn,ci,nt,a,ce,s,q,c,merch);
    }
    
    public void setvip(String cn,String ci, String nt, String a, String ce, String s, int q, merchandise[] merch )
    {
        super.setCustomer(cn,ci,nt,a,ce,s,q,merch);
    }
    
    public String toString()
    {
     return super.toString();
}
    
    
    }

