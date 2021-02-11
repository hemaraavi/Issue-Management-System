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
public class teacherissuetable extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3;
    JTable t1;
    JButton b1,b2,b3,b4;
    static JTextField post,t2,t3;
    String x[] = {"ID","NAME","Branch","REGARDING"};
    String y[][] = new String[20][13];
    int i=0, j=0;

    public teacherissuetable()  {
        super("ISSUES");
        setSize(1260,650);
        setLocation(200,200);
        setLayout(null);
        
        l1 = new JLabel("Enter ID to delete REPORT : ");
        l1.setBounds(50,360,400,30);
        l1.setFont(new Font("serif",Font.BOLD,20));
        add(l1);
        
        post =new JTextField();
        post.setBounds(400,480,200,30);
        add(post);
        
        t2 = new JTextField();
        t2.setBounds(400,360,200,30);
        add(t2);
        b4 = new JButton("AUTHORITY");
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(620,480, 100 ,30);
        add(b4);
         b2 = new JButton("back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(900,450, 100 ,30);
        add(b2);
        
        
        b1 = new JButton("Delete");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(620, 360, 100 ,30);
        add(b1);
          b3 = new JButton("show issue");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(820, 360, 100 ,30);
        add(b3);
        
        t3= new JTextField();
        t3.setBounds(900,360,200,30);
        add(t3);
            
      
        
        b1.addActionListener(this);
       b4.addActionListener(this);
       b2.addActionListener(this);
          b3.addActionListener(this);
        
        
       
        getContentPane().setBackground(Color.WHITE);
        
     
    }
    public void actionPerformed(ActionEvent ae){
        
        Connect c1 = new Connect();
    
        if(ae.getSource() == b1){
            try{
                String a = t2.getText();
                String q = "delete from teacheri where id = '"+a+"'";
                c1.s.executeUpdate(q);
                
            }catch(Exception e){}
    
        }else if(ae.getSource() == b2){
            new home().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource() == b4){
            String p=(String)post.getText();
            try{
            Connect c2  = new Connect();
            String s1 = "select * from teacheri where post='"+p+"'";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("studentid");
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
        
           
    }
      else if(ae.getSource() == b3){
          this.setVisible(false);
          String a=(String)t3.getText();
          showissue s=new showissue(a);
      }
      
        
    
}
    
    public static void main(String[] args){
        new teacherissuetable().setVisible(true);}
}
