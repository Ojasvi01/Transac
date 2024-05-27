package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;


public class MiniStatement extends JFrame{
    String pinNumber;
    public MiniStatement(String pinNumber)
    {   
        setLayout(null);
        setTitle("Mini Statement");
        JLabel mini=new JLabel();
        mini.setBounds(20,150,500,200);
        mini.setFont(new Font("Raleway",Font.BOLD,16));
        add(mini);
        JLabel bank=new JLabel("Transact Ease");
        bank.setBounds(200,20,200,24);
        bank.setFont(new Font("Raleway",Font.BOLD,20));
        add(bank);
        
        JLabel card=new JLabel();
        card.setBounds(20,80,500,50);
        add(card);
        JLabel balance=new JLabel();
        balance.setBounds(180,400,300,20);
        add(balance);
        try{
            Conn conn=new Conn();
            
            ResultSet rs=conn.s.executeQuery("Select * from login where pin ='"+pinNumber+"'");
            while(rs.next())
            {
                card.setText("CARD NUMBER : "+rs.getString("cardNo").substring(0,4)+"XXXXXXXX"+rs.getString("cardNo").substring(12));
                
            }
            
        }catch(Exception e)
        {
            System.out.print(e);
        }
        try{
            Conn conn=new Conn();
            int bal=0;
            ResultSet rs=conn.s.executeQuery("SELECT * FROM BANK WHERE PIN= '"+pinNumber+"'");
            while(rs.next())
            {
             mini.setText(mini.getText()+"<HTML>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br>");   
                if(rs.getString("type").equals("deposit")){
                    bal += Integer.parseInt(rs.getString("amount"));
                }
                else{
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }
            balance.setText("Your Current Account balance is "+bal);
        }catch(Exception e)
        {
            System.out.print(e);
        }
        setSize(600,600);
        setLocation(20,20);
        setVisible(true);
        this.pinNumber=pinNumber;
    }
public static void main(String args[])
{
    new MiniStatement("");
}
}
