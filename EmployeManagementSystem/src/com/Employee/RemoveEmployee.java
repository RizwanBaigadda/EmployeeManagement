package com.Employee;


import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;

public class RemoveEmployee extends JFrame implements ActionListener {
	Choice edrop;
	JButton delete , back;

	RemoveEmployee(){
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		setSize(1000,400);
		setLocation(200,120);
		setVisible(true);
		
		
		
		JLabel employeeid = new JLabel("Employee Id ");
		employeeid.setBounds(60,60,150,30);
		add(employeeid);
		
		
		edrop = new Choice();
		edrop.setBounds(210,60,150,30);
		add(edrop);
		
		
		try {
			conn c6 = new conn();
			ResultSet rs = c6.s.executeQuery("select * from employee");
			while(rs.next()) {
				edrop.add(rs.getString("id"));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		

		JLabel name = new JLabel(" Name ");
		name.setBounds(60,110,150,30);
		add(name);
		

		JLabel nameset = new JLabel();
		nameset.setBounds(210,110,150,30);
		add(nameset);
		

		JLabel phone = new JLabel(" Phone ");
		phone.setBounds(60,160,150,30);
		add(phone);

		JLabel phoneset = new JLabel();
		phoneset.setBounds(210,160,150,30);
		add(phoneset);
		

		JLabel email = new JLabel(" Email ");
		email.setBounds(60,200,150,30);
		add(email);

		JLabel emailset = new JLabel();
		emailset.setBounds(210,200,150,30);
		add(emailset);
		
		
		
		try {
			conn c7 = new conn();
			ResultSet rs = c7.s.executeQuery("select * from employee where id = '"+edrop.getSelectedItem()+"'");
			while(rs.next()) {
				nameset.setText(rs.getString("name"));
				phoneset.setText(rs.getString("phone"));
				emailset.setText(rs.getString("email"));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}	
		
	        edrop.addItemListener(new ItemListener(){
	        	public void itemStateChanged(ItemEvent ie) {
	

	        		try {
	        			conn c7 = new conn();
	        			ResultSet rs = c7.s.executeQuery("select * from employee where id = '"+edrop.getSelectedItem()+"'");
	        			while(rs.next()) {
	        				nameset.setText(rs.getString("name"));
	        				phoneset.setText(rs.getString("phone"));
	        				emailset.setText(rs.getString("email"));
	        			}
	   
	        	}catch(Exception e) {
	    			System.out.println(e);
	    		}	
	    		
	        	} 
	        });
	        
	        
	        delete = new JButton("Delete");
	        delete.setBackground(Color.BLACK);
	        delete.setForeground(Color.WHITE);
	        delete.setBounds(90,270,90,30);
	        delete.addActionListener(this);
	        add(delete);
	        

	        back = new JButton("Back");
	        back.setBackground(Color.BLACK);
	        back.setForeground(Color.WHITE);
	        back.setBounds(240,270,90,30);
	        back.addActionListener(this);
	        add(back);
	        
	        
	        
			ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
			Image l2 = l1.getImage().getScaledInstance(500, 300,  Image.SCALE_DEFAULT);
			ImageIcon l3 = new ImageIcon(l2);
	
			JLabel image = new JLabel(l3);
			image.setBounds(350,0,600,400);
			add(image);
	        
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==delete) {
			
			
     		try {
    			conn c7 = new conn();
    			String query8 = "delete from employee where id = '"+edrop.getSelectedItem()+"' ";
    			c7.s.executeUpdate(query8);
    			JOptionPane.showMessageDialog(null,"Employee Has Been Deleted ");
    			setVisible(false);
    			new home();
    			
    	}catch(Exception e7) {
			System.out.println(e7);
		}
			
			
		}else if(e.getSource()==back) {
			setVisible(false);
			new home();
		}
		
	}
	
	
	
	
	public static void main(String args[]) {
		new RemoveEmployee();
		
		
		
		
	}





	
}
