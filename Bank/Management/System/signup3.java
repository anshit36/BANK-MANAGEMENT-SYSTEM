package Bank.Management.System;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.*;
public class signup3 extends JFrame implements ActionListener {

    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13;
    JComboBox<String> combo1,combo2;
    JCheckBox c1,cc1,cc2,cc3,cc4,cc5;
    JButton next,cancle;

    String formno;
    
    signup3( String formno){

       
      this.formno = formno;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        setLayout(null);
        
        JLabel image = new JLabel(i3);
        image.setBounds(40,10,100,100);
        add(image);

        



        label1 = new JLabel("Application Form No. " + formno); 
        label1.setFont(new Font("Raleway",Font.BOLD,38));       
        label1.setBounds(190,20,600,40);
        add(label1);

        label2 = new JLabel("Page 3: Account Details");
        label2.setFont(new Font("Raleway",Font.BOLD,20));       
        label2.setBounds(290,70,400,30);
        add(label2);

        label3 = new JLabel("Account type:");
        label3.setFont(new Font("Raleway",Font.BOLD,20));   
        label3.setBounds(100,140,200,30);
        add(label3);

        String Type[] = {"Savings","Current","Fixed Deposit","Recurring"};
        combo1 = new JComboBox<String>(Type);
        combo1.setFont(new Font("Raleway",Font.BOLD,14));
        combo1.setBackground(new Color(245, 245, 220));
        combo1.setBounds(280,140,400,30);
        add(combo1);

        
        label4 = new JLabel("Card number:");
        label4.setFont(new Font("Raleway",Font.BOLD,20));   
        label4.setBounds(100,190,200,30);
        add(label4);

        label5 = new JLabel("(Your 16-digit card number)");
        label5.setFont(new Font("Raleway",Font.BOLD,12));   
        label5.setBounds(100,220,200,30);
        add(label5);

        label6 = new JLabel("XXXX-XXXX-XXXX-6969");
        label6.setFont(new Font("Raleway",Font.BOLD,20));   
        label6.setBounds(280,190,300,30);
        add(label6);

        label7 = new JLabel("(It would appear on ATM Card/Cheque Book and Statements)");
        label7.setFont(new Font("Raleway",Font.BOLD,12));   
        label7.setBounds(280,220,400,30);
        add(label7);

         label8 = new JLabel("PIN:");
        label8.setFont(new Font("Raleway",Font.BOLD,20));   
        label8.setBounds(100,270,200,30);
        add(label8);

        label9 = new JLabel("(Your 4-digit Password)");
        label9.setFont(new Font("Raleway",Font.BOLD,12));   
        label9.setBounds(100,300,400,30);
        add(label9);




        label10 = new JLabel("XXXX");
        label10.setFont(new Font("Raleway",Font.BOLD,20));   
        label10.setBounds(280,270,300,30);
        add(label10);

        label11 = new JLabel("Service Required:");
        label11.setFont(new Font("Raleway",Font.BOLD,20));   
        label11.setBounds(100,350,200,30);
        add(label11);

        cc1 = new JCheckBox("ATM Card");
        cc1.setFont(new Font("Raleway",Font.BOLD,15)); 
        cc1.setBackground(new Color(245, 245, 220));
        cc1.setBounds(100,390,200,30);
        add(cc1);


        cc2 = new JCheckBox("Internet-Banking");
        cc2.setFont(new Font("Raleway",Font.BOLD,15)); 
        cc2.setBackground(new Color(245, 245, 220)); 

        cc2.setBounds(400,390,200,30);
        add(cc2);

        
        cc3 = new JCheckBox("SMS Alerts");
        cc3.setFont(new Font("Raleway",Font.BOLD,15)); 
        cc3.setBackground(new Color(245, 245, 220)); 

        cc3.setBounds(400,430,200,30);
        add(cc3);


        
        cc4 = new JCheckBox("Cheque Book");
        cc4.setFont(new Font("Raleway",Font.BOLD,15)); 
        cc4.setBackground(new Color(245, 245, 220)); 

        cc4.setBounds(100,430,200,30);
        add(cc4);

        label12 = new JLabel("Form No:");
        label12.setFont(new Font("Raleway",Font.BOLD,18));
        label12.setBounds( 700,10,100,30);
        add(label12);

        label13 = new JLabel(formno);
        label13.setFont(new Font("Raleway",Font.BOLD,14));
        label13.setBounds(790,10,100,30);
        add(label13);



        c1 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.",true);
        c1.setBounds(100,640,600,30);   
        c1.setBackground(new Color(245, 245, 220));
        
        add(c1);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,690,80,30);
        next.addActionListener(this);
        add(next);

        cancle  = new JButton("Cancle");
        cancle.setBackground(Color.BLACK);
        cancle.setForeground(Color.WHITE);
        cancle.setFont(new Font("Raleway",Font.BOLD,14));
        cancle.setBounds(100,690,100,30);
        cancle.addActionListener(this);
        add(cancle);

       
        setSize(850,800);
        getContentPane().setBackground(new Color(245, 245, 220));
        setLocation(350,10);
        setVisible(true);

      
    }

     @Override
public void actionPerformed(ActionEvent e) {

  if (!c1.isSelected()) {

        JOptionPane.showMessageDialog(
                null,
                "Please accept the declaration to continue.");

        return;

        
    }

    String Acc_type =  (String) combo1.getSelectedItem();

    Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L)+ 1000L;
        String pin = "" + Math.abs(first3);

        String ser = "";
        if(cc1.isSelected()){
            ser = ser+"ATM CARD ";
        } else if (cc2.isSelected()) {
            ser = ser+"Internet Banking";
        } else if (cc3.isSelected()) {
            ser = ser+"Cheque book";
        } else if (cc4.isSelected()) {
            ser = ser+"sms Alerts";
        } 

        try {
            
             if (e.getSource()==next){
                if (Acc_type.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else {
                    connect c = new connect();
                    String q1 = "insert into signup3 values('"+formno+"', '"+Acc_type+"','"+cardno+"','"+pin+"','"+ ser +"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c.s.executeUpdate(q1);
                    c.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin );
                    new deposit(pin);
                   
                    setVisible(false);
                }
            } else if (e.getSource()==cancle) {
                System.exit(0);
            }

        
            
        } catch (Exception E){
        E.printStackTrace();
        
        
            
        }

       



}





    public static void main(String[] args) {
        new signup3("");
    }
}
