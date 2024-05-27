
package bank.management.system;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class SignUp extends JFrame implements ActionListener {
    long random;
    JTextField cityfield,statefield,pincodefield,namefield,fnamefield,emailfield,addressfield;
    JDateChooser datechooser;
    JRadioButton male,female,married,unmarried,other;
    JButton next;
SignUp(){
    Random ran=new Random();
    random=Math.abs((ran.nextLong()%9000L)+1000L);
    setLayout(null);
    //Application form number
    JLabel formno=new JLabel("Application FORM NO. "+random);
    formno.setBounds(140,20,600,40);
    formno.setFont(new Font("Raleway",Font.BOLD,38));
    add(formno);
    
    //---Personal Details---
    //Page1
    JLabel personaldetails=new JLabel("Page1 :Personal Details");
    personaldetails.setBounds(290,80,400,30);
    personaldetails.setFont(new Font("Raleway",Font.BOLD,22));
    add(personaldetails);
    
    //Name
    JLabel name=new JLabel("Name: ");
    name.setBounds(100,140,100,30);
    name.setFont(new Font("Raleway",Font.BOLD,20));
    add(name);
    
    namefield=new JTextField();
    namefield.setFont(new Font("Raleway",Font.BOLD,14));
    namefield.setBounds(300,140,400,30);
    add(namefield);
    //Fathers name
    JLabel fname=new JLabel("Father's Name: ");
    fname.setBounds(100,190,200,30);
    fname.setFont(new Font("Raleway",Font.BOLD,20));
    add(fname);
    
    fnamefield=new JTextField();
    fnamefield.setFont(new Font("Raleway",Font.BOLD,14));
    fnamefield.setBounds(300,190,400,30);
    add(fnamefield);
    
    //dob
    JLabel dob=new JLabel("date of birth: ");
    dob.setBounds(100,240,200,30);
    dob.setFont(new Font("Raleway",Font.BOLD,20));
    add(dob);
    
    datechooser =new JDateChooser();
    datechooser.setBounds(300,240,400,30);
    datechooser.setForeground(new Color(105,105,105));
    add(datechooser);
    
    //Gender
    JLabel gender=new JLabel("Gender: ");
    gender.setBounds(100,290,200,30);
    gender.setFont(new Font("Raleway",Font.BOLD,20));
    add(gender);
    
    male=new JRadioButton("Male");
    male.setBounds(300,290,60,30);
    male.setBackground(Color.WHITE);
    add(male);
    female=new JRadioButton("Female");
    female.setBounds(450,290,120,30);
    female.setBackground(Color.WHITE);
    add(female);
    
    
    ButtonGroup gendergroup=new ButtonGroup();
    gendergroup.add(male);
    gendergroup.add(female);
    //Email
    JLabel email=new JLabel("Email Address: ");
    email.setBounds(100,340,200,30);
    email.setFont(new Font("Raleway",Font.BOLD,20));
    add(email);
    
    emailfield=new JTextField();
    emailfield.setFont(new Font("Raleway",Font.BOLD,14));
    emailfield.setBounds(300,340,400,30);
    add(emailfield);
    
    //Marital Status
    JLabel marital=new JLabel("Marital Status: ");
    marital.setBounds(100,390,200,30);
    marital.setFont(new Font("Raleway",Font.BOLD,20));
    add(marital);
    married=new JRadioButton("Married");
    married.setBounds(300,390,100,30);
    married.setBackground(Color.WHITE);
    add(married);
    unmarried=new JRadioButton("Unmarried");
    unmarried.setBounds(450,390,120,30);
    unmarried.setBackground(Color.WHITE);
    add(unmarried);
    other=new JRadioButton("Other");
    other.setBounds(600,390,180,30);
    other.setBackground(Color.WHITE);
    add(other);
    
    ButtonGroup maritalgroup=new ButtonGroup();
    maritalgroup.add(married);
    maritalgroup.add(unmarried);
    maritalgroup.add(other);
    //Address
    JLabel address=new JLabel("Address: ");
    address.setBounds(100,440,200,30);
    address.setFont(new Font("Raleway",Font.BOLD,20));
    add(address);
    
    addressfield=new JTextField();
    addressfield.setFont(new Font("Raleway",Font.BOLD,14));
    addressfield.setBounds(300,440,400,30);
    add(addressfield);
    
    //City
    JLabel city=new JLabel("City: ");
    city.setBounds(100,490,200,30);
    city.setFont(new Font("Raleway",Font.BOLD,20));
    add(city);
    
    cityfield=new JTextField();
    cityfield.setFont(new Font("Raleway",Font.BOLD,14));
    cityfield.setBounds(300,490,400,30);
    add(cityfield);
    
    //state
    JLabel state=new JLabel("State: ");
    state.setBounds(100,540,200,30);
    state.setFont(new Font("Raleway",Font.BOLD,20));
    add(state);
    
    statefield=new JTextField();
    statefield.setFont(new Font("Raleway",Font.BOLD,14));
    statefield.setBounds(300,540,400,30);
    add(statefield);
    
    //Pincode
    JLabel pincode=new JLabel("pincode: ");
    pincode.setBounds(100,590,200,30);
    pincode.setFont(new Font("Raleway",Font.BOLD,20));
    add(pincode);
    
    pincodefield=new JTextField();
    pincodefield.setFont(new Font("Raleway",Font.BOLD,14));
    pincodefield.setBounds(300,590,400,30);
    add(pincodefield);
    
    next=new JButton("Next");
    next.setBackground(Color.BLACK);
    next.setForeground(Color.WHITE);
    next.setFont(new Font("Raleway",Font.BOLD,14));
    next.setBounds(620,660,80,30);
    next.addActionListener(this);
    add(next);
    getContentPane().setBackground(Color.WHITE);
    setSize(850,800);
    setLocation(350,10);
    setVisible(true);
   
}  
public void actionPerformed(ActionEvent ae)
{
    String formno=""+random;
    String name=namefield.getText();
    String fname=fnamefield.getText();
    String dob=((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
    String gender=null;
    if(male.isSelected()){
        gender="Male";
    }   else if(female.isSelected()){
    gender="Female";
    }
    String email=emailfield.getText();
    String marital=null;
    if(married.isSelected())
    {
        marital="Married";
    }
    else if(unmarried.isSelected())
    {
        marital="Unmarried";
    }
    else if(other.isSelected())
    {
        marital="Other";
    }
    String address=addressfield.getText();
    String city=cityfield.getText();
    String state=statefield.getText();
    String pin=pincodefield.getText();
    
    try{
        if(name.equals(""))
        {
             JOptionPane.showMessageDialog(null,"Name is Required");
        }
        if(fname.equals(""))
         {
             JOptionPane.showMessageDialog(null,"Father's name is Required");
         }
        if(dob.equals(""))
         {
             JOptionPane.showMessageDialog(null,"date of birth is Required");
         }
         if(gender.equals(""))
         {
             JOptionPane.showMessageDialog(null,"Gender is Required");
         }
         if(email.equals(""))
         {
             JOptionPane.showMessageDialog(null,"Email is Required");
         }
         if(marital.equals(""))
         {
             JOptionPane.showMessageDialog(null,"Marital status is Required");
         }
         if(address.equals(""))
         {
             JOptionPane.showMessageDialog(null,"Address is Required");
         }
         if(city.equals(""))
         {
             JOptionPane.showMessageDialog(null,"City is Required");
         }
         if(state.equals(""))
         {
             JOptionPane.showMessageDialog(null,"State is Required");
         }
         if(pin.equals(""))
         {
             JOptionPane.showMessageDialog(null,"Pincode is Required");
         }
         else {
            Conn c=new Conn();
            String query="insert into signup values ('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
            c.s.executeUpdate(query);
            setVisible(false);
            new SignUp2(formno).setVisible(true);
         }
    } catch(Exception e){
        System.err.println(e);
    }
}
public static void main(String args[])
{
    new SignUp();
}
}