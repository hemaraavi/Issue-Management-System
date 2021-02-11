/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims;
import java.sql.*;

/**
 *
 * @author student
 */
public class Connect {
    Connection c;
    Statement s;
    public Connect(){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///ims","root","hema");
            s=c.createStatement();
            
        }catch(Exception e){System.out.println(e);}
    }
    
    }
    

            
    
    

