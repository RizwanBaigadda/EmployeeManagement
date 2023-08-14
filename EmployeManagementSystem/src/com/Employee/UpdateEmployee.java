package com.Employee;
import javax.swing.*;


import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.*;

public class UpdateEmployee extends JFrame  implements ActionListener{
	
	JButton update, back;
	JLabel labelempid;
	JTextField Fnametext,  salarytext, adresstext, phonetext, emailtext, edutext, designationtext;
	String empid;
	
	UpdateEmployee(	String id){
		
		this.empid=id;
		
		getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
		
		JLabel text = new JLabel("Update Employee Details  ");
		text.setBounds(350, 50, 400, 40);
		text.setFont(new Font("Raleway", Font.BOLD, 20));
		add(text);
		
		

		JLabel name = new JLabel(" Name ");
		name.setBounds(50, 150, 150, 30);
		name.setFont(new Font("Raleway", Font.BOLD, 20));
		add(name);
		
		
		 JLabel nametext = new JLabel();
		nametext.setFont(new Font("Serif", Font.BOLD, 20));
		nametext.setBounds(220,150,150,30);
		add(nametext);
		

		JLabel Fname = new JLabel(" Father's Name ");
		Fname.setBounds(390, 150, 150, 30);
		Fname.setFont(new Font("Raleway", Font.BOLD, 20));
		add(Fname);
		

		 Fnametext = new JTextField();
		Fnametext.setFont(new Font("Raleway", Font.BOLD, 20));
		Fnametext.setBounds(570,150,150,30);
		add(Fnametext);
		

		JLabel dob = new JLabel(" Date of Birth  ");
		dob.setBounds(50, 200, 150, 30);
		dob.setFont(new Font("Raleway", Font.BOLD, 20));
		add(dob);

	      JLabel  dobtext = new JLabel();
		dobtext.setBounds(220, 200, 150, 30);
		add(dobtext); 
		
		JLabel salary = new JLabel(" Salary  ");
		salary.setBounds(390, 200, 150, 30);
		salary.setFont(new Font("Raleway", Font.BOLD, 20));
		add(salary);
		

		 salarytext = new JTextField();
		salarytext.setFont(new Font("Raleway", Font.BOLD, 20));
		salarytext.setBounds(570,200,150,30);
		add(salarytext);
		
		JLabel adress = new JLabel(" Adress  ");
		adress.setBounds(50, 250, 150, 30);
		adress.setFont(new Font("Raleway", Font.BOLD, 20));
		add(adress);
		

		 adresstext = new JTextField();
		adresstext.setFont(new Font("Raleway", Font.BOLD, 20));
		adresstext.setBounds(220,250,150,30);
		add(adresstext);
		


		
		JLabel Phone  = new JLabel(" Phone ");
		Phone.setBounds(390, 250, 150, 30);
		Phone.setFont(new Font("Raleway", Font.BOLD, 20));
		add(Phone);
		

		 phonetext = new JTextField();
		phonetext.setFont(new Font("Raleway", Font.BOLD, 20));
		phonetext.setBounds(570,250,150,30);
		add(phonetext);
		
		
		JLabel email = new JLabel("Email");
		email.setBounds(55, 300, 150, 30);
		email.setFont(new Font("Raleway", Font.BOLD, 20));
		add(email);
		

		 emailtext = new JTextField();
		emailtext.setFont(new Font("Raleway", Font.BOLD, 20));
		emailtext.setBounds(225,300,150,30);
		add(emailtext);
		
		JLabel education = new JLabel("Highest Education ");
		education.setBounds(390, 300, 200, 30);
		education.setFont(new Font("Raleway", Font.BOLD, 20));
		add(education);
	
		
		 edutext = new JTextField();
		edutext.setFont(new Font("Raleway", Font.BOLD, 16));
		edutext.setBounds(570,300,150,30);
		edutext.setBackground(Color.WHITE);
		add(edutext);
	
		
		JLabel designation = new JLabel(" Designation ");
		designation.setBounds(50, 350, 150, 30);
		designation.setFont(new Font("Raleway", Font.BOLD, 20));
		add(designation);
		

		 designationtext = new JTextField();
		designationtext.setFont(new Font("Raleway", Font.BOLD, 20));
		designationtext.setBounds(225,350,150,30);
		add(designationtext); 
		
		
		JLabel aadhar = new JLabel("Aadhar Number");
		aadhar.setBounds(390, 350, 150, 30);
		aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
		add(aadhar);
		

		 JLabel aadhartext = new JLabel();
		aadhartext.setFont(new Font("Raleway", Font.BOLD, 20));
		aadhartext.setBounds(570,350,150,30);
		add(aadhartext);   
		
		 labelempid = new JLabel(" Employee Id : ");
		 labelempid.setBounds(50, 400, 150, 30);
		 labelempid.setFont(new Font("Raleway", Font.BOLD, 20));
		add(labelempid);
		

		JLabel num = new JLabel();
		num.setBounds(250, 400, 150, 30);
		num.setFont(new Font("Raleway", Font.BOLD, 20));
		add(num);

		
		try {
			conn c5 = new conn();
			String query4 = "select * from employee where id = '"+empid+"'";
			ResultSet rs = c5.s.executeQuery(query4) ;
			while(rs.next()) {
				nametext.setText(rs.getString("name"));
				Fnametext.setText(rs.getString("fname"));
				dobtext.setText(rs.getString("dob"));
				salarytext.setText(rs.getString("salary"));
				adresstext.setText(rs.getString("address"));
				phonetext.setText(rs.getString("phone"));
				emailtext.setText(rs.getString("email"));
				edutext.setText(rs.getString("education"));
				designationtext.setText(rs.getString("designation"));
				aadhartext.setText(rs.getString("aadhar"));
				labelempid.setText(rs.getString("id"));
			}
			
		}catch(Exception e6) {
			System.out.println(e6);
		}
		
		 update = new JButton ("Update");
		 update.setBackground(Color.BLACK);
		 update.setForeground(Color.WHITE);
		update.addActionListener(this);
		update.setBounds(190,500, 150, 30);
		add(update);
		

		 back = new JButton ("Back");
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setBounds(400,500, 150, 30);
		back.addActionListener(this);
		add(back);
		

        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
				
	}
	
	

	
	public void actionPerformed(ActionEvent ae) {
		
		
		if (ae.getSource()== back) {
			setVisible(false);
			new home();
		}else if(ae.getSource()==update ) {
			String Fname = Fnametext.getText();		  
			String salary = salarytext.getText();
			String adress= adresstext.getText();
			String phone = phonetext.getText();
			String email = emailtext.getText();
			String education = edutext.getText();
			String designation = designationtext.getText();
			
			
			try {
				
				conn c6 = new conn() ;
				String query6 = "update employee set fname = '"+Fname+"', salary = '"+salary+"', dob ='"+adress+"', phone = '"+phone+"', email = '"+email+"', education = '"+education+"', designation  ='"+designation+"' where id = '"+empid+"'";
				c6.s.executeUpdate(query6);
				JOptionPane.showMessageDialog(null, "Details added Sucessfully");
				setVisible(false);
				new home();
				
			}catch (Exception e1) {
				System.out.println(e1);
			}
		}
		
		
	}
	public static void main (String args[]) {
		new UpdateEmployee("");
	}




	
	

}
