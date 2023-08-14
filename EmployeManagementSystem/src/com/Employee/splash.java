package com.Employee;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class splash  extends JFrame implements ActionListener{
	
	
	
	splash(){
		
		getContentPane().setBackground(Color.WHITE);
		setSize(1170,650);
		setLocation(120,50);
		setLayout(null);
		setVisible(true);
		
		
		JLabel text = new JLabel("EMPLOYEE MANAGEMNET SYSTEM ");
		text.setFont(new Font("Serif", Font.PLAIN, 50));
		text.setBounds(105,30,1200,65);
		text.setForeground(Color.RED);
		add(text);


		ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
		Image l2 = l1.getImage().getScaledInstance(1100,700, Image.SCALE_DEFAULT);
		ImageIcon l3 = new ImageIcon(l2);
		
		JLabel image = new JLabel(l3);
		image.setBounds(50,100,1050,500);
		add(image);
		
		JButton clickhere = new JButton("Click Here To Continue");
		clickhere.setBounds(400,400,300,70);
		clickhere.setBackground(Color.BLACK);
		clickhere.setForeground(Color.WHITE);
		clickhere.addActionListener(this);
		image.add(clickhere);
		
		
		while(true) {
			text.setVisible(false);
			try {
	       		Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
				
			}
			text.setVisible(true);
			
			try {
	       		Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
				
			}

		}

		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
		new login();
		
	}
	
	

	public static void main(String args[]) {
		 
	new splash();	 
		 
	 }

}
