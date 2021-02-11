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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Desktop;
import java.net.URI;

/**
 *
 * @author student
 */
 

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

class Studenthome implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4;

   Studenthome(){
        f=new JFrame("Student home");
        f.setBackground(Color.white);
        f.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0,0,700,500);
        l1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ims/icons/index.jpeg"));
        l1.setIcon(i1);
        f.add(l1);

        l2 = new JLabel("STUDENT HOME");
        l2.setBounds(200,20,200,40);
        l2.setFont(new Font("serif",Font.BOLD,20));
        l2.setForeground(Color.MAGENTA);
        l1.add(l2);

        b1=new JButton("Issue submission");
        b1.setBounds(250,100,150,80);
        b1.setFont(new Font("serif",Font.BOLD,16));
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        l1.add(b1);


        b2=new JButton("View report");
        b2.setBounds(500,100,150,80);
        b2.setFont(new Font("serif",Font.BOLD,15));
        
         b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        l1.add(b2);

        b3=new JButton("faculty details");
        b3.setBounds(250,300,150,80);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        l1.add(b3);

        b4=new JButton("rgukt");
        b4.setBounds(500,300,150,80);
        b4.setFont(new Font("serif",Font.BOLD,15));
          b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        b4.addActionListener(this);
        l1.add(b4);

        f.setVisible(true);
        f.setSize(700,500);
        f.setLocation(450,200);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            f.setVisible(false);
            new issuetext().setVisible(true);
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new reply().setVisible(true);
        }
        if(ae.getSource()==b3){
            f.setVisible(false);
            new home();
        }
        if(ae.getSource()==b4){
           
            Desktop d=Desktop.getDesktop();
            try {
                d.browse(new URI("https://www.rguktrkv.ac.in/"));
            } catch (URISyntaxException ex) {
                Logger.getLogger(Studenthome.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Studenthome.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[ ] arg){
       Studenthome d = new Studenthome();
    }
}


