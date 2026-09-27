package Bank.Management.System;

import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class signup extends JFrame implements ActionListener{

    JRadioButton r1,r2,r3,r4,r5,r6;
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14;
    JTextField text1,text2,text3,text4,text5,text6,text7,text8;
    
    JDateChooser dateChooser;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;

    String first = "" + Math.abs(first4);

    signup(){

        super("Signup Page");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        setLayout(null);
        
        JLabel image = new JLabel(i3);
        image.setBounds(40,10,100,100);
        add(image);

        label1 = new JLabel("Application Form No. " + first);
        label1.setFont(new Font("Raleway",Font.BOLD,38));       
        label1.setBounds(190,20,600,40);
        add(label1);

        label2 = new JLabel("Page 1: Personal Details");
        label2.setFont(new Font("Raleway",Font.BOLD,20));       
        label2.setBounds(290,70,400,30);
        add(label2);

        label3 = new JLabel("Name:");
        label3.setFont(new Font("Raleway",Font.BOLD,20));       
        label3.setBounds(100,140,100,30);
        add(label3);

        text1 = new JTextField();   
        text1.setFont(new Font("Raleway",Font.BOLD,14));
        text1.setBounds(250,140,400,30);
        add(text1);

        label4 = new JLabel("Father's Name:");
        label4.setFont(new Font("Raleway",Font.BOLD,20));       
        label4.setBounds(100,190,200,30);
        add(label4);

        text2 = new JTextField();
        text2.setFont(new Font("Raleway",Font.BOLD,14));        
        text2.setBounds(250,190,400,30);
        add(text2);

        label5 = new JLabel("Date of Birth:");
        label5.setFont(new Font("Raleway",Font.BOLD,20));
        label5.setBounds(100,240,200,30);
        add(label5);    

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(250,240,400,30);  
        add(dateChooser);
        

        label6 = new JLabel("Gender:");
        label6.setFont(new Font("Raleway",Font.BOLD,20));       
        label6.setBounds(100,290,200,30);
        add(label6);

        r1 = new JRadioButton("Male");
        r1.setBounds(250,290,60,30);
        r1.setBackground(new Color(245, 245, 220));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(350,290,80,30);
        r2.setBackground(new Color(245, 245, 220));
        add(r2);

        r6 = new JRadioButton("LGBTQ+");
        r6.setBounds(460,290,80,30);
        r6.setBackground(new Color(245, 245, 220));
        add(r6);

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);    
        groupgender.add(r2);
        groupgender.add(r6);


        label7 = new JLabel("Email Address:");
        label7.setFont(new Font("Raleway",Font.BOLD,20));   
        label7.setBounds(100,340,200,30);
        add(label7);

        text3 = new JTextField();
        text3.setFont(new Font("Raleway",Font.BOLD,14));    
        text3.setBounds(250,340,400,30);
        add(text3);

        label8 = new JLabel("Marital Status:");
        label8.setFont(new Font("Raleway",Font.BOLD,20));   
        label8.setBounds(100,390,200,30);
        add(label8);

        r3 = new JRadioButton("Married");
        r3.setBounds(250,390,80,30);
        r3.setBackground(new Color(245, 245, 220));
        add(r3);

        r4 = new JRadioButton("Unmarried");
        r4.setBounds(350,390,100,30);   
        r4.setBackground(new Color(245, 245, 220));
        add(r4);

        r5 = new JRadioButton("Other");
        r5.setBounds(460,390,80,30);
        r5.setBackground(new Color(245, 245, 220));
        add(r5);

        ButtonGroup groupmarital = new ButtonGroup();
        groupmarital.add(r3);   
        groupmarital.add(r4);
        groupmarital.add(r5);

        label9 = new JLabel("Address:");
        label9.setFont(new Font("Raleway",Font.BOLD,20));
        label9.setBounds(100,440,200,30);
        add(label9);

        text4 = new JTextField();
        text4.setFont(new Font("Raleway",Font.BOLD,14));    
        text4.setBounds(250,440,400,30);
        add(text4);

        label10 = new JLabel("City:");
        label10.setFont(new Font("Raleway",Font.BOLD,20));
        label10.setBounds(100,490,200,30);
        add(label10);

        text5 = new JTextField();       
        text5.setFont(new Font("Raleway",Font.BOLD,14));
        text5.setBounds(250,490,400,30);
        add(text5); 

        label11 = new JLabel("Pin Code:");
        label11.setFont(new Font("Raleway",Font.BOLD,20));
        label11.setBounds(100,540,200,30);
        add(label11);

        text6 = new JTextField();
        text6.setFont(new Font("Raleway",Font.BOLD,14));
        text6.setBounds(250,540,400,30);
        add(text6);

        label12 = new JLabel("State:");
        label12.setFont(new Font("Raleway",Font.BOLD,20));  
        label12.setBounds(100,590,200,30);
        add(label12);

        text7 = new JTextField();
        text7.setFont(new Font("Raleway",Font.BOLD,14));
        text7.setBounds(250,590,400,30);
        add(text7);

        



         JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,690,80,30);
        next.addActionListener(this);
        add(next);
   
        setLayout(null);
        getContentPane().setBackground(new Color(245, 245, 220));
        
       setSize(850,800);
        setLocation(390,15);
        setVisible(true);
    }

        @Override
public void actionPerformed(ActionEvent e) {

    
    String formno = first;
    String name = text1.getText();
    String fname = text2.getText();
    String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
    String gender = null;
    if (r1.isSelected()) {
        gender = "Male";        
    } else if (r2.isSelected()) {
        gender = "Female";
    } else if (r6.isSelected()) {
        gender = "LGBTQ+"; 
    }
    String email = text3.getText();
    String marital = null;
    if (r3.isSelected()) {
        marital = "Married";
    } else if (r4.isSelected()) {
        marital = "Unmarried";
    } else if (r5.isSelected()) {
        marital = "Other";
    }
    String address = text4.getText();
    String city = text5.getText();
    String pincode = text6.getText();
    String state = text7.getText();

    
        
    try {

        if(text1.getText().equals("")){ 
            JOptionPane.showMessageDialog(
                null, 
                "Name is required.");
            return;
            
        
        }
        else{
        connect c = new connect();
        String query = "INSERT INTO signup VALUES('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','" + pincode + "','" + state + "')";
        c.s.executeUpdate(query);
        new signup2(first);
        setVisible(false);
         
        }

       
        
    } catch (Exception E) {
        E.printStackTrace();
        
    }


}
 
    public static void main(String[] args) {
        new signup();
    }
    
}
