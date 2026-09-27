package Bank.Management.System; 
import java.sql.Statement;


import java.sql.Connection;

public class connect {

    Connection c;
    Statement s;


public connect(){
    try{

     c = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","qwer1234#ttY");
     s = c.createStatement();


    }catch(Exception e){
        e.printStackTrace();
    }
}
}