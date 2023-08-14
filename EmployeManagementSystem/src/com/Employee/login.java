package com.Employee;
 
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener{
	
	JTextField usertext, passtext;
login(){

	getContentPane().setBackground(Color.WHITE);
	setSize(500,300);
	setLocation(450,200);
	setLayout(null);
	setVisible(true);
	
	
	JLabel user = new JLabel("UserName");
	user.setBounds(20, 40, 100,30);
	user.setFont(new Font("Raleway", Font.BOLD, 16));
	add(user);
	
	
    usertext = new JTextField();
	usertext.setBounds(130, 40, 120,30);
	add(usertext);
	
	
	JLabel pass = new JLabel("Password");
	pass.setBounds(20, 80, 100,30);
	pass.setFont(new Font("Raleway", Font.BOLD, 16));
	add(pass);
	
	
	 passtext = new JTextField();
	passtext.setBounds(130, 80, 120,30);
	add(passtext);
	
	
	JButton login = new JButton("Login");
	login.setBounds(130,140, 100, 30);
	login.addActionListener(this);
	add(login);
	
	
	ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
	Image l2 = l1.getImage().getScaledInstance(150,150, Image.SCALE_DEFAULT);
	ImageIcon l3 = new ImageIcon(l2);
	JLabel image = new JLabel(l3);
     image.setBounds(300,40, 100, 100);
	add(image);
	
}
	

@Override
public void actionPerformed(ActionEvent e) {

	
	try {
	String user = usertext.getText();
	String pass = passtext.getText();
	conn c1 = new conn();
	String query1 = "select * from login where username = '"+user+"' and password = '"+pass+"'";
	ResultSet rs = c1.s.executeQuery(query1);
	if (rs.next()) {
		setVisible(false);
		
	}else {
		JOptionPane.showMessageDialog(null, "Invalid Username or Password ");
	}
	
	}catch(Exception e1 ) {
		System.out.println(e1);
	}
	
}

	
	public static void main (String args[]) {
		new login();
	}


	
}
