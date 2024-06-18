//declaration
public class merchandise
{ 
 private String type;
 private char design;
 
 //normal constructor
 public merchandise ( String t,char d)
 {
     type = t;
     design = d;
 }
 
 //setter
 public void setMerchandise(String t,char d)
 {
 type = t;
 design = d;
 }
 
 public String getType()
 {
 return type;
 }
 
 public char getDesign()
 {
 return design;
 }
 
//processor
public double calcTicket() 
    {
    double price = 0.0;
    int shirt=0;
    int pants=0;
    int keychain=0;
    int headband=0;
    int totebag=0;
    double totalPrice=0;
    
    if (type.equalsIgnoreCase ("shirt"))
    {
        if (design == 'A' || design == 'a') 
            price = 75.0;
         else if (design == 'B' || design == 'b') 
            price = 80.0;
    }
     else if (type.equalsIgnoreCase ("pant")) {
        if (design == 'A' || design == 'a') 
            price = 80.0;
         else if (design == 'B'||design == 'b') 
            price = 85.0;
        }
     else if (type.equalsIgnoreCase ("keychain")) {
        if (design == 'A' || design == 'a') 
            price = 20.0;
        else if (design == 'B' || design == 'b') 
            price = 25.0;
        }
     else if(type.equalsIgnoreCase ("headband")) {
        if (design == 'A' || design == 'a') 
            price = 15.0;
        else if (design == 'B' || design == 'b') 
            price = 20.0;
        }
     else if (type.equalsIgnoreCase ("totebag")) {
        if (design == 'A' || design == 'a') 
            price = 35.0;
        else if (design == 'B' || design == 'b') 
            price = 40.0;
        }
     return price;
    }
     
     public String toString()
 {
 return "\nMerch Type : "+type+"\nMerch Design : "+design+"\nMerch price : "+calcTicket();
    }
}