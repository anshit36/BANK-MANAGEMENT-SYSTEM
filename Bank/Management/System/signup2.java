package Bank.Management.System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class signup2 extends JFrame implements ActionListener{

    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13;
    JComboBox<String> combo1,combo2,combo3,combo4,combo5;

    JTextField text1,text2;
    JRadioButton r1,r2,r3,r4;
    JButton button;

    String formno; 
    signup2(String formno)
    {
        super("Signup Page");




        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        setLayout(null);
        
        JLabel image = new JLabel(i3);
        image.setBounds(40,10,100,100);
        add(image);

         this.formno = formno;

         label1 = new JLabel("Application Form No. " + formno);
        label1.setFont(new Font("Raleway",Font.BOLD,38));       
        label1.setBounds(190,20,600,40);
        add(label1);

        label2 = new JLabel("Page 2: Additional Details");
        label2.setFont(new Font("Raleway",Font.BOLD,20));       
        label2.setBounds(290,70,400,30);
        add(label2);

        label3 = new JLabel("Religion:");
        label3.setFont(new Font("Raleway",Font.BOLD,20));   
        label3.setBounds(100,140,100,30);
        add(label3);

        String Religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        combo1 = new JComboBox<String>(Religion);
        combo1.setFont(new Font("Raleway",Font.BOLD,14));
        combo1.setBackground(new Color(245, 245, 220));
        combo1.setBounds(280,140,400,30);
        add(combo1);

        

        label4 = new JLabel("Category:");
        label4.setFont(new Font("Raleway",Font.BOLD,20));   
        label4.setBounds(100,190,200,30);
        add(label4);

        String Category[] = {"General","OBC","SC","ST","Other"};
        combo2 = new JComboBox<String>(Category);
        combo2.setFont(new Font("Raleway",Font.BOLD,14));
        combo2.setBackground(new Color(245, 245, 220));
        combo2.setBounds(280,190,400,30);
        add(combo2);

        label5 = new JLabel("Income:");
        label5.setFont(new Font("Raleway",Font.BOLD,20));
        label5.setBounds(100,240,200,30);
        add(label5);

        String Income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
        combo3 = new JComboBox<String>(Income);
        combo3.setFont(new Font("Raleway",Font.BOLD,14));

        combo3.setBackground(new Color(245, 245, 220));
        combo3.setBounds(280,240,400,30);
        add(combo3);

        label6 = new JLabel("Educational:");
        label6.setFont(new Font("Raleway",Font.BOLD,20));
        label6.setBounds(100,290,200,30);
        add(label6);

        String Education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        combo4 = new JComboBox<String>(Education);
        combo4.setFont(new Font("Raleway",Font.BOLD,14));
        combo4.setBackground(new Color(245, 245, 220));
        combo4.setBounds(280,290,400,30);
        add(combo4);

        label7 = new JLabel("Occupation:");
        label7.setFont(new Font("Raleway",Font.BOLD,20));
        label7.setBounds(100,340,200,30);
        add(label7);

        String Occupation[] = {"Salaried","Self-Employed","Business","Student","Retired","Other"};
        combo5 = new JComboBox<String>(Occupation);
        combo5.setFont(new Font("Raleway",Font.BOLD,14));
        combo5.setBackground(new Color(245, 245, 220));
        combo5.setBounds(280,340,400,30);
        add(combo5);

        label8 = new JLabel("PAN Number:");
        label8.setFont(new Font("Raleway",Font.BOLD,20));   
        label8.setBounds(100,390,200,30);
        add(label8);

        text1 = new JTextField();
        text1.setFont(new Font("Raleway",Font.BOLD,14));
        text1.setBounds(280,390,400,30);
        add(text1);

        label9 = new JLabel("Aadhar Number:");
        label9.setFont(new Font("Raleway",Font.BOLD,20));
        label9.setBounds(100,440,200,30);
        add(label9);

        text2 = new JTextField();
        text2.setFont(new Font("Raleway",Font.BOLD,14));
        text2.setBounds(280,440,400,30);
        add(text2);

        label10=new JLabel("Senior Citizen:");
        label10.setFont(new Font("Raleway",Font.BOLD,20));
        label10.setBounds(100,490,200,30);
        add(label10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(245, 245, 220));
        r1.setBounds(280,490,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(245, 245, 220));
        r2.setBounds(400,490,100,30);
        add(r2);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        label11 = new JLabel("Existing Account:");
        label11.setFont(new Font("Raleway",Font.BOLD,20));
        label11.setBounds(100,540,200,30);
        add(label11);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(245, 245, 220));
        r3.setBounds(280,540,100,30);
        add(r3);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(245, 245, 220));
        r4.setBounds(400,540,100,30);
        add(r4);

        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(r3);
        bg2.add(r4);

        label12 = new JLabel("Form No:");
        label12.setFont(new Font("Raleway",Font.BOLD,18));
        label12.setBounds( 700,10,100,30);
        add(label12);

        label13 = new JLabel(formno);
        label13.setFont(new Font("Raleway",Font.BOLD,14));
        label13.setBounds(790,10,100,30);
        add(label13);

            button = new JButton("Next");
        button.setFont(new Font("Raleway",Font.BOLD,14));
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setBounds(620,590,80,30);
        button.addActionListener(this);
        add(button);








        setSize(850,800);
        getContentPane().setBackground(new Color(245, 245, 220));
        setLocation(350,10);
        setVisible(true);
    }


        
        @Override
        public void actionPerformed(ActionEvent ae)
        {

            
    String rel =  (String) combo1.getSelectedItem();
    String cat =  (String) combo2.getSelectedItem();
    String edu =  (String) combo3.getSelectedItem();
    String inc =  (String) combo4.getSelectedItem();
    String occu =  (String) combo5.getSelectedItem();
    String Pan = text1.getText();
    String addhar = text2.getText();

     String senior_citizen = null;
    if (r1.isSelected()) {
        senior_citizen = "yes";        
    } else if (r2.isSelected()) {
        senior_citizen = "no";
    }

      String Existing_acc= null;
    if (r3.isSelected()) {
        Existing_acc = "yes";        
    } else if (r4.isSelected()) {
        Existing_acc = "no";
    }

       try {

        if(text1.getText().equals("")|| text2.getText().equals("") ){ 
            JOptionPane.showMessageDialog(
                null, 
                "Fill all feilds.");
            return;
            
        
        }
        else{
        connect c = new connect();
       String query = "INSERT INTO signup2 VALUES('" + formno + "','" + rel + "','" + cat + "','" + edu + "','" + inc + "','" + occu + "','" + Pan + "','" + addhar + "','" + senior_citizen + "','" + Existing_acc + "')";
        c.s.executeUpdate(query);
        new signup3(formno);
        setVisible(false);
         
        }

       
        
    } catch (Exception E) {
        E.printStackTrace();
        
    }







    

           
           

}
public static void main(String[] args) {
    new signup2( "" );  

}}
