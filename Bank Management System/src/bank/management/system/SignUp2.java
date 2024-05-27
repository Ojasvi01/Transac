
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class SignUp2 extends JFrame implements ActionListener {
    
    JTextField adhaar,pan;
    JComboBox education,religion,category,salary,occupation;
    JRadioButton syes,sno,eno,eyes;
    JButton next;
    String formno;
SignUp2(String formno){
   this.formno=formno;
    setLayout(null);
    setTitle("New Account Application Form - Page 2");
  
    //---Personal Details---
    //Page1
    JLabel additionaldetails=new JLabel("Page2 :Addtional Details");
    additionaldetails.setBounds(290,80,400,30);
    additionaldetails.setFont(new Font("Raleway",Font.BOLD,22));
    add(additionaldetails);
    
    //Name
    JLabel religionlabel=new JLabel("Religion :");
    religionlabel.setBounds(100,140,100,30);
    religionlabel.setFont(new Font("Raleway",Font.BOLD,20));
    add(religionlabel);
    String valreligion[]={"Please Select","Hindu","Muslim","Christian","Sikh","Other"};
    religion = new JComboBox(valreligion);
    religion.setBounds(300,140,400,30);
    religion.setBackground(Color.WHITE);
    add(religion);
    //Fathers name
    JLabel Categorylabel=new JLabel("Category :");
    Categorylabel.setBounds(100,190,200,30);
    Categorylabel.setFont(new Font("Raleway",Font.BOLD,20));
    add(Categorylabel);
    String valCategory[]={"Please Select","General","OBC","SC","ST","Other"};
    category=new JComboBox(valCategory);
    category.setBounds(300,190,400,30);
    category.setBackground(Color.WHITE);
    add(category);
    
    //dob
    JLabel Income=new JLabel("Income :");
    Income.setBounds(100,240,200,30);
    Income.setFont(new Font("Raleway",Font.BOLD,20));
    add(Income);
    
    String valSalary[]={"Please Select","Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
    salary=new JComboBox(valSalary);
    salary.setBounds(300,240,400,30);
    salary.setBackground(Color.WHITE);
    add(salary);
    
    //Gender
    JLabel edu=new JLabel("Educational");
    edu.setBounds(100,290,200,30);
    edu.setFont(new Font("Raleway",Font.BOLD,20));
    add(edu);
    
    
    //Email
    JLabel qualification=new JLabel("Qualitification : ");
    qualification.setBounds(100,315,200,30);
    qualification.setFont(new Font("Raleway",Font.BOLD,20));
    add(qualification);
    String valEdu[]={"Please Select","Non-Graduation","Graduate","Post-Graduate","Doctrate","Others"};
    education=new JComboBox(valEdu);
    education.setBounds(300,300,400,30);
    add(education);
    
    //Marital Status
    JLabel designation=new JLabel("Occupation :");
    designation.setBounds(100,390,200,30);
    designation.setFont(new Font("Raleway",Font.BOLD,20));
    add(designation);
    String valOcc[]={"Please Select","Salaried","Self-Employeed","Businessman","Student","Retired","Others"};
    occupation=new JComboBox(valOcc);
    occupation.setBounds(300,390,400,30);
    occupation.setBackground(Color.WHITE);
    add(occupation);
    //Address
    JLabel panNo=new JLabel("PAN Number :");
    panNo.setBounds(100,440,200,30);
    panNo.setFont(new Font("Raleway",Font.BOLD,20));
    add(panNo);
    
    pan=new JTextField();
    pan.setFont(new Font("Raleway",Font.BOLD,14));
    pan.setBounds(300,440,400,30);
    add(pan);
    
    //City
    JLabel adhaarNo=new JLabel("Adhaar Number :");
    adhaarNo.setBounds(100,490,200,30);
    adhaarNo.setFont(new Font("Raleway",Font.BOLD,20));
    add(adhaarNo);
    
    adhaar=new JTextField();
    adhaar.setFont(new Font("Raleway",Font.BOLD,14));
    adhaar.setBounds(300,490,400,30);
    add(adhaar);
    
    //state
    JLabel SeniorCitizen=new JLabel("Senior Citizen :");
    SeniorCitizen.setBounds(100,540,200,30);
    SeniorCitizen.setFont(new Font("Raleway",Font.BOLD,20));
    add(SeniorCitizen);
    
    syes=new JRadioButton("Yes");
    syes.setBounds(300,540,120,20);
    syes.setBackground(Color.WHITE);
    add(syes);
    
    sno=new JRadioButton("No");
    sno.setBounds(450,540,180,20);
    sno.setBackground(Color.WHITE);
    add(sno);
    ButtonGroup sgroup=new ButtonGroup();
    sgroup.add(sno);
    sgroup.add(syes);
    //Pincode
    JLabel ExistingAcc=new JLabel("Existing Account :");
    ExistingAcc.setBounds(100,590,200,30);
    ExistingAcc.setFont(new Font("Raleway",Font.BOLD,20));
    add(ExistingAcc);
    
    eyes=new JRadioButton("Yes");
    eyes.setBounds(300,600,120,20);
    eyes.setBackground(Color.WHITE);
    add(eyes);
    
    eno=new JRadioButton("No");
    eno.setBounds(450,600,180,20);
    eno.setBackground(Color.WHITE);
    add(eno);
    ButtonGroup egroup=new ButtonGroup();
    egroup.add(eno);
    egroup.add(eyes);
    
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
   
    String sreli=(String)religion.getSelectedItem();
    String scategory=(String)category.getSelectedItem();
    String sIncome=(String)salary.getSelectedItem();
    String sedu=(String)education.getSelectedItem();
    String socc=(String)occupation.getSelectedItem();
    String seniorCitizens=null;
    if(syes.isSelected())
    {
        seniorCitizens="Yes";
    }
    else if(sno.isSelected())
    {
        seniorCitizens="No";
    }
    String accExists=null;
    if(eyes.isSelected())
    {
        accExists="Yes";
    }
    else if(eno.isSelected())
    {
        accExists="No";
    }
    String span=pan.getText();
    String sadhaar=adhaar.getText();
     try{
        Conn c=new Conn();
        String query="insert into signup2 values ('"+formno+"','"+sreli+"','"+scategory+"','"+sIncome+"','"+sedu+"','"+socc+"','"+span+"','"+sadhaar+"','"+accExists+"','"+seniorCitizens+"')";
        c.s.executeUpdate(query);
        setVisible(false);
        new SignUp3(formno).setVisible(true);
        //signup3 object;
    }catch(Exception e){
        System.out.println(e);
    }
    
}
public static void main(String args[])
{
    new SignUp2("");
}
}