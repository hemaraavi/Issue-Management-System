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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author student
 */
public class showissue implements ActionListener {
    JFrame f;
    JLabel id8,id0,aid,id1,aid1,id2,aid2,id3,aid3,id4,id5,id6,aid6,id7,aid7,id9,id10,id11,id12,id13,id14,id15,id16,id17,lab;
    JTextArea aid4,aid5;
    String student_id,name,branch,regard,issue,sid;
    JButton b1,b2;

     showissue(String id){
         this.sid=id;
        try{
            Connect con = new Connect();
            String str = "select * from report where id = '"+id+"'";
            ResultSet rs= con.s.executeQuery(str);

            while(rs.next()){

               
                name = rs.getString("name");
                branch = rs.getString("branch");
                regard = rs.getString("regard");
                issue = rs.getString("issue");
               
            }
        }catch(Exception e){
            e.printStackTrace();
        }
 
        f=new JFrame("SHOW ISSUE");
        f.setVisible(true);
        f.setSize(595,642);
        f.setLocation(450,200);
        f.setBackground(Color.white);
        f.setLayout(null);

   ; 
      
        id8 = new JLabel(" Details");
        id8.setBounds(50,10,250,30);
        f.add(id8);
        id8.setFont(new Font("serif",Font.BOLD,25));
        
        f.add(id8);

        id0 = new JLabel("Student Id:");
        id0.setBounds(50,70,120,30);
        id0.setFont(new Font("serif",Font.BOLD,20));
        f.add(id0);

        aid = new JLabel(id);
        aid.setBounds(200,70,200,30);
        aid.setFont(new Font("serif",Font.BOLD,20));
        f.add(aid);

        id1 = new JLabel("Name:");
        id1.setBounds(50,120,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        f.add(id1);

        aid1 = new JLabel(name);
        aid1.setBounds(200,120,300,30);
        aid1.setFont(new Font("serif",Font.BOLD,20));
        f.add(aid1);

  
        id2 = new JLabel("BRANCH"); 
        id2.setBounds(50,170,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        f.add(id2);
        aid2 = new JLabel(branch);
        aid2.setBounds(200,170,300,30);
        aid2.setFont(new Font("serif",Font.BOLD,20));
        f.add(aid2);

        id3= new JLabel("REGARDING");
        id3.setBounds(50,220,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        f.add(id3);

        aid3= new JLabel(regard);
        aid3.setBounds(200,220,300,30);
        aid3.setFont(new Font("serif",Font.BOLD,20));
        f.add(aid3);


        id4= new JLabel("issue");  
        id4.setBounds(50,270,100,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        f.add(id4);

        aid4= new JTextArea(issue);
        aid4.setBounds(200,270,300,30); 
        aid4.setFont(new Font("serif",Font.BOLD,20));
        f.add(aid4);

        
        id5= new JLabel("reply");
        id5.setBounds(50,320,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        f.add(id5);

        aid5= new JTextArea();
        aid5.setBounds(200,320,300,30);
        aid5.setFont(new Font("serif",Font.BOLD,20));
        f.add(aid5);

        
      

    
        
        b1=new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100,520,100,30);
        b1.addActionListener(this);
        f.add(b1);

        b2=new JButton("cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(250,520,100,30);
        b2.addActionListener(this);
        f.add(b2);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {try{ Connect c=new Connect();
        String r=(String) aid5.getText();
        String id=sid;
            String q = "insert into reply values('"+id+"','"+r+"')";
                c.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Teacher Details Inserted Successfully");
              
        
            
        }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
    public static void main(String[] args){
        new showissue("SHOW ISSUE");
    }

}
