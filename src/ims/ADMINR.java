/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author student
 */
public class ADMINR extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3;
    JTable t1;
    JButton b1,b2,b3;
    JTextField t2;
    String x[] = {"ID","NAME","Branch","REGARDING"};
    String y[][] = new String[20][13];
    int i=0, j=0;
    ADMINR(){
      super("REPORTS");
        setSize(1260,650);
        setLocation(200,200);
        setLayout(null);
        
        l1 = new JLabel("Enter ID to delete REPORT : ");
        l1.setBounds(50,360,400,30);
        l1.setFont(new Font("serif",Font.BOLD,20));
        add(l1);
        
        t2 = new JTextField();
        t2.setBounds(400,360,200,30);
        add(t2);
        
        b1 = new JButton("Delete");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(620, 360, 100 ,30);
        add(b1);
            
      
        
        b1.addActionListener(this);
        
        b2 = new JButton("send");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(500, 500, 100 ,50);
        add(b2);
            
        
        b2.addActionListener(this);

   
        
        
        try{
            Connect c1  = new Connect();
            String s1 = "select * from report";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("id");
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("branch");
                y[i][j++]=rs.getString("regard");
               
                i++;
                j=0;
            }
            t1 = new JTable(y,x);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20,20,1200,330);
        add(sp);
        
        getContentPane().setBackground(Color.WHITE);
        
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        
        Connect c1 = new Connect();
    
        if(ae.getSource() == b1){
            try{
                String a = t2.getText();
                String q = "delete from report where id = '"+a+"'";
                c1.s.executeUpdate(q);
                
            }catch(Exception e){}
    
        }else if(ae.getSource() == b2){
            new Processreport().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource() == b3){
           
            this.setVisible(false);
        }
    }

    public static void main(String[] args){
        new ADMINR().setVisible(true);}
    
}

