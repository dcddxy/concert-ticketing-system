import javax.swing.JOptionPane;
//polymorphism
public class normal extends customer
{
    private String zone;
    
    public normal()
    {
        super();
        zone = "";
    }
    
    public normal(String cn,String ci, String nt, String a, String ce, String s, int q,boolean c, merchandise[] merch ,String z)
    {
        super (cn,ci,nt,a,ce,s,q,c,merch);
        zone = z;
    }
    
    public void normal(String cn,String ci, String nt, String a, String ce, String s, int q, merchandise[] merch )
    {
        super.setCustomer(cn,ci,nt,a,ce,s,q,merch);
    }
    
    public void setZone (String z)
    {
        zone=z;
    }
    public String toString()
    {
     return super.toString()+"\nZone : "+zone;
}
    
}

