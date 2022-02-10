package ck;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignUpCustomer {
	JFrame fcus= new JFrame("Sign Up for Customer");
	JLabel lbsignup = new JLabel("Sign Up");
	JLabel lb = new JLabel();
	JLabel lbusernamecus = new JLabel("Username Customer");
	JTextField tfusernamecus = new JTextField(15);
	JLabel lbpasswordcus = new JLabel("Password Customer");
	JPasswordField tfpasswordcus = new JPasswordField(15);
	JButton btforget = new JButton("Forgotten Password");
	JButton btsignup = new JButton("Sign Up");
	JButton btcreateacA = new JButton("Create Account");
	JButton btcancel = new JButton("Cancel");
	PreparedStatement ps;
	Connection conn;
	ResultSet rs;
	public SignUpCustomer() {
		fcus.setLocation(300,20);
		fcus.setLayout(new GridLayout(5,2));
		Container contc = fcus.getContentPane();
		contc.add(lbsignup);
		contc.add(lb);
		contc.add(lbusernamecus);
		contc.add(tfusernamecus);
		contc.add(lbpasswordcus);
		contc.add(tfpasswordcus);
		contc.add(btforget);
		contc.add(btsignup);
		contc.add(btcreateacA);
		contc.add(btcancel);
	
		fcus.setSize(400,200);
		fcus.setVisible(true);
		btcancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				fcus.dispose();
			}
		});
		btsignup.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new choose1();
				fcus.dispose();
			}
		});
		btcreateacA.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new newAccount();
				fcus.dispose();
				
			}
		});
		btforget.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new forgot_pass();
				fcus.dispose();
				
			}
		});
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SignUpCustomer();
	}
}
	
	class inforlandlords1 extends JFrame{
		JFrame f4 = new JFrame("Information Landlords");
		JLabel lbCMll = new JLabel("CMND");
		JTextField tfCMll = new JTextField(10);
		JLabel lbnamell = new JLabel("Full Name");
		JTextField tfnamell = new JTextField(10);
		JLabel lbaddressll = new JLabel("Address");
		JTextField tfaddressll = new JTextField(10);
		JLabel lbbirthdayll = new JLabel ("Birthday");
		JDateChooser dcbirthdayll = new JDateChooser();
		JLabel lbsdt = new JLabel("Phone Number");
		JTextField tfsdt = new JTextField(15);
		JButton btSee = new JButton ("See");
		JButton btfind = new JButton ("Find");
		JButton btback = new JButton("Back");
		PreparedStatement ps;
		Connection conn;
		ResultSet rs;
		public inforlandlords1() {
			f4.setLocation(300,20);
			f4.setLayout(new GridLayout(7,2));
			Container cont4 = f4.getContentPane();
			cont4.add(lbCMll);
			cont4.add(tfCMll);
			cont4.add(lbnamell);
			cont4.add(tfnamell);
			cont4.add(lbaddressll);
			cont4.add(tfaddressll);
			cont4.add(lbbirthdayll);
			cont4.add(dcbirthdayll);
			cont4.add(lbsdt);
			cont4.add(tfsdt);
			cont4.add(btSee);
			cont4.add(btfind);
			cont4.add(btback);
			f4.pack();
			f4.setSize(500,200);
			f4.setVisible(true);
			btback.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new choose1();
					f4.dispose();
				}
			});
			}
		}
	class inforhouse1 extends JFrame{
		JFrame f5 = new JFrame("Information House");
		JLabel lbID = new JLabel("ID House");
		JTextField tfID = new JTextField(10);
		JLabel lbaddressh = new JLabel("Address House");
		JTextField tfaddressh = new JTextField(10);
		JLabel lbarea = new JLabel("House Area");
		JTextField tfarea = new JTextField(10);
		JLabel lbdeposits = new JLabel("Deposits");
		JTextField tfdeposits = new JTextField(10);
		JButton btfind = new JButton ("Find");
		JButton btSee = new JButton ("See");
		JButton btback = new JButton("Back");
		PreparedStatement ps;
		Connection conn;
		ResultSet rs;
		public inforhouse1() {
			f5.setLocation(300,20);
			f5.setLayout(new GridLayout(6,2));
			Container cont5 = f5.getContentPane();
			cont5.add(lbID);
			cont5.add(tfID);
			cont5.add(lbaddressh);
			cont5.add(tfaddressh);
			cont5.add(lbarea);
			cont5.add(tfarea);
			cont5.add(lbdeposits);
			cont5.add(tfdeposits);
			cont5.add(btfind);
			cont5.add(btSee);
			cont5.add(btback);
			f5.pack();
			f5.setSize(500,200);
			f5.setVisible(true);
			btback.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new choose1();
					f5.dispose();
				}
			});
		}
	}
	class choose1 extends JFrame{
		JFrame f3 = new JFrame("Choose");
		JLabel lbchoose = new JLabel("Choose Object");
		JButton btcustomer = new JButton("Choose Customers");
		JButton btlandlords = new JButton("Choose Landlords");
		JButton bthouse = new JButton("Choose House");
		public choose1() {
			f3.setLocation(300,20);
			f3.setLayout(new GridLayout(4,1));
			Container cont3 =  f3.getContentPane();
			cont3.add(lbchoose);
			cont3.add(btcustomer);
			cont3.add(btlandlords);
			cont3.add(bthouse);
			f3.pack();
			f3.setSize(300,300);
			f3.setVisible(true);
			btcustomer.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new Inforcustomer1();
					f3.dispose();
				}
			});
			btlandlords.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new inforlandlords1();
					f3.dispose();
				}
			});
			bthouse.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new inforhouse1();
					f3.dispose();
				}
			});
			
		}
		
	}

