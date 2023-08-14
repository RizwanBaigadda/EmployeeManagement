package com.Employee;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;
import java.sql.*;

import net.proteanit.sql.DbUtils;
public class viewdetails extends JFrame implements ActionListener {
	
	JTable tabel;
	Choice chooseid;
	JButton search1, update, print, back;
	viewdetails(){
		
      getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		setSize(900,700);
		setVisible(true);
		setLocation(250,20);
		
		tabel = new JTable();

		JLabel search = new JLabel("Search By Employee Id ");
		search.setFont(new Font("Ralewway", Font.PLAIN, 14));
		search.setBounds(40,20,150,30);
		add(search);
		
		    chooseid = new Choice();
			chooseid.setBounds(200,15,150,30);
		    add(chooseid);
		
			
			try {
				conn c3 = new conn();
				ResultSet rs = c3.s.executeQuery("select * from employee ");
	             
	             while(rs.next()) {
			       chooseid.add(rs.getString("id"));
	             }
	             
			}catch(Exception e ) {
	           System.out.println(e);
			}
			

		try {
			conn c2 = new conn();
			ResultSet rs = c2.s.executeQuery("select * from employee ");		
			tabel.setModel(DbUtils.resultSetToTableModel(rs));
			
		}catch(Exception e ) {
           System.out.println(e);
		}
		
		JScrollPane jsp = new JScrollPane(tabel);
		jsp.setBounds(0,100,900,600);
		add(jsp);
		
		
			search1 = new JButton("Search");
			search1.setBounds(40,70,80,20);
			search1.addActionListener(this);
			add(search1);
			

			update = new JButton("Update");
			update.setBounds(130,70,80,20);
			update.addActionListener(this);
			add(update);

			print = new JButton("Print");
			print.setBounds(220,70,80,20);
			print.addActionListener(this);
			add(print);

			back = new JButton("Back");
			back.setBounds(310,70,80,20);
			back.addActionListener(this);
			add(back);
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== search1) {
			
			try {
				
				conn c4 = new conn();
				String query4 = "select * from employee where id = '"+chooseid.getSelectedItem()+"'";
				ResultSet rs = c4.s.executeQuery(query4);
				tabel.setModel(DbUtils.resultSetToTableModel(rs));
			}catch(Exception e3) {
				System.out.println(e3);
			}
			
		}else if (e.getSource()== update) {
			setVisible(false);
			new UpdateEmployee(chooseid.getSelectedItem());
			
		}else if(e.getSource()==print) {
			try {
			tabel.print();
			}catch(Exception e5) {
				System.out.println(e5);
			}
			
		}else if(e.getSource()== back) {
			setVisible(false);
			new home();
		}
		
	}
	
	
	
	
	
	
	
	public static void main(String args[]) {
		new viewdetails();
	}


	

}
