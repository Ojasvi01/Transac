
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java .awt.event.*;
import java.util.*;
public class SignUp3 extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    SignUp3(String formno){
        this.formno=formno;
        setLayout(null);
        JLabel l1=new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel type=new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,150,20);
        add(r1);
        
        r2=new JRadioButton("FD Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,120,20);
        add(r2);
        
        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,160,20);
        add(r3);
        
        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);
        
        ButtonGroup groupacc=new ButtonGroup();
        groupacc.add(r1);
        groupacc.add(r2);
        groupacc.add(r3);
        groupacc.add(r4);
        
        JLabel card=new JLabel("Card Number ");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel number=new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,250,30);
        add(number);
        
        JLabel cardDetails=new JLabel("Your Card No. ");
        cardDetails.setFont(new Font("Raleway",Font.BOLD,12));
        cardDetails.setBounds(100,330,300,20);
        add(cardDetails);
        
        JLabel pin=new JLabel("PIN Number");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pnumber=new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,370,250,30);
        add(pnumber);
        
        JLabel pinDetails=new JLabel("Your PIN No. ");
        pinDetails.setFont(new Font("Raleway",Font.BOLD,12));
        pinDetails.setBounds(100,400,300,20);
        add(pinDetails);
        
        JLabel services=new JLabel("Services required ");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,200,30);
        add(services);
        
        c1=new JCheckBox("ATM Card ");
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2=new JCheckBox("Internet Banking ");
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3=new JCheckBox("Mobile Banking ");
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4=new JCheckBox("Email & SMS Alerts ");
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);
        
        c5=new JCheckBox("Cheque Book ");
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6=new JCheckBox("E-Statments ");
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c1=new JCheckBox("I here by declare that the above entered details are correct to the best of my knowledge.");
        c1.setFont(new Font("Raleway",Font.BOLD,12));
        c1.setBounds(100,680,600,30);
        add(c1);
        
        submit=new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel=new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(400,720,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
        
        
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==cancel)
        {
            
        }
        else if(ae.getSource()==submit)
        {
            String accType=null;
            if(r1.isSelected())
            {
                accType="Saving Account";
            }
            else if(r2.isSelected())
            {
                accType="Fixed Deposit Account";
            }
            else if(r3.isSelected())
            {
                accType="Current Account";
            }
            else if(r4.isSelected())
            {
                accType="Reccuring Deposit Account";
            }
            Random rand=new Random();
            String cardno=""+Math.abs((rand.nextLong()%90000000L)*5040936000000000L);
            String pinno=""+Math.abs((rand.nextLong()%9000L)+1000L);
            String facility="";
            if(c1.isSelected())
            {
                facility+="ATM Card";
            }
            else if(c2.isSelected())
            {
                facility+="Internet Banking";
            }
            else if(c3.isSelected())
            {
                facility+="Mobile Banking";
            }
            else if(c4.isSelected())
            {
                facility+="EMAIL & SMS ALERT";
            }
            else if(c5.isSelected())
            {
                facility+="Cheque Book";
            }
            else if(c6.isSelected())
            {
                facility+="E-Statement";
            }
            try{
                if(accType.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Account type is Required");
                }
                else{
                    Conn conn=new Conn();
                    String query1="insert into signup3 values('"+formno+"','"+accType+"','"+cardno+"','"+pinno+"','"+facility+"')";
                    String query2="insert into login values('"+formno+"','"+cardno+"','"+pinno+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Card Number: "+cardno+"\nPin: "+pinno);
                    setVisible(false);
                    new Deposit(pinno).setVisible(false);
                }
            }catch(Exception e){
                System.out.print(e);
            }
        }else if(ae.getSource()==cancel)
        {
            setVisible(false);
            new Login().setVisible(true);
        }
        
    }
    public static void main(String args[])
    {
        new SignUp3("");
    }

    void setVisibilty(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
