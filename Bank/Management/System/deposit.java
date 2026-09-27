package Bank.Management.System;

import javax.swing.*;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;


public class deposit extends JFrame implements ActionListener{

    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13;
    JTextField text1,text2;
    JButton b1,b2;

    String pin;
    deposit(String pin){
    this.pin=pin;



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,730,Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        setLayout(null);
        
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

         label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT" );
         label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Raleway",Font.BOLD,16));       
        label1.setBounds(460,180,400,30);
        image.add(label1);

        text1 = new JTextField();
        text1.setBackground(new Color(65,125,128));
        text1.setForeground(Color.WHITE);
        text1.setFont(new Font("Raleway",Font.BOLD,22));
        text1.setBounds(460,230,320,25);
        image.add(text1);


          b1 = new JButton("DEPOSIT");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        image.add(b1);

          b2 = new JButton("EXIT");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        image.add(b2);




























        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);



    }
 @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = text1.getText();
            Date date = new Date();
            if (e.getSource()==b1){
                if (text1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the Amount you want to Deposit");
                }else {
                    connect c = new connect();
                    c.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"','Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new main_Class(pin);
                    
                }
            }else if (e.getSource()==b2){
                setVisible(false);
                new main_Class(pin);
                
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new deposit("");
    }
}

    
    

