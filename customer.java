import java.util.*;
//declaration        //superclass
public class customer
{
// private instance variable
 private String custName; 
 private String custID; 
 private String noTel; 
 private String address; 
 private String custEmail;
 private String seat;
 private int quantity; 
 private boolean cancel;
 private int[] merch;

 //default constructor
 public customer()
 {
     custName = null;
     custID = null;
     noTel = null;
     address = null;
     custEmail = null;
     seat = null;
     quantity = 0;
     cancel = false;
 
 for(int i=0; i<merch.length; i++)
 {
     merch[i] = merch[i];
 }
 }
 
 //normal constructor
 public customer(String cn,String ci, String nt, String a, String ce, String s, int q,boolean c, merchandise[] merch ) 
 {
     custName = cn;
     custID = ci;
     noTel = nt;
     address = a;
     custEmail = ce;
     seat = s;
     quantity = q;
     cancel = c;
 
 for(int i=0; i<merch.length; i++)
 {
     merch[i] = merch[i];
 }
 }

 //accessor
 
 public String getCustName() 
{ 
 return custName; 
 } 

public String getCustID() 
{ 
 return custID; 
 } 

public String getNoTel() 
{ 
 return noTel; 
 } 

public String getAddress() 
{ 
 return address;
 } 

public String getCustEmail() 
{ 
 return custEmail; 
 } 

public String getSeat()
{
    return seat;
}

public boolean getCancel()
{
    return cancel;
}

public int getQuantity()
{
    return quantity;
}

//storer
 public void setCustomer(String cn, String ci, String nt, String a, String ce, String s, int q, merchandise[] merch) 
 {
    custName = cn;
    custID = ci;
    noTel = nt;
    address = a;
    custEmail = ce;
    seat = s;
    quantity = q;
 
 for(int i=0; i<merch.length; i++)
 {
     merch[i] = merch[i];
 }
}

public void setCancel(boolean c)
{
    cancel = c;
}

public boolean isCancel()
{
    if (cancel)
    {}  
    return true;
}

//dislay
public String toString()
 {
 return "\nCustomer Name: "+custName + "\nCustomer IC: "+custID + "\nTelephone Number: "+noTel + "\nAddress: "+address
 + "\nEmail: "+custEmail+"\nseat: "+seat+"\nQuantity: "+quantity;
}
}


