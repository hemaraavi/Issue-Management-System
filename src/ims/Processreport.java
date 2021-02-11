/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author student
 */
public class Processreport extends JFrame implements ActionListener{
 


    private JPanel contentPane;
    
    private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
    private JButton b1,b2,b3,b4,b5;

    public static void main(String[] args) {
	new Processreport().setVisible(true);
			
    }

    public Processreport(){
        setBounds(300, 200, 900, 500);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.BLACK);
	contentPane.setLayout(null);

	JLabel l1 = new JLabel("Studentid");
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setForeground(Color.WHITE);
	l1.setBounds(47, 63, 100, 23);
	contentPane.add(l1);

	JLabel l2 = new JLabel("Name");
	l2.setForeground(Color.WHITE);
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(47, 97, 100, 23);
	contentPane.add(l2);

	JLabel l3 = new JLabel("BRANCH");
	l3.setForeground(Color.WHITE);
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(47, 131, 100, 23);
	contentPane.add(l3);

	JLabel l4 = new JLabel("REGARD");
	l4.setForeground(Color.WHITE);
	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	l4.setBounds(47, 165, 100, 23);
	contentPane.add(l4);

	

	
	t1 = new JTextField();
	t1.setForeground(new Color(47, 79, 79));
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t1.setBounds(126, 66, 86, 20);
	contentPane.add(t1);
	
	b1 = new JButton("Search");
	b1.addActionListener(this);
	b1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b1.setBackground(Color.RED);
        b1.setForeground(Color.WHITE);
	b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b1.setBounds(234, 59, 100, 30);
        
	contentPane.add(b1);

	t2 = new JTextField();
	t2.setEditable(false);
	t2.setForeground(new Color(47, 79, 79));
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setBounds(126, 100, 208, 20);
	contentPane.add(t2);
	t2.setColumns(10);

	t3 = new JTextField();
	t3.setEditable(false);
	t3.setForeground(new Color(47, 79, 79));
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t3.setColumns(10);
	t3.setBounds(126, 131, 208, 20);
	contentPane.add(t3);

	t4 = new JTextField();
	t4.setEditable(false);
	t4.setForeground(new Color(47, 79, 79));
	t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t4.setColumns(10);
	t4.setBounds(126, 168, 208, 20);
	contentPane.add(t4);

	JLabel l8 = new JLabel("AUTHORITY");
	l8.setForeground(Color.WHITE);
	l8.setFont(new Font("Tahoma", Font.BOLD, 14));
	l8.setBounds(384, 63, 100, 23);
	contentPane.add(l8);

	JLabel l9 = new JLabel("Name");
	l9.setForeground(new Color(47, 79, 79));
	l9.setFont(new Font("Tahoma", Font.BOLD, 14));
	l9.setBounds(384, 103, 100, 23);
	contentPane.add(l9);

	JLabel l10 = new JLabel("EMAIL");
	l10.setForeground(Color.WHITE);
	l10.setFont(new Font("Tahoma", Font.BOLD, 14));
	l10.setBounds(384, 147, 100, 23);
	contentPane.add(l10);

	JLabel l11 = new JLabel("DEPARTMENT");
	l11.setForeground(Color.WHITE);
	l11.setFont(new Font("Tahoma", Font.BOLD, 14));
	l11.setBounds(384, 187, 100, 23);
	contentPane.add(l11);

	
	t8 = new JTextField();
	t8.setForeground(new Color(47, 79, 79));
	t8.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t8.setColumns(10);
	t8.setBounds(508, 66, 86, 20);
	contentPane.add(t8);

	b2 = new JButton("Search");
	b2.addActionListener(this);
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b2.setBounds(604, 59, 100, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	contentPane.add(b2);

	t9 = new JTextField();
	t9.setForeground(new Color(47, 79, 79));
	t9.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t9.setEditable(false);
	t9.setColumns(10);
	t9.setBounds(508, 106, 208, 20);
	contentPane.add(t9);

	t10 = new JTextField();
	t10.setForeground(new Color(47, 79, 79));
	t10.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t10.setEditable(false);
	t10.setColumns(10);
	t10.setBounds(508, 150, 208, 20);
	contentPane.add(t10);

	t11 = new JTextField();
	t11.setForeground(new Color(47, 79, 79));
	t11.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t11.setEditable(false);
	t11.setColumns(10);
	t11.setBounds(508, 190, 208, 20);
	contentPane.add(t11);

	
	
       

	b4 = new JButton("Back");
	b4.addActionListener(this);
	b4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b4.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b4.setBounds(199, 377, 100, 33);
	b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        contentPane.add(b4);
        
        b5=new JButton ("send");
        b5.addActionListener(this);
        b5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b5.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b5.setBounds(450, 377, 100, 33);
	b5.setBackground(Color.WHITE);
        b5.setForeground(Color.GRAY);
        contentPane.add(b5);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            Connect con = new Connect();
            if(ae.getSource() == b1){
                String sql = "select * from report where id = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("branch"));
                    t4.setText(rs.getString("regard"));
                    
		}
		st.close();
		rs.close();
		
            }
            if(ae.getSource() == b2){
                String sql = "select * from employee where post = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t8.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    t9.setText(rs.getString("name"));
                    t10.setText(rs.getString("email"));
                    t11.setText(rs.getString("education"));
                  
		}
		st.close();
		rs.close();
		
            }
           if(ae.getSource()==b5){
                                                          String aa = t1.getText();
                                                           String bb = t2.getText();
                                                          String c = t3.getText();
                                                           String d = t4.getText();
                                                           String e=t8.getText();
                                                    String q="insert into teacheri values('" + aa+ "','" + bb + "','" + c + "','" + d + "','" + e + "')";
                con.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Details Successfully Inserted"); }
                   
                                
            } catch (SQLException ex) {
         Logger.getLogger(Processreport.class.getName()).log(Level.SEVERE, null, ex);
     }
            if(ae.getSource() == b4){
                this.setVisible(false);
		new home().setVisible(true);
			
            }
            
          
        }
            
        
    }


   

