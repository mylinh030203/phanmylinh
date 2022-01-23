package ck;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.ConnectIOException;
import java.sql.Connection;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ck.ConnectDBck;




public class SignUp extends JFrame {
	
	JFrame f= new JFrame("Sign Up");
	JLabel lbsignup = new JLabel("Sign Up");
	JLabel lb = new JLabel();
	JLabel lb1 = new JLabel();
	JLabel lbusername = new JLabel("Username");
	JTextField tfusername = new JTextField(15);
	JLabel lbpassword = new JLabel("Password");
	JTextField tfpassword = new JTextField(15);
	JButton btforget = new JButton("Forgotten Password");
	JButton btsignup = new JButton("Sign Up");
	
	//
	
	//
	PreparedStatement ps;
	Connection conn;
	ResultSet rs;
	public SignUp() {
		f.setLocation(200,300);
		JPanel pnsignup = new JPanel();
		pnsignup.add(lb1);
		pnsignup.add(lbsignup);
		pnsignup.add(lb);
		pnsignup.setLayout(new GridLayout(1,3));
		
		JPanel pntext = new JPanel();
		pntext.add(lbusername);
		pntext.add(tfusername);
		pntext.add(lbpassword);
		pntext.add(tfpassword);
		pntext.add(btforget);
		pntext.add(btsignup);
		pntext.setLayout(new GridLayout(3,2));
		
		Container cont =  f.getContentPane();
		cont.add(pnsignup, BorderLayout.NORTH);
		cont.add(pntext, BorderLayout.CENTER);
		
		lbsignup.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 40));
		pntext.setBackground(Color.WHITE);
		pnsignup.setBackground(Color.WHITE);
		lbsignup.setForeground(Color.PINK);
		lbusername.setForeground(Color.BLUE);
		lbpassword.setForeground(Color.BLUE);
		btforget.setForeground(Color.BLUE);
		btsignup.setForeground(Color.BLUE);
		btforget.setBackground(Color.LIGHT_GRAY);
		btsignup.setBackground(Color.LIGHT_GRAY);
		f.pack();
		f.setSize(500,200);
		f.setVisible(true);
		btsignup.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ConnectDBck connect = new ConnectDBck();
				//int record = connect.executeDB("Insert into AccManeger(Username,Password) values('"+tfusername.getText()+"','"+tfpassword.getText()+"')");
				new choose();
				f.dispose();
			}
		});
		btforget.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			new	forgot_pass();
			f.dispose();
				
			}
		});
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SignUp();
	}
	
	}
///////////////////////////////////////////////////////

	
	


class choose extends JFrame{
	JFrame f3 = new JFrame("Choose");
	JLabel lbchoose = new JLabel("Choose Object");
	JLabel lb = new JLabel();
	JLabel lb1 = new JLabel();
	JButton btcustomer = new JButton("Choose Customers");
	JButton btlandlords = new JButton("Choose Landlords");
	JButton bthouse = new JButton("Choose House");
	JButton btcancel = new JButton("Cancel");
	public choose() {
		JPanel pnchoose = new JPanel();
		pnchoose.add(lb);
		pnchoose.add(lbchoose);
		pnchoose.add(lb1);
		pnchoose.setBackground(Color.WHITE);
		pnchoose.setLayout(new GridLayout(1,3));
		f3.setLocation(300,20);
		f3.setLayout(new GridLayout(5,1));
		Container cont3 =  f3.getContentPane();
		
		cont3.add(pnchoose);
		cont3.add(btcustomer);
		cont3.add(btlandlords);
		cont3.add(bthouse);
		cont3.add(btcancel);
		lbchoose.setForeground(Color.BLUE);
		btcustomer.setBackground(Color.PINK);
		btcancel.setBackground(Color.PINK);
		bthouse.setBackground(Color.PINK);
		btlandlords.setBackground(Color.PINK);
		cont3.setBackground(Color.WHITE);
		lbchoose.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN,30));
		f3.pack();
		f3.setSize(550,200);
		f3.setVisible(true);
		btcustomer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new inforcustomer();
				f3.dispose();
			}
		});
		btlandlords.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new inforlandlords();
				f3.dispose();
			}
		});
		bthouse.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new inforhouse();
				f3.dispose();
			}
		});
		btcancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				f3.dispose();
			}
		});
	}
	
}



/*
 *	Object data[]= {rs.getString("CMNDcus"), rs.getString("FullName"),rs.getString("Birthday"),rs.getString("Gender"),rs.getString("HomeTown"),rs.getString("PhoneNumber"),rs.getString("Email"),rs.getString("TimeRental"),rs.getString("TimeStart"),rs.getString("IDHouse"),rs.getString("CMNDland")};    
	String column[] = {"CMNDcus", "FullName","Birthday","Gender","HomeTown",
				"PhoneNumber","Email","TimeRental","TimeStart","IDHouse","CMNDland"};		
			
 * 
 */
