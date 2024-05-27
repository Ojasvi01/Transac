
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

public class BalanceEnquiry extends JFrame implements ActionListener{
    JButton back;
    String pinNumber;
    public BalanceEnquiry(String pinNumber)
    {   
        this.pinNumber=pinNumber;
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        back=new JButton("Back");
        back.setBounds(260,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        Conn c=new Conn();
            int balance=0;
        try{
            ResultSet rs=c.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");
            while(rs.next())
            {
                if(rs.getString("type").equals("deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }
                else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            
        }catch(Exception e){
            System.out.print(e);
        }
        JLabel text=new JLabel("Your Currenct Account Balance is Rs."+balance);
        text.setForeground(Color.WHITE);
        text.setBounds(220,300,400,30);
        image.add(text);
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
    setVisible(false);
    new Transactions(pinNumber).setVisible(true);
    }
public static void main(String args[])
{
    new BalanceEnquiry("");
}

    
}
