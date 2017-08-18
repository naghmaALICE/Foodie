/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Naghma
 */
public class SignupClass {
     void setdata(String u,String a,String m,String p,String pm) throws ClassNotFoundException, SQLException
    {
        try
        {
            String myDriver="org.gjt.mm.mysql.Driver";
            String myUrl="jdbc:mysql://localhost/management";
            //String d="foodie";
            
            Class.forName(myDriver);
            Connection conn=DriverManager.getConnection(myUrl, "root", "root");
            
            Statement st=(Statement)conn.createStatement();
            st.executeUpdate("INSERT INTO signup(name,address,mobile,password,payment)"+"VALUES('"+u+"','"+a+"','"+m+"','"+p+"','"+pm+"')");
                          
            JOptionPane.showMessageDialog(null,"Inserted");
       
            conn.close();
            
    }
    
         catch(Exception e)
        {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    
    }
}
