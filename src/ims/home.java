/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims;
import java.awt.Font;
import java.lang.*;
import java.util.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 *
 * @author student
 */
public class home extends JFrame implements ActionListener {
    
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2,b3;

    home(){

       setTitle("ISSUE MANAGMENT SYSTEM");
         l2 = new JLabel();
        l2.setBounds(300,100,500,200);
     
        ImageIcon i1 = new ImageIcon(("/home/student/Desktop/home.jpeg"));
        l2.setIcon(i1);
        add(l2);
        
        l1 = new JLabel("WELCOME TO IMS");
        l1.setFont(new Font("Osward", Font.BOLD, 40));
        l1.setBackground(Color.MAGENTA);
        l1.setBounds(200,40,450,40);
        add(l1);
        
      
                   
        b1 = new JButton("STUDENT");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("TEACHER");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("ADMIN");
        b3.setBackground(Color.GRAY);
        b3.setForeground(Color.WHITE);
        
        setLayout(null);
        
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(200,300,180,30);
        add(b1);
        
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(430,300,180,30);
        add(b2);
        
        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setBounds(300,350,230,30);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
       
        setBackground(Color.WHITE) ;
        setSize(800,480);
        setLocation(550,200);
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
       try{        
            if(e.getSource()==b1){
                     setVisible(false);
                    new Studentlogin();
                
            }else if(e.getSource()==b2){
               setVisible(false);
                    new Teacherlogin();
            }else if(e.getSource()==b3){
                setVisible(false);
                new Adminlogin();
            }
        }catch(Exception ae){
            ae.printStackTrace();
        }//To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args){
        new home().setVisible(true);
    }
}

  