// dùng cho customer
class forgot_pass1 extends JFrame {
	JFrame f = new JFrame("Forgotten Password");
	JLabel lbforgotpass = new JLabel("Forgotten Password");
	JLabel lb1 = new JLabel();
	JLabel lbfind = new JLabel("Find your acount");
	JTextField tffind = new JTextField(10);//Nhap username
	JButton btcancel = new JButton("Cancel");
	JButton btsearch = new JButton("Search");
	//frame 2
	JFrame f2 = new JFrame();
	JLabel lbsendcode = new JLabel("Send code your email");
	JTextField tfemail = new JTextField(10);
	//kiem tra email do co phai cua username khong
	JButton btContinue = new JButton ("Continue");
	JButton btBack = new JButton ("Back");
	//frame 3
	JFrame f3 = new JFrame();
	JLabel lbEnter = new JLabel("Enter code");
	JTextField tfenter = new JTextField(10);
	JButton btCancel3 = new JButton("Cancel");
	JButton btContinue3 = new JButton("Continue");
	PreparedStatement ps;
	Connection conn;
	ResultSet rs;
	public forgot_pass1() {
		f.setLocation(250,250);
		f.setLayout(new GridLayout(3,2));
		Container con = f.getContentPane();
		con.add(lbforgotpass);
		con.add(lb1);
		con.add(lbfind);
		con.add(tffind);
		con.add(btcancel);
		con.add(btsearch);
		f.pack();
		f.setSize(500,200);
		f.setVisible(true);
		btsearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jframe2();
				f.dispose();
			}
		});
		btcancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new forgot_pass1();
	}
	public void jframe2() {
		f2.setLocation(300,300);
		f2.setLayout(new GridLayout(2,2));
		Container con2 = f2.getContentPane();
		con2.add(lbsendcode);
		con2.add(tfemail);
		con2.add(btContinue);
		con2.add(btBack);
		f2.pack();
		f2.setSize(200,200);
		f2.setVisible(true);
		btContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				jframe3();
				f2.dispose();
			}
		});
		btBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				new forgot_pass();
				f2.dispose();
			}
		});
	}
	public void jframe3() {
		f3.setLocation(400,400);
		f3.setLayout(new GridLayout(2,2));
		Container con3 = f3.getContentPane();
		con3.add(lbEnter);
		con3.add(tfenter);
		con3.add(btCancel3);
		con3.add(btContinue3);
		f3.pack();
		f3.setSize(300,200);
		f3.setVisible(true);
		btCancel3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				f3.dispose();
			}
		});
		btContinue3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				//kiem tra code xem co dung voi code gui ve khong
				f3.dispose();
			}
		});
	}
}






