import javax.swing.JOptionPane;
import java.io.*;
import java.util.GregorianCalendar;
import java.awt.*;
import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class SeatMenu 
{
    JPanel panel;

    SeatMenu() 
    {
        panel = new JPanel();
        String data[][] = {
                {"1", "VIP", "800"},
                {"2", "NORMAL", ""},
                {"", "GENERAL", "400"},
                {"", "ROCK", "600"}
        };
        String column[] = {"NO.", "SEAT", "PRICE(RM)"};
        JTable jt = new JTable(data, column);
        JScrollPane sp = new JScrollPane(jt);
        panel.add(sp);
        
    }
    }
    

class MerchMenu {
    JPanel panel;

    MerchMenu() {
        panel = new JPanel();
        String data[][] = {
                {"1", "SHIRT", "70", "80"},
                {"2", "PANT", "70", "80"},
                {"3", "KEYCHAIN", "20", "30"},
                {"4", "HEADBAND", "15", "20"},
                {"5", "TOTEBAG", "35", "50"}
        };
        String column[] = {"NO.", "MERCHANDISE", "PRICE- A (RM)", "PRICE-B (RM)"};
        JTable jt = new JTable(data, column);
        JScrollPane sp = new JScrollPane(jt);
        panel.add(sp);
    }
}

public class customerApp 
{
    public static void main(String[] args) throws IOException 
    {
        PrintWriter out1 = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(2, 1));

        SeatMenu seatMenu = new SeatMenu();
        MerchMenu merchMenu = new MerchMenu();
        
        frame.add(seatMenu.panel);
        frame.add(merchMenu.panel);
        
        frame.setSize(400, 500);
        frame.setVisible(true);

        int size, S = 0, z = 0, x = 0, v = 0;
        boolean r = true;
        double sum=0;
        System.out.println("\nWELCOME ! ");
        String cnm = JOptionPane.showInputDialog("Enter Name: ");
        String id = JOptionPane.showInputDialog("Enter IC (ex: xxxxxx-xx-xxxx): ");
        String tel = JOptionPane.showInputDialog("Enter No. tel: ");
        String a = JOptionPane.showInputDialog("Enter Address: ");
        String e = JOptionPane.showInputDialog("Enter email: ");
        String type = JOptionPane.showInputDialog("Enter Seat Type (VIP/normal): ");
        String quant = JOptionPane.showInputDialog("Enter Quantity: ");
        int Q = Integer.parseInt(quant);

        String sizeInput = JOptionPane.showInputDialog("How many merchandise?");
        size = Integer.parseInt(sizeInput);
        merchandise[] merch = new merchandise[size];

        for (int i = 0; i < merch.length; i++) {
            String T = JOptionPane.showInputDialog("Enter Merch Type: ");

            String design = JOptionPane.showInputDialog("Enter Design (A/B): ");
            char dsn = design.charAt(0);
            merch[i] = new merchandise(T, dsn);
        }

        double totalPrice = 0, price = 0, total = 0, ticketSold = 0;
        int vipCount = 0;
        int normalCount = 0;
        if (type.equalsIgnoreCase("VIP")) {
            customer C1 = new vip(cnm, id, tel, a, e, type, Q, r, merch);
            price = 800;
            totalPrice = price * Q;
            vipCount++;
            System.out.println("\n=========Ticket details==========");
            System.out.println(C1.toString() + "\nTicket Price : RM " + totalPrice);
            System.out.println("\n=========Merch details==========");
            S = S + Q;
        } else if (type.equalsIgnoreCase("NORMAL")) {
            String choose = JOptionPane.showInputDialog("Choose zone (general/rock):");
            customer C2 = new normal(cnm, id, tel, a, e, type, Q, r, merch, choose);
            if (choose.equalsIgnoreCase("general"))
                price = 400;
            else if (choose.equalsIgnoreCase("rock"))
                price = 600;
            totalPrice = price * Q;
            normalCount++;
            System.out.println("\n=========Ticket details==========");
            System.out.println(C2.toString() + "\nTicket Price : RM " + totalPrice);
            System.out.println("\n=========Merch details==========");
            z = z + Q;
        }
        ticketSold= normalCount + vipCount;
        
        for (int j = 0; j < merch.length; j++) {
            System.out.println(merch[j].toString());
            sum = merch[j].calcTicket() + sum;
            System.out.println("\nMerch total price : " + sum);
            System.out.println("\n==================================");
            sum = 0;
        }

        for (int k = 0; k < merch.length; k++) 
        {
            total = sum + totalPrice;
        }
        System.out.println("TOTAL PRICE IS: RM " + total);
        System.out.println("==================================");

        int sec, m, h;
        GregorianCalendar date = new GregorianCalendar();
        int day, mon, y;
        day = date.get(GregorianCalendar.DAY_OF_MONTH);
        mon = date.get(GregorianCalendar.MONTH);
        y = date.get(GregorianCalendar.YEAR);
        sec = date.get(GregorianCalendar.SECOND);
        m = date.get(GregorianCalendar.MINUTE);
        h = date.get(GregorianCalendar.HOUR);
        System.out.println("\nDate: " + day + "/" + (mon + 1) + "/" + y);
        System.out.println("Time: " + h + ":" + m + ":" + sec);
        System.out.println("Your ticket ID :" + day + sec + y);

        String ans = JOptionPane.showInputDialog("Do you confirm this ticket? or do you want to cancel it? (confirm/cancel): ");
        if (ans.equalsIgnoreCase("confirm"))
            {
                r = true;
                System.out.println ("Thank you for your purchase!.Please enjoy your concert.");
            }
        else if (ans.equalsIgnoreCase("cancel")) 
        {
            r = false;
            System.out.println ("Your ticket has been cancelled.Thank you for your time.");
            if (type.equalsIgnoreCase("vip"))
                x = x + Q;
            else if (type.equalsIgnoreCase("normal"))
                v = v + Q;
        

        customer q = new customer(cnm, id, tel, a, e, type, Q, r, merch);
        q.isCancel();
        boolean isCanceled = q.isCancel();
        if (isCanceled) 
        {
            String refund = JOptionPane.showInputDialog("Would you like a refund? (yes/no): ");
            if (refund.equalsIgnoreCase("yes")) 
            {
                // Perform refund process
                System.out.println("Refund will be given within 24 hours.");
            }
            else
                System.out.println("No refund");
        }
    }
    out1.println("Name: " + cnm + "\nCustomer ID: " + id + "\nNo. Tel: " + tel + "\nAddress: " + a + "\nEmail: " + e + "\nSeat: " + type + "\nQuantity: " + quant);
        System.out.println("\nTotal customer : " + "\n VIP :" + S + "\n Normal : " + z); 
        System.out.println("\nTotal customer : " + "\n VIP :" + S + "\n Normal : " + z);
        System.out.println("\nTotal customer cancel ticket :" + "\n VIP :" + x + "\n Normal : " + v);
        System.out.println("\nTotal ticket sold : " +ticketSold);
        
    out1.close();
    }
}
