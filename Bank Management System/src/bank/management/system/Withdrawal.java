
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Withdrawal extends JFrame implements ActionListener{
    JButton back,withdrawal;
    JTextField amount;
    String pinNumber;
    Withdrawal(String pinNumber){
         this.pinNumber=pinNumber;
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text=new JLabel("Enter the amount you want to withdraw");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,18));
        text.setBounds(170,300,400,20);
        image.add(text);
        
        amount=new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,16));
        amount.setBounds(170,350,330,25);
        image.add(amount);
        
        withdrawal=new JButton("Withdraw");
        withdrawal.setBounds(355,485,150,30);
        image.add(withdrawal);
        withdrawal.addActionListener(this);
        
        back=new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==withdrawal)
        {
            String money=amount.getText();
            Date date=new Date();
            if(money.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter the withdrawal amount ");
            }
            else{
                try
                {    Conn conn=new Conn();
                     String query="insert into bank values('"+pinNumber+"','"+date+"','withdrawal','"+money+"')";
                     conn.s.executeUpdate(query);
                     JOptionPane.showMessageDialog(null, "Amount Rs."+money+" has been withdrawn");
                     setVisible(false);
                     new Transactions(pinNumber).setVisible(true);
                }catch(Exception e){
                    System.out.print(e);
                }
            }
        }
        else if(ae.getSource()==back)
        {
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        }
    }
    public static void main(String args[])
    {
        new Withdrawal("");
    }
}
