/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginGUI;

/**
 *
 * @author PC
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginGUI {
    
    public static void main(String [] args){
    
    JFrame frame = new JFrame("Login Window");
    frame.setSize(500,400);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    
    JLabel l1 = new JLabel("Username");
    l1.setBounds(100,100,100,25);
    frame.add(l1);
    
    JTextField t1 = new JTextField(15);
    t1.setBounds(201,100,125,25);
    frame.add(t1);
    
    JLabel l2 = new JLabel("password");
    l2.setBounds(100,150,100,25);
    frame.add(l2);
    
    JPasswordField t2 = new JPasswordField(15);
    t2.setBounds(201,150,125,25);
    frame.add(t2);
    
    JButton btn = new JButton("Login");
    btn.setBounds(201,200,150,25);
    frame.add(btn);
    
   btn.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent ae){
           String username = t1.getText();
           String password = t2.getText();
           
           if(username.equals("admin")&& password.equals("abc123")){
           JOptionPane.showMessageDialog(frame, "Logged Succesfully","Login Message",JOptionPane.INFORMATION_MESSAGE);
                   }else{
           JOptionPane.showMessageDialog(frame, "Login Failed", "Login Message", JOptionPane.ERROR_MESSAGE);
           
           }
       }
   
   
   });
    
    }
    
            }
    
    
    
        
    

