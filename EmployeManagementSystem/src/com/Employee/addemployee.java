package com.Employee;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import com.toedter.calendar.JDateChooser;

public class addemployee extends JFrame implements ActionListener {
	
	JButton details, back;
	JTextField nametext, Fnametext, salarytext, adresstext, phonetext, emailtext, designationtext, aadhartext;
	JComboBox edudrop;
	JDateChooser dobtext ;
	JLabel num;
	Random ran = new Random();
	int number = ran.nextInt(999999);
	
	addemployee(){
		 

		getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
		
		JLabel text = new JLabel("Add Employee Details  ");
		text.setBounds(350, 50, 400, 40);
		text.setFont(new Font("Raleway", Font.BOLD, 20));
		add(text);
		
		

		JLabel name = new JLabel(" Name ");
		name.setBounds(50, 150, 150, 30);
		name.setFont(new Font("Raleway", Font.BOLD, 20));
		add(name);
		
		
		 nametext = new JTextField();
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

	    dobtext = new JDateChooser();
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
		

		String valedu[] = {"B.sc" , "B.tech", "M.tech "};
		
		 edudrop = new JComboBox(valedu);
		edudrop.setFont(new Font("Raleway", Font.BOLD, 16));
		edudrop.setBounds(570,300,150,30);
		edudrop.setBackground(Color.WHITE);
		add(edudrop);
	
		
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
		

		 aadhartext = new JTextField();
		aadhartext.setFont(new Font("Raleway", Font.BOLD, 20));
		aadhartext.setBounds(570,350,150,30);
		add(aadhartext);   
		
		JLabel id = new JLabel(" Employee Id : ");
		id.setBounds(50, 400, 150, 30);
		id.setFont(new Font("Raleway", Font.BOLD, 20));
		add(id);
		

		 num = new JLabel(" " + number);
		num.setBounds(250, 400, 150, 30);
		num.setFont(new Font("Raleway", Font.BOLD, 20));
		add(num);

		
		 details = new JButton ("Add Details");
		details.setBackground(Color.BLACK);
		details.setForeground(Color.WHITE);
		details.addActionListener(this);
		details.setBounds(190,500, 150, 30);
		add(details);
		

		 back = new JButton ("Back");
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setBounds(400,500, 150, 30);
		back.addActionListener(this);
		add(back);
				
	}
	
	

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		
		if (ae.getSource()== back) {
			setVisible(false);
			new home();
		}else if(ae.getSource()==details ) {
		
			String name = nametext.getText();
			String fname = Fnametext.getText();
			String dob = ((JTextField ) dobtext.getDateEditor().getUiComponent()).getText();
			String salary = salarytext.getText();
			String adress= adresstext.getText();
			String phone = phonetext.getText();
			String email = emailtext.getText();
			String education = (String) edudrop.getSelectedItem();
			String designation = designationtext.getText();
			String aadhar = aadhartext.getText();
			String id = num.getText();
			
			try {
				
				conn c2 = new conn() ;
				String query2 = "insert into employee values('"+name+"', '"+fname+"', '"+dob+"','"+salary+"', '"+adress+"', '"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+aadhar+"', '"+id+"')";
				c2.s.executeUpdate(query2);
				JOptionPane.showMessageDialog(null, "Details added Sucessfully");
				setVisible(false);
				new home();
				
			}catch (Exception e1) {
				System.out.println(e1);
			}
		}
		
		
	}
	public static void main (String args[]) {
		new addemployee();
	}
	

}
