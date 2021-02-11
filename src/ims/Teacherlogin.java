/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author student
 */
public class Teacherlogin implements ActionListener{
    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2,b3;

    public Teacherlogin() {
          f=new JFrame("Login");

        f.setBackground(Color.white);
        f.setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(40,20,100,30);
        f.add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(40,70,100,30);
        f.add(l2);
 
        t1=new JTextField();
        t1.setBounds(150,20,150,30);
        f.add(t1);

        t2=new JPasswordField();
        t2.setBounds(150,70,150,30);
        f.add(t2);
        
        ImageIcon i1 = new ImageIcon(("/home/student/Desktop/TEACHERLOGIN.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,20,150,150);
        f.add(l3);


        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        f.add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        f.add(b2);

        b2.addActionListener(this);
        
        b3=new JButton("singup");
        b3.setBounds(80,200,120,30);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.setBackground(Color.MAGENTA);
        b3.setForeground(Color.WHITE);
        f.add(b3);
        b3.addActionListener(this);

        
        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(600,300);
        f.setLocation(400,300);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            try{Connect c=new Connect();
                String a=t1.getText();
                String b=t2.getText();
                String q="select * from employee where name='"+a+"' and  post= '"+b+"'";
                  ResultSet rs = c.s.executeQuery(q);
                if(rs.next()){
                    f.setVisible(false);
                 new teacher_home().setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
            }
            catch(Exception ae){ae.printStackTrace();}
        }
        
        else if(e.getSource()==b3){
               new teacher_details();
        }
    }
    public static void main(String[] arg){
        Teacherlogin lO=new  Teacherlogin();
    }

}