package com.Employee;


import javax.swing.*;
import java.awt.event.*;


import java.awt.*;

public class home extends  JFrame implements ActionListener {
	JButton add, view,  update, remove;
	
	home(){

		setLayout(null);
		setSize(1120,630);
		setVisible(true);
		setLocation(140,100);
		

		ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
		Image l2 = l1.getImage().getScaledInstance(1120,630, Image.SCALE_DEFAULT);
		ImageIcon l3 = new ImageIcon(l2);
		
		

		JLabel image = new JLabel(l3);
		image.setBounds(0,0,1120,630);
		add(image);
		
		JLabel text1 = new JLabel("EMPLOYEE MANAGEMNET SYSTEM ");
		text1.setFont(new Font("Serif", Font.BOLD, 25));
		text1.setBounds(600,60,600,30);
		text1.setForeground(Color.BLACK);
		image.add(text1);

		
		
		
		 add = new JButton("Add Employee");
		 add.setBounds(600,120, 150, 40);
		 add.addActionListener(this);
		 add.addActionListener(this);
		image.add(add);
		
		
		
		 view = new JButton("View Employees");
		view.setBounds(800,120, 150, 40);
		view.addActionListener(this);
		add.addActionListener(this);
		image.add(view);
		
		 update = new JButton("Update Employee");
		update.setBounds(600,180, 150, 40);
		update.addActionListener(this);
		update.addActionListener(this);
		image.add(update);
		
		 remove = new JButton("Remove Employee ");
		remove.setBounds(800 ,180, 150, 40);
		remove.addActionListener(this);
		remove.addActionListener(this);
		image.add(remove);
		
		

	
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==add) {
			setVisible(false);
			new addemployee();
		}else if (ae.getSource()==view)	{
			setVisible(false);
			new viewdetails();

		}else if(ae.getSource()== update) {
			setVisible(false);
			new viewdetails();
			
		}else if (ae.getSource()==remove) {
			setVisible(false);
			new RemoveEmployee();
			
		}
	}
	
	
	public static void main(String args[]) {

		new home();
		
	}


	
}
