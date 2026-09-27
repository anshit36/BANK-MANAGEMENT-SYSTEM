package Bank.Management.System;
import javax.swing.*;



import java.awt.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class Login extends JFrame implements ActionListener{
    
    JButton B1,B2,B3;
    JLabel label1,label2,label3;

    JTextField text;
    JPasswordField p;
    String pin;
    Login(String pin){

    super("Bank Management System");


        this.pin=pin;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        setLayout(null);
        
        JLabel image = new JLabel(i3);
        image.setBounds(360,10,100,100);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3  = new ImageIcon(ii2);
        setLayout(null);
        
        JLabel image1 = new JLabel(ii3);
        image1.setBounds(690,340,100,100);
        add(image1);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Osward",Font.BOLD,38));
        label1.setBounds(250,125,450,40);
        add(label1);

        label2 = new JLabel("CARD NO:");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Ralway",Font.BOLD,20));
        label2.setBounds(150,200,150,30);
        add(label2);

        text = new JTextField();
        text.setFont(new Font("Ralway",Font.BOLD,14));
        text.setBounds(280,200,250,30);
        add(text);

        label3 = new JLabel("PIN:");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Arial",Font.BOLD,20));
        label3.setBounds(150,250,150,30);
        add(label3);

        p = new JPasswordField();
        p.setFont(new Font("Arial",Font.BOLD,14));
        p.setBounds(280,250,250,30);
        add(p);

        
        B1 = new JButton("SIGN IN");
        B1.setBackground(Color.BLACK);
        B1.setForeground(Color.WHITE);
        B1.setBounds(280,300,100,30);
        B1.addActionListener(this);
        add(B1); 
        
        B2 = new JButton("CLEAR");
        B2.setBackground(Color.BLACK);
        B2.setForeground(Color.WHITE);


        B2.setBounds(430,300,100,30); 
        B2.addActionListener(this);   

        add(B2);

        B3 = new JButton("SIGN UP");
        B3.setBackground(Color.BLACK);
        B3.setForeground(Color.WHITE);
        B3.setBounds(280,350,250,30);    
        B3.addActionListener(this);       
        add(B3);











        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbgg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3  = new ImageIcon(iii2);
        setLayout(null);
        
        JLabel image2 = new JLabel(iii3);
        image2.setBounds(0,0,850,480);
        add(image2);


        setLayout(null);
       setSize(850,480);
        setLocation(390,200);
        setVisible(true);
        


        





    }

    @Override
    public void actionPerformed(ActionEvent  e) {
        try {

            if(e.getSource() == B1){
                connect c = new connect();
                String card_no = text.getText();
                String pin = p.getText();
                String q = "select * from login where card_no = '"+card_no+"' and pin = '"+pin+"'";
                ResultSet resultset = c.s.executeQuery(q);
                if (resultset.next()){
                    setVisible(false);
                    new main_Class(pin);    

 
                }
                else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
                    }}   
                else if(e.getSource() == B2){
                    text.setText("");
                    p.setText("");
                  
                }
                else if(e.getSource() == B3){
                    new signup();
                    setVisible(false);
                    
                }
               }
        
        
        catch (Exception E) {
           
        }
        
    }

    public static void main(String[] args){
        new Login("");
    }

}
