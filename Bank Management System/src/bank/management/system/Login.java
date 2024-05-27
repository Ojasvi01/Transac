package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton login,clear,signup;
    JTextField cardField;
    JPasswordField pinField;
    Login()
    {
        setTitle("Transact Ease");
        setLayout(null);
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
         Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
         ImageIcon i3=new ImageIcon(i2);
         JLabel label=new JLabel(i3);
         label.setBounds(70,10,100,100);
         add(label);//Adding atm Icon
         
         JLabel text=new JLabel("Welcome to Transact Ease");
         text.setFont(new Font("Osward",Font.BOLD,30));
         text.setBounds(200,40,500,40);
         add(text);//Adding welcome text
         
         //Card Label
         JLabel cardno=new JLabel("Card No : ");
         cardno.setFont(new Font("Raleway",Font.BOLD,20));
         cardno.setBounds(120,150,150,30);
         add(cardno);//Adding card field
         
         cardField=new JTextField();
         cardField.setBounds(300,150,250,30);
         cardField.setFont(new Font("Arial",Font.BOLD,14));
         add(cardField);
         
         //PIN label
         JLabel pin=new JLabel("PIN : ");
         pin.setFont(new Font("Raleway",Font.BOLD,20));
         pin.setBounds(120,220,150,30);
         add(pin);//Adding pin 
         
         pinField=new JPasswordField();
         pinField.setBounds(300,220,250,30);
         pinField.setFont(new Font("Arial",Font.BOLD,14));
         add(pinField);
         
         //----Buttons----
         //Login
         login=new JButton("SignIn");
         login.setBounds(300,300, 100, 30);
         login.setBackground(Color.black);
         login.setForeground(Color.white);
         login.addActionListener(this);
         add(login);
         
         //Clear
         clear=new JButton("Clear");
         clear.setBounds(430,300, 100, 30);
         clear.setBackground(Color.black);
         clear.setForeground(Color.white);
         clear.addActionListener(this);
         add(clear);
         
         //SignUp
         signup=new JButton("SignUp");
         signup.setBounds(312,340, 200, 50);
         signup.setBackground(Color.black);
         signup.setForeground(Color.white);
         signup.addActionListener(this);
         add(signup);
         
         getContentPane().setBackground(Color.WHITE);
        setSize(800,480);//set size of frame
        setVisible(true);//Shows visibility of frame
        setLocation(350,200);//changes the opening location of frame
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==clear)
        {
            cardField.setText("");
            pinField.setText("");
            
        }
        else if(ae.getSource()==signup)
        {
            setVisible(false);
            new SignUp().setVisible(true);
        }
        else if(ae.getSource()==login)
        {
            Conn conn=new Conn();
            String cardnumber= cardField.getText();
            String pinNumber=pinField.getText();
            String query="Select * from login where cardNo='"+cardnumber+"' and pin='"+pinNumber+"'";
            try{
               ResultSet rs= conn.s.executeQuery(query);
               if(rs.next())
               {
                   setVisible(false);
                   new Transactions(pinNumber).setVisible(true);
               }
               else{
                   JOptionPane.showMessageDialog(null,"Incorrect Credentials");
               }
            }catch(Exception e)
            {
             System.out.print(e);
            }
        }
    }
    public static void main(String args[])
    {
        new Login();
    }
}